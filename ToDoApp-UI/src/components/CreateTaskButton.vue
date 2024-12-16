<template>
  <v-btn
    color="primary"
    dark
    fab
    fixed
    bottom
    right
    @click="() => createTask()"
  >
    <template v-slot:prepend>
      <v-icon color="#ffffff" icon="mdi-plus" size="large"></v-icon>
    </template>

    Add Task</v-btn
  >
</template>

<script setup lang="ts">
import { inject } from "vue";
import { defineProps } from "vue";

const serverUrl: string = inject<string>("serverUrl") + "/api/task/create";

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

function createTask() {
  console.log("Task Name: ", props.taskName);
  console.log("Task Description: ", props.taskDescription);

  // TODO: Call rest api and create task
}
</script>

<style></style>
