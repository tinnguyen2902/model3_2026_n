package Session8_7;

public class Employee {
    // thuộc tính
        private String name;
        private String id;
        private double salary;

        // Constructor không tham số
        public Employee() {
        }

        // Constructor full tham số
        public Employee(String name, String id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        // Phương thức trả về lương cơ bản
        public double getSalary() {
            return salary;
        }

        // Phương thức tăng lương
        public void increaseSalary(double amount) {
            this.salary += amount;
        }

        // Getter/Setter
        public String getName() { return name; }
        public String getId() { return id; }

        @Override
        public String toString() {
            return "Employee [ID: " + id + ", Name: " + name + ", Salary: " + salary + "]";
        }
}