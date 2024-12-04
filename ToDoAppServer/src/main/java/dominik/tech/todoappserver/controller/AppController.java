package dominik.tech.todoappserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/app")
public class AppController {

    @GetMapping("/health")
    @ResponseBody
    public String healthCheck() {
        return "OK";
    }

}
