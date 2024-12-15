package dominik.tech.todoappserver.controller;

import dominik.tech.todoappserver.entity.Category;
import dominik.tech.todoappserver.repository.CategoryRepository;
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

    @Autowired
    private CategoryRepository categoryRepository;

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
    public ResponseEntity<String> deleteCategory(@RequestHeader("id") Long id) {
        try{
            categoryService.deleteCategory(id);
            return ResponseEntity.status(HttpStatus.OK).body("Deleted category with id: " + id);
        }
        catch(Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to delete category");
        }
    }

    @PutMapping("/update")
    @ResponseBody
    public ResponseEntity<String> updateTask(@RequestHeader("id") Long id, @RequestHeader("name") String name, @RequestHeader("description") String description, @RequestHeader("color") String color) {
        try{
            Category task = categoryService.getCategory(id);
            task.setName(name);
            task.setDescription(description);
            task.setColor(color);
            categoryService.saveCategoryToDB(task);
            return ResponseEntity.status(HttpStatus.OK).body("Updated category with id: " + id);
        } catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to update category");
        }
    }

    @GetMapping("/read")
    @ResponseBody
    public ResponseEntity<String> readCategory(@RequestHeader("id") Long id) {
        try{
            Category task = categoryService.getCategory(id);
            return ResponseEntity.status(HttpStatus.OK).body("Task with id: " + id + " has name: " + task.getName() + " and description: " + task.getDescription());
        } catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to read category");
        }
    }
}
