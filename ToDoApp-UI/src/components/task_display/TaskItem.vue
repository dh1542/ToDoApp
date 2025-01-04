<template>
  <div id="item-box">
    <div id="task-name">{{ props.taskName }}</div>
    <div>{{ props.taskDescription }}</div>
    <div>{{ props.taskDone }}</div>
  </div>
</template>

<script setup lang="ts">
const props = defineProps({
  taskName: {
    type: String,
    required: true,
  },
  taskDescription: {
    type: String,
    required: true,
  },
  taskDone: {
    type: Boolean,
    required: true,
  },
});
</script>
<style scoped>
#item-box {
  background-color: #5e8a5c;
  height: 60px;
  padding: 1rem;
  margin: 1rem;
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  
}

#task-name {
  font-size: 1.5rem;
}
</style>
