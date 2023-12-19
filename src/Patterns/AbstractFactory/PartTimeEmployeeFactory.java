package Patterns.AbstractFactory;

class PartTimeEmployeeFactory extends EmployeeFactory {
    public Employee createEmployee(String name, String department) {
        return new PartTimeEmployee(name, department, 150, 40);
    }
}
