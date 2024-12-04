package dominik.tech.todoappserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dominik.tech.todoappserver.entity.Task;


@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    saveTask(Ta)



}
