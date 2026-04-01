package Lession10_8;

import java.util.*;

public class LibraryManager {
    // Sử dụng Set để đảm bảo không trùng ID
    private Set<Book> bookSet = new HashSet<>();

    // Thêm sách
    public void addBook(Book book) {
        if (bookSet.add(book)) {
            System.out.println("Thêm thành công: " + book.getTitle());
        } else {
            System.out.println("Lỗi: Mã sách " + book.getId() + " đã tồn tại!");
        }
    }

    // Lọc sách theo năm và trả về một List đã sắp xếp theo tên
    public List<Book> filterAndSort(int afterYear) {
        List<Book> filteredList = new ArrayList<>();

        // 1. Lọc sách xuất bản sau năm sau một năm nhất định
        for (Book b : bookSet) {
            if (b.getYear() > afterYear) {
                filteredList.add(b);
            }
        }

        // 2. Sắp xếp List theo tên sách (Title)
        // Sử dụng Comparator để so sánh chuỗi tên
        Collections.sort(filteredList, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getTitle().compareToIgnoreCase(b2.getTitle());
            }
        });

        return filteredList;
    }

    public void displayAll() {
        System.out.println("\n--- TỔNG KHO SÁCH HIỆN CÓ ---");
        for (Book b : bookSet) {
            System.out.println(b);
        }
    }
}