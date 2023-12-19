package Patterns.AbstractFactory;

public class Main {
    public static void main(String[] args) {

        EmployeeFactory fullTimeFactory = new FullTimeEmployeeFactory();
        Employee fullTimeEmployee = fullTimeFactory.createEmployee("Василь Марушевич", "Бухгалтерія");
        System.out.println("Full-time employee: " + fullTimeEmployee.getName() + ", " + fullTimeEmployee.calculateSalary());

        EmployeeFactory partTimeFactory = new PartTimeEmployeeFactory();
        Employee partTimeEmployee = partTimeFactory.createEmployee("Ганна Кручиніна", "Виробничій чех");
        System.out.println("Part-time employee: " + partTimeEmployee.getName() + ", " + partTimeEmployee.calculateSalary());
    }
}
