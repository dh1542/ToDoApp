package dominik.tech.todoappserver.controller;

import dominik.tech.todoappserver.entity.Task;
import dominik.tech.todoappserver.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/task")
public class TaskController {

    @Autowired
    TaskService taskService = new TaskService();

    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity<String> addTask(@RequestHeader("name") String name, @RequestHeader ("description") String description) {
        try{
            Task createdTask = taskService.createTask(name, description);
            return ResponseEntity.status(HttpStatus.CREATED).body("Created task with id: " + createdTask.getId());
        } catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to create task");
        }

    }

    @DeleteMapping("/delete")
    @ResponseBody
    public ResponseEntity<String> deleteTask(@RequestHeader("id") Long id) {
        try{
            taskService.deleteTask(id);
            return ResponseEntity.status(HttpStatus.OK).body("Deleted task with id: " + id);
        } catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to delete task");
        }
    }







}
