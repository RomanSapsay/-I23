package Patterns.Prototype;

import java.util.HashMap;
import java.util.Map;

public class EmployeePrototypeMain {
    private static Map<String, EmployeePrototype> employeeMap = new HashMap<>();

    public static void loadCache() {
        // Assume some initial data in the employeeMap
        RegularEmployee regularEmployee = new RegularEmployee("Денис Кривенко");
        employeeMap.put("Звичайний", regularEmployee);

        ContractEmployee contractEmployee = new ContractEmployee("Артур Игнатенко");
        employeeMap.put("Контрактний", contractEmployee);
    }

    public static EmployeePrototype getEmployee(String type) {
        EmployeePrototype employeePrototype = employeeMap.get(type);
        return (EmployeePrototype) employeePrototype.clone();
    }

    public static void main(String[] args) {
        loadCache();

        // Retrieve and clone regular employee
        EmployeePrototype regularEmployee = getEmployee("Звичайний");
        System.out.println(regularEmployee);

        // Retrieve and clone contract employee
        EmployeePrototype contractEmployee = getEmployee("Контрактний");
        System.out.println(contractEmployee);
    }
}
