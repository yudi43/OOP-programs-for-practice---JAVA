class Customer {
    private int ID;
    private String name;
    private int discount;

    public Customer(int ID, String name, int discount) {
        this.ID = ID;
        this.name = name;
        this.discount = discount;
    }

    public int getID() {
        return this.ID;
    }

    public String getName() {
        return this.name;
    }

    public int getDiscount() {
        return this.discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String toString() {
        return this.name + "(" + this.ID + ")";
    }
}

public class Invoice {
    private int ID;
    private Customer customer;
    private double amount;

    public Invoice(int ID, Customer customer, double amount) {
        this.ID = ID;
        this.customer = customer;
        this.amount = amount;
    }

    public int getID() {
        return this.ID;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return this.customer.getName();
    }

    public double getAmountAfterDiscount() {
        return this.amount - this.customer.getDiscount();
    }

    public static void main(String[] args) {
        Customer you = new Customer(112, "you", 300);
        Invoice i1 = new Invoice(19, you, 500);
        System.out.println(i1.getCustomerName());
    }
}