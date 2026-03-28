package Session8_7;

public class Developer extends Employee {
    private String programmingLanguage;  //ngôn ngữ lập trình viên sử dụng

    public Developer() {
        super();
    }

    public Developer(String name, String id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Ghi đè getSalary: Ở bài tập này yêu cầu trả về lương cơ bản
    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    public String toString() {
        return "Developer [ID: " + getId() + ", Name: " + getName() +
                ", Salary: " + getSalary() + ", Language: " + programmingLanguage + "]";
    }
}