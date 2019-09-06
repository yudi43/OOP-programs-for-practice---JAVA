class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    //check if 'this' works here
    public String getName() {
        return this.firstName + this.lastName;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //check if 'this' works here
    public int getAnnualSalary() {
        return this.salary*12;
    }

    public int raiseSalary(int percent) {
        return (salary/100)*percent;
    }

    public String toString() {
        return "Employee[id = " + this.id + ", name = " + this.firstName + " " + this.lastName + ", salary = " + this.salary + "]";
    }
}

public class TestEmployeeClass {
    public static void main(String[] args) {
        Employee e1 = new Employee(1234, "Bill", "Gates", 100000);
        System.out.println(e1.getAnnualSalary());
        System.out.println(e1.raiseSalary(20));

        
        System.out.println(e1.toString());
    }
}

