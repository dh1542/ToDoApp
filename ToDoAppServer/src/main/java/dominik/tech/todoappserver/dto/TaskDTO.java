package dominik.tech.todoappserver.dto;

public class TaskDTO {
    private Long id;
    private String name;
    private String description;
    private boolean done;

    public TaskDTO() {
    }

    public TaskDTO(Long id, String name, String description, boolean done) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.done = done;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return done;
    }
}
