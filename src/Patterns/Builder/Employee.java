package Patterns.Builder;

public class Employee {
    private final String name;
    private final String surname;
    private final int age;
    private final String mobilephone;
    private final String address;
    private final String position;
    private final int salary;

    private Employee(EmployeeBuilder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
        this.mobilephone = builder.mobilephone;
        this.address = builder.address;
        this.position = builder.position;
        this.salary = builder.salary;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }
    public String getMobilephone() {
        return mobilephone;
    }
    public String getAddress() {
        return address;
    }
    public String getPosition() {
        return position;
    }
    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee: "+this.name+", "+this.surname+", "+this.age+", "+this.mobilephone+", "+this.address+", "+this.position+", "+this.salary;
    }

    public static class EmployeeBuilder
    {
        private final String name;
        private final String surname;
        private int age;
        private String mobilephone;
        private String address;
        private String position;
        private int salary;

        public EmployeeBuilder(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }
        public EmployeeBuilder age(int age) {
            this.age = age;
            return this;
        }
        public EmployeeBuilder mobilephone(String mobilephone) {
            this.mobilephone = mobilephone;
            return this;
        }
        public EmployeeBuilder address(String address) {
            this.address = address;
            return this;
        }
        public EmployeeBuilder position(String position) {
            this.position = position;
            return this;
        }
        public EmployeeBuilder salary(int salary) {
            this.salary = salary;
            return this;
        }
        public Employee build() {
            Employee employee =  new Employee(this);
            validateUserObject(employee);
            return employee;
        }
        private void validateUserObject(Employee employee) {
        }
    }
}
