package Patterns.AbstractFactory;

class FullTimeEmployeeFactory extends EmployeeFactory {
    public Employee createEmployee(String name, String department) {
        return new FullTimeEmployee(name, department, 15000);
    }
}
