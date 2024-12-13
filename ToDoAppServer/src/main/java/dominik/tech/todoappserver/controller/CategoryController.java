package dominik.tech.todoappserver.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/category")
public class CategoryController {

    @PostMapping("/create")
    @ResponseBody
    public void createCategory(@RequestHeader("name") String name, @RequestHeader("description") String description, @RequestHeader("color") String color) {
        try{

        } catch(Exception e){
            // Handle exception
        }

    }

    @PostMapping("/delete")
    public void deleteCategory() {
        // Delete a category
    }

    @PostMapping("/update")
    public void updateCategory() {
        // Update a category
    }

    @PostMapping("/read")
    public void readCategory() {
        // Read a category
    }
}
