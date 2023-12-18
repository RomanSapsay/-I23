package Patterns.Prototype;
class ContractEmployee implements EmployeePrototype {
    private final String name;

    public ContractEmployee(String name) {
        this.name = name;
    }

    @Override
    public EmployeePrototype clone() {
        return new ContractEmployee(this.name);
    }

    @Override
    public String toString() {
        return "Контрактний робітник: " + this.name;
    }
}
