package dominik.tech.todoappserver.controller;


import dominik.tech.todoappserver.entity.Category;
import dominik.tech.todoappserver.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService = new CategoryService();

    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity<String> createCategory(@RequestHeader("name") String name, @RequestHeader("description") String description, @RequestHeader("color") String color) {
        try{
            Category category = new Category();
            category.setName(name);
            category.setDescription(description);
            category.setColor(color);
            categoryService.saveCategoryToDB(category);
            return ResponseEntity.status(HttpStatus.CREATED).body("Created category with id: " + category.getId());
        } catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to create category");
        }
    }

    @DeleteMapping("/delete")
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
