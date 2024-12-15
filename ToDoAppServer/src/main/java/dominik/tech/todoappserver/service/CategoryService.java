package dominik.tech.todoappserver.service;

import dominik.tech.todoappserver.entity.Category;
import dominik.tech.todoappserver.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category createCategory(String name, String description, String color) {
        Category category = new Category();
        category.setName(name);
        category.setDescription(description);
        category.setColor(color);
        saveCategoryToDB(category);
        return category;
    }

    public void deleteCategory(Long id){
        categoryRepository.deleteById(id);
    }

    public Category getCategory(Long id){
        return categoryRepository.findById(id).get();
    }

    public boolean saveCategoryToDB(Category category){
        try{
            categoryRepository.save(category);
        } catch(Exception e){
            return false;
        }

        return true;
    }

}
