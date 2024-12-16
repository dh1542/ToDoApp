<template>
  <v-card class="mx-auto" width="500" id="task-creation-card">
    <v-container fluid id="task-creation-form">
      <v-responsive>
        <v-text-field
          v-model="taskName"
          hide-details="auto"
          label="Task Name"
        ></v-text-field>
      </v-responsive>
      <v-textarea
        v-model="taskDescription"
        label="Task Description"
        name="input-7-1"
        variant="filled"
        auto-grow
      ></v-textarea>
      <CreateTaskButton
        :task-name="taskName"
        :task-description="taskDescription"
      />
    </v-container>
  </v-card>
</template>

<script setup lang="ts">
import CreateTaskButton from "../task_creation/CreateTaskButton.vue";
import { ref } from "vue";

const taskName = ref("");
const taskDescription = ref("");
</script>

<style>
#task-creation-form {
  display: flex;
  flex-direction: column;
  width: 100%;
}

#task-creation-card {
  height: 19rem;
}
</style>
