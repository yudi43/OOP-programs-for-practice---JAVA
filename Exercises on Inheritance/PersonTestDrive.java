class Person {
    private String name;
    private String address;

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String toString() {
        return "Person[name="+this.name+", address="+this.address+"]";
    }
}

//A student IS-A person
class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.fee = fee;
        this.year = year;
    }

    public String getProgram() {
        return this.program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public double getFee() {
        return this.fee;
    }

    public void setFee(int fee){
        this.fee = fee;
    }

    public String toString() {
        return "Student["+super.toString()+", year="+ this.year + ", fee = "+this.fee+"]";
    }
}

//Staff IS-A person
class Staff extends Person{
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay){
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return this.school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay(){
        return this.pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
    public String toString() {
        return "Staff["+super.toString()+", school="+this.school+", pay="+ this.pay+"]";
    }
} 

// Test Staff and Student classes
public class PersonTestDrive{
    public static void main(String[] args) {
        Student s = new Student("Raj", "Building no. 4", "BE", 2, 322123.3265);
        Staff s2 = new Staff("Rakesh", "Building no. 6", "DPS", 65465);
        System.out.println(s.toString());
        System.out.println(s2.toString());
    }
}