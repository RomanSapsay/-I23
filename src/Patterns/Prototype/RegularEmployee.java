package Patterns.Prototype;
class RegularEmployee implements EmployeePrototype {
    private final String name;

    public RegularEmployee(String name) {
        this.name = name;
    }

    @Override
    public EmployeePrototype clone() {
        return new RegularEmployee(this.name);
    }

    @Override
    public String toString() {
        return "Звичайний робітник: " + this.name;
    }
}

