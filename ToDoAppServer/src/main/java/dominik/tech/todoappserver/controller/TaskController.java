package dominik.tech.todoappserver.controller;

import dominik.tech.todoappserver.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/task")
public class TaskController {

    @Autowired
    TaskService taskService = new TaskService();

    @GetMapping("/health")
    @ResponseBody
    public String healthCheck() {
        System.out.printf("Health check\n");
        return "OK";
    }

    @GetMapping("/addTask")
    @ResponseBody
    public String addTask() {
        taskService.createTask("Task 1", "Description 1");
        return "Task added";
    }

}
