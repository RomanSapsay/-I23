package Patterns.Adapter;

class LegacyEmployeeAdapter implements Employee {
    private LegacyEmployee employee;
    public LegacyEmployeeAdapter(LegacyEmployee employee) {
        this.employee = employee;
    }
    public String getFirstName() {
        return employee.getFirstName();
    }
    public String getLastName() {
        return employee.getLastName();
    }
    public String getEmail() {
        return employee.getEmailAddress();
    }
}
