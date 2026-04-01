package Lession10_8;

import java.util.Objects;

public class Book {
    private String id;
    private String title;
    private String author;
    private int year;

    public Book(String id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Ghi đè hashCode và equals để HashSet kiểm tra trùng lặp theo ID
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return String.format("ID: %-5s | Tên: %-20s | Tác giả: %-15s | Năm: %d",
                id, title, author, year);
    }

    // Getters
    public String getId() { return id; }
    public String getTitle() { return title; }
    public int getYear() { return year; }
}