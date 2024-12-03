package dominik.tech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/")
@Controller
public class ToDoAppController {
    @GetMapping("/health")
    @ResponseBody
    public String healthCheck() {
        System.out.printf("Health check\n");
        return "OK";
    }

}
