package limestone;

import limestone.instances.Task;
import limestone.interfaces.TaskRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("/all")
    public List<Task> getAll() {
        List<Task> tasks = this.taskRepository.findAll();

        return tasks;
    }

    @PutMapping
    public void insert(@RequestBody Task task){
        this.taskRepository.insert(task);
    }

    @PostMapping
    public void update(@RequestBody Task task){
        this.taskRepository.save(task);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id){
        this.taskRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Optional<Task> getById(@PathVariable("id") String id){
        Optional<Task> task = this.taskRepository.findById(id);

        return task;
    }

    @GetMapping("/status/{status}")
    public List<Task> getByStatus(@PathVariable("status") String status){
        List<Task> list = this.taskRepository.getByStatus(status);

        return list;
    }
}
