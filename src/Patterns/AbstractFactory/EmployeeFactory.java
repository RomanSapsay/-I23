package Patterns.AbstractFactory;

abstract class EmployeeFactory {
    public abstract Employee createEmployee(String name, String department);
}
