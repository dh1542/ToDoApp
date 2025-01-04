<template>
  <v-card class="mx-auto" width="600" id="card">
    <div id="task-list">
      <h2>Task List</h2>
      <ul>
        <li v-for="task in taskModel.state.tasks" :key="task.id">
          <TaskItem
            :taskName="task.name"
            :taskDescription="task.description"
            :taskDone="task.done"
          />
        </li>
      </ul>

      <!-- Add a button to refresh tasks -->
      <button @click="taskModel.refreshTasks">Refresh Tasks</button>
    </div>
  </v-card>
</template>

<script setup lang="ts">
import TaskModel from "@/models/taskModel";
import { onMounted } from "vue";

const taskModel = new TaskModel();
</script>

<style scoped>
#task-list {
  background-color: #de8552;
}
</style>
