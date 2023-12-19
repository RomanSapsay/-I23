package Patterns.AbstractFactory;

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, String department, double monthlySalary) {
        super(name, department);
        this.monthlySalary = monthlySalary;
    }

    public double calculateSalary() {
        return monthlySalary;
    }
}
