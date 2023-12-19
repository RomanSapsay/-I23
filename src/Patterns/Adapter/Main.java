package Patterns.Adapter;

public class Main {
    public static void main(String[] args) {
        LegacyEmployee legacyEmployee = new LegacyEmployee("В`ячеслав", "Ростовський", "v_rostik@gmail.com");
        Employee employee = new LegacyEmployeeAdapter(legacyEmployee);
        System.out.println("First name: " + employee.getFirstName());
        System.out.println("Last name: " + employee.getLastName());
        System.out.println("Email: " + employee.getEmail());
    }
}
