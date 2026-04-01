package Lession10_2;

import Lession10_2.Book;

import java.util.HashMap;

public class BookManager {
    private HashMap<String, Book> books;

    public BookManager() {
        books = new HashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.getBookname(), book);
    }

    public Book findBook(String bookName) throws Exception {
        if (!books.containsKey(bookName)) {
            throw new Exception("Sách không tồn tại!");
        }
        return books.get(bookName);
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("Chưa có sách nào trong danh sách.");
        } else {
            for (Book book : books.values()) {
                System.out.println(book);
            }
        }
    }
}