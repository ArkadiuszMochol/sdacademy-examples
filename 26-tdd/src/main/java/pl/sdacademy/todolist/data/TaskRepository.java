package pl.sdacademy.todolist.data;

import pl.sdacademy.todolist.exception.TaskRepositoryException;
import pl.sdacademy.todolist.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) throws TaskRepositoryException {
      if(!tasks.contains(task)) {
            tasks.add(task);
      } else {
          throw new TaskRepositoryException("Cannot add task with existing ID!");
      }
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
