package dominik.tech.todoappserver.service;

import dominik.tech.todoappserver.entity.Task;
import dominik.tech.todoappserver.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    /**
     * Create a new task
     * @param name
     * @param description
     * @return
     */
    public Task createTask(String name, String description) {
        System.out.println("Creating task: " + name);
        Task task = new Task();
        task.setName(name);
        task.setDescription(description);
        task.setDone(false);
        return task;
    }

    /**
     * Save task to database
     * @param task
     * @return true if save was successful, false if otherwise
     */
    public boolean saveTaskToDB(Task task){
        try{
            //taskRepository.save(task);
        } catch(Exception e){
            return false;
        }

        return true;
    }
}
