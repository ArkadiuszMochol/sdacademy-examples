package pl.sdacademy.todolist.data;

import org.junit.jupiter.api.Test;
import pl.sdacademy.todolist.exception.TaskRepositoryException;
import pl.sdacademy.todolist.model.Task;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.mockito.Mockito.mock;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.when;

class TaskRepositoryTest {

    @Test
    void checkTaskAdditionTest() throws Exception {

        //given
        TaskRepository taskRepository = new TaskRepository();
        Task task = mock(Task.class);

        //when
        taskRepository.addTask(task);
        List<Task> allTasks = taskRepository.getTasks();

        //then
        assertThat(allTasks).hasSize(1);
    }

    @Test
    void checkCannotAddExistingTaskTest() throws Exception{

        //given
        TaskRepository taskRepository = new TaskRepository();
        Task task = mock(Task.class);
        when(task.getId()).thenReturn(123);

        //when
        taskRepository.addTask(task);
        Throwable thrown = catchThrowable(() -> taskRepository.addTask(task));
        List<Task> allTasks = taskRepository.getTasks();

        //then
        assertThat(allTasks).hasSize(1);
        assertThat(thrown).isInstanceOf(TaskRepositoryException.class);
    }

    @Test
    void testGetTaskById() throws Exception {
        //when
        TaskRepository taskRepository = new TaskRepository();

    }

}