package dominik.tech.todoappserver.service;

import dominik.tech.todoappserver.entity.Category;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    public Category createCategory(String name, String description, String color) {
        Category category = new Category();
        category.setName(name);
        category.setDescription(description);
        category.setColor(color);
        return category;
    }

}
