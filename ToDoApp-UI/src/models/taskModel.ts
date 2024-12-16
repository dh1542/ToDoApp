import { ref } from "vue";

export default function useTask() {
  const tasks = ref([]);

  const fetchTasks = async () => {
    const response = await fetch("http://localhost:8080/tasks");
    tasks.value = await response.json();
  };
  return { tasks, fetchTasks };
}
