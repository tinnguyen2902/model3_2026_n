package Session8_7;

public class Manager extends Employee {
    private double bonus;
    public Manager() {
        super();
    }
    //construction
    public Manager(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    // Ghi đè phương thức getSalary: Lương cơ bản + Thưởng
    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public String toString() {
        return "Manager [ID: " + getId() + ", Name: " + getName() +
                ", Base Salary: " + super.getSalary() + ", Bonus: " + bonus +
                ", Total Salary: " + getSalary() + "]";
    }
}