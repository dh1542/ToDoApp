package dominik.tech.todoappserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "dominik.tech.entity")
public class ToDoAppServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToDoAppServerApplication.class, args);
    }

}
