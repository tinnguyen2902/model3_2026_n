package Lession2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // tao List
        List<Student> students = Arrays.asList(
                new Student("Nguyen Van A",20,8.5),
                new Student("Nguyen Van A1",21,6.5),
                new Student("Nguyen Van A2",20,7.5),
                new Student("Nguyen Van A3",22,8.1),
                new Student("Nguyen Van A4",24,5.5),
                new Student("Nguyen Van A5",19,6.3),
                new Student("Nguyen Van A6",22,8.2),
                new Student("Nguyen Van A7",23,7.5),
                new Student("Nguyen Van A8",21,6.7),
                new Student("Nguyen Van A9",20,6.8)
        );
        List<Student> filteredStudents = students.stream()
                .filter(student -> student.getGrate()>7.0)
                .sorted(Comparator.comparing(Student::getName))
                .toList();
        //in ra màn hình
        System.out.println("Danh sách sinh viên có điểm lớn hơn 7.0,sắp xếo theo tên:");
        filteredStudents.forEach(Student::display);
    }
}