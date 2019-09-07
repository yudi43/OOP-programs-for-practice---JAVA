import java.util.*;

class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public char getGender() {
        return this.gender;
    }
    public String toString() {
        return "Author[name = " + this.name + ", email = " + this.email + ", gender = " + this.gender + "]";
    }
}


class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
    public String getName() {
        return this.name;
    }
    public String getAuthors() {
        return Arrays.toString(this.authors);
    }
    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQty(){
        return this.qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public String toString() {
        return "[name = " + this.name + ", " + Arrays.toString(authors) + ", price = " + this.price + ", qty = " + this.qty + "]";
    }
    public String getAuthorName() {
        return this.authors + this.authors[0].getName();
    }
}

public class BookTest {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        Author yudi = new Author("Yudi", "singh.yudi10@gmail.com", 'm');
        Author pudi = new Author("pudi", "singh.pudi10@gmail.com", 'm');
        authors[0] = yudi;
        authors[1] = pudi;

        Book b1 = new Book("Book1", authors, 12.0);

        System.out.println(b1.toString());
        // System.out.println(b1.getAuthors());

    }
}