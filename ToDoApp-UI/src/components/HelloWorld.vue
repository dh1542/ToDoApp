<template>
  <div id="header">
    <h1>ToDo-App</h1>
  </div>
  <div id="content">
    <div id="creation-content">
      <TaskCreationForm />
      <CategoryCreationForm />
    </div>

    <TaskList />
  </div>
</template>

<script setup lang="ts">
import CategoryCreationForm from "./creation/category_creation/CategoryCreationForm.vue";
import TaskCreationForm from "./creation/task_creation/TaskCreationForm.vue";
import TaskList from "./task_display/TaskList.vue";
</script>

<style>
#header {
  color: white;
  position: absolute;
  left: 50%;
  transform: translateX(-50%);
  padding: 1rem;
}

#content {
  position: absolute;
  margin-top: 5rem;
  height: 100%;
  width: 100%;
  display: flex;
  flex-direction: row;
}

#creation-content {
  display: flex;
  flex-direction: column;
  width: 50%;
  gap: 1rem;
}
</style>
