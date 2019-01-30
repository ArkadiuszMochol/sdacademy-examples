package pl.sdacademy.todolist.exception;

public class TaskRepositoryException extends Exception {

    public TaskRepositoryException() {
    }

    public TaskRepositoryException(String message) {
        super(message);
    }

    public TaskRepositoryException(String message, Throwable cause) {
        super(message, cause);
    }
}
