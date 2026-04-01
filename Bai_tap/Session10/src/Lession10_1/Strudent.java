package Lession10_1;

public class Strudent {
        private String name;
        private int age;
        private double diemTB;

        public Strudent(String name, int age, double diemTB) {
                this.name = name;
                this.age = age;
                this.diemTB = diemTB;
        }

        public String getName() {
                return name;
        }

        public int getAge() {
                return age;
        }

        public double getDiemTB() {
                return diemTB;
        }

        @Override
        public String toString() {
                return "Tên: " + name + ", Tuổi: " + age + ", Điểm trung bình: " + diemTB;
        }
}