package pl.sdacademy.todolist.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Task {

    private int Id;
    private String title;
    private String description;
    private LocalDate createdAt;
    private LocalDate deadline;

    public Task(int id, String title, String description, LocalDate createdAt, LocalDate deadline) {
        Id = id;
        this.title = title;
        this.description = description;
        this.createdAt = createdAt;
        this.deadline = deadline;
    }

    public int getId() {
        return Id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return "Task{" +
                "Id=" + Id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", deadline=" + deadline +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Id == task.Id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }

    private void test() {
        Task task1 = new Task(123,
                "Title",
                "Description",
                LocalDate.now(),
                LocalDate.now().plus(1, ChronoUnit.DAYS));

        Task task2 = new Task(123,
                "Title",
                "Description",
                LocalDate.now(),
                LocalDate.now().plus(1, ChronoUnit.DAYS));

        assert (task1 == task2);
        assert (task1.equals(task2));









    }
}
