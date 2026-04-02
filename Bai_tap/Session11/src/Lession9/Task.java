package Lession9;

import java.time.LocalDate;

public class Task {
    private int id;
    private String title;
    private User assignedTo;
    private LocalDate dueDate;
    private boolean completed;

    public Task(int id, String title, User assignedTo, LocalDate dueDate, boolean completed) {
        this.id = id;
        this.title = title;
        this.assignedTo = assignedTo;
        this.dueDate = dueDate;
        this.completed = completed;
    }

    public String getTitle() { return title; }
    public User getAssignedTo() { return assignedTo; }
    public LocalDate getDueDate() { return dueDate; }
    public boolean isCompleted() { return completed; }

    @Override
    public String toString() {
        return String.format("Task: %-20s | Deadline: %s | Status: %s | PIC: %s",
                title, dueDate, (completed ? "Xong" : "Đang làm"), assignedTo.getName());
    }
}