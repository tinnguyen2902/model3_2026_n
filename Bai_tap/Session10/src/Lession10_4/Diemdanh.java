package Lession10_4;

import java.util.ArrayList;

public class Diemdanh implements Manager<Students> {
    public ArrayList<Students> students;
    public Diemdanh() {
        students = new ArrayList<>();
    }

    @Override
    public void add(Students student) {
        students.add(student);
    }

    @Override
    public void update(int index, Students student) {
        if (index >= 0 && index < students.size()) {
            students.set(index, student);
        }
    }

    @Override
    public void delete(int index) {
        if (index >= 0 && index < students.size()) {
            students.remove(index);
        }
    }

    @Override
    public void display() {
        if (students.isEmpty()) {
            System.out.println("Chưa có sinh viên nào trong danh sách.");
        } else {
            for (int i = 0; i < students.size(); i++) {
                System.out.println((i + 1) + ". " + students.get(i));
            }
        }
    }
}