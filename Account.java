class Customer {
    private int ID;
    private String name;
    private char gender;

    public Customer(int ID, String name, char gender) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }

    public int getID() {
        return this.ID;
    }

    public String getName() {
        return this.name;
    }

    public char getGender () {
        return this.gender;
    }

    public String toString() {
        return this.name + "(" + this.ID + ")";
    }
}

public class Account {
    private int id;
    private Customer customer;
    private double balance = 0.0; 

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }
    public int getID() {
        return this.id;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    public double getBalance() {
        return this.balance;
    }
    public String getCustomerName() {
        return this.customer.getName();
    }
    public double deposit(double amount) {
        this.balance = this.balance + amount;
        return this.balance;
    }
    public double withdraw(double amount) {
        double finalAmount = this.balance - amount;
        return finalAmount;
    }

    public static void main(String[] args) {
        Customer you = new Customer(1234, "you", 'm');
        Account a1 = new Account(4, you);
        a1.deposit(1456.13);
        System.out.println(a1.balance);
    }   
}

