package Patterns.Builder;

public class EmployeeBuilder {
    public static void main(String[] args) {
        Employee employee1 = new Employee.EmployeeBuilder("Myroslav", "Chernenko")
                .age(32)
                .mobilephone("+380635433111")
                .address("просп. Гагаріна, 3 Київ місто Київ 02000")
                .position("Shop manager")
                .salary(30000)
                .build();
        System.out.println(employee1);

        Employee employee2 = new Employee.EmployeeBuilder("Inna", "Symonenko")
                .age(24)
                .mobilephone("+380445723237")
                .address("просп. Гагаріна, 3 Київ місто Київ 02000")
                .position("Shop assistant")
                .salary(15000)
                .build();
        System.out.println(employee2);

        Employee employee3 = new Employee.EmployeeBuilder("Stanislav", "Sytnyk")
                .age(67)
                .mobilephone("n/a")
                .address("n/a")
                .position("Security officer")
                .salary(15000)
                .build();
        System.out.println(employee3);
    }
}
