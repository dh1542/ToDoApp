package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ToDoAppController {
    @GetMapping("/health")
    @ResponseBody
    public String healthCheck() {
        return "The ToDo App is up and running!";
    }

}
