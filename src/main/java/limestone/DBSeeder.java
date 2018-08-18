package limestone;

import limestone.instances.Task;
import limestone.interfaces.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DBSeeder implements CommandLineRunner {

    private TaskRepository taskRepository;

    public DBSeeder(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public void run(String... strings) throws Exception {
//        Task task1 = new Task("Task Name 1", "Descrptn", "TODO");
//        Task task2 = new Task("Task Name 2", "Descrptn", "TODO");
//        Task task3 = new Task("Task Name 3", "Descrptn", "TODO");
//
//
//        // clean repository
//        this.taskRepository.deleteAll();
//
//        // add users
//        List<Task> tasksList = Arrays.asList(task1, task2, task3);
//        this.taskRepository.saveAll(tasksList);
    }


}
