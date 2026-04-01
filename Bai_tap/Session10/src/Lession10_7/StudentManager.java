package Lession10_7;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> studentList = new ArrayList<>();

    public void addStudent(Student s) {
        studentList.add(s);
    }

    public void displayAll() {
        if (studentList.isEmpty()) {
            System.out.println("Danh sách sinh viên đang trống.");
            return;
        }
        System.out.println("\n--- DANH SÁCH SINH VIÊN ---");
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    public void searchByName(String keyword) {
        boolean found = false;
        System.out.println("\nKết quả tìm kiếm cho '" + keyword + "':");
        for (Student s : studentList) {
            if (s.getName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(s);
                found = true;
            }
        }
        if (!found) System.out.println("Không tìm thấy sinh viên nào.");
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}