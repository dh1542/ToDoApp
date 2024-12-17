<template>
  <v-tooltip
    location="start"
    :disabled="isTaskCreateable()"
    text="A Task name is required"
  >
    <template v-slot:activator="{ props }">
      <div v-bind="props" class="d-inline-block">
        <v-btn
          color="primary"
          dark
          fab
          fixed
          bottom
          right
          :disabled="!isTaskCreateable()"
          @click="() => createTask()"
        >
          <template v-slot:prepend>
            <v-icon color="#ffffff" icon="mdi-plus" size="large"></v-icon>
          </template>
          Add Task</v-btn
        >
      </div>
    </template>
  </v-tooltip>
</template>

<script setup lang="ts">
import { inject } from "vue";
import { defineProps } from "vue";

const serverUrl: any = inject<string>("serverUrl");
const createUrl: string = "/api/task/create";

const props = defineProps({
  taskName: {
    type: String,
    required: true,
  },
  taskDescription: {
    type: String,
    required: true,
  },
});

function isTaskCreateable(): boolean {
  return props.taskName.length > 0;
}

async function createTask(): Promise<string> {
  console.log("Task Name: ", props.taskName);
  console.log("Task Description: ", props.taskDescription);

  const headers: Headers = new Headers();

  headers.set("Content-Type", "application/json");
  headers.set("name", props.taskName);
  headers.set("description", props.taskDescription);

  const request: RequestInfo = new Request(serverUrl + createUrl, {
    method: "POST",
    headers: headers,
  });

  return fetch(request)
    .then((response: Response) => {
      if (response.ok) {
        return response.text();
      } else {
        throw new Error("Failed to create task");
      }
    })
    .then((data: any) => {
      console.log(data);
      return "Task created successfully";
    })
    .catch((error: Error) => {
      console.error(error);
      return "Failed to create task";
    });
}
</script>

<style scoped>

</style>
