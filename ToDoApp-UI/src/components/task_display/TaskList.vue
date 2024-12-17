<template>
  <v-card
    class="mx-auto"
    prepend-icon="$vuetify"
    subtitle="The #1 Vue UI Library"
    width="600"
    id="card"
  >
  <div>
    <h2>Task List</h2>
    <ul>
      <li v-for="task in taskModel.state.tasks" :key="task.id">
        <strong>{{ task.name }}</strong>: {{ task.description }}
      </li>
    </ul>

    <!-- Add a button to refresh tasks -->
    <button @click="taskModel.refreshTasks">Refresh Tasks</button>
  </div>
  </v-card>
</template>

<script setup lang="ts">
import TaskModel from '@/models/taskModel';
import { onMounted } from 'vue';

const taskModel = new TaskModel();




</script>

<style scoped></style>
