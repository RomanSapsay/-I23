package Patterns.Singleton;

public class Employees {
    private static Employees instance;
    private String employeeName;
    private int employeeId;
    private Employees() {
        employeeName = "";
        employeeId = 0;
    }
    public static Employees getInstance() {
        // Create a new instance if it doesn't exist already
        if (instance == null) {
            instance = new Employees();
        }
        return instance;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public static void main(String[] args) {
        Employees employee1 = Employees.getInstance();
        employee1.setEmployeeName("Олег Слободян");
        employee1.setEmployeeId(62341);
        System.out.println("Employee Name: " + employee1.getEmployeeName());
        System.out.println("Employee ID: " + employee1.getEmployeeId());
    }
}
