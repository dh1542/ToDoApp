import type { Task } from "@/types/Task";
import { reactive } from "vue";
import { inject } from "vue";

export default class TaskModel {
  private serverUrl = inject<string>("serverUrl");
  private allTaskEnpointUrl = "/api/task/all";

  constructor() {
    this.getAllTasks();
  }
  
  public state = reactive<{tasks: Task[]}>({
    tasks: [],
  })
  
  async getAllTasks(): Promise<Task[]> {
    try{
      const response = await fetch(this.serverUrl + this.allTaskEnpointUrl);
      if(!response.ok){
        throw new Error("Error fetching tasks");
      }
      const data: Task[] = await response.json();
      this.state.tasks = data;
      return data;
    }
    catch(error){
      console.error("Error fetching tasks", error);
      return [];
    }
  }

  async refreshTasks(): Promise<Task[]> {
    return this.getAllTasks();
  }
}

