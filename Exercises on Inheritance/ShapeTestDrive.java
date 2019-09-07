class Shape {
    private String color;
    private boolean filled = true;

    public Shape(){};

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    };

    public String getColor () {
        return this.color;
    };
    public void setColor(String color) {
        this.color = color;
    };
    public boolean isfilled() {
        return this.filled;
    };
    public void setFilled(boolean filled) {
        this.filled = filled;
    };
    public String toString(){
        return "Shape[color="+this.color+", filled="+this.filled+"]";
    };
}

class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {};

    public Circle(double radius) {
        super();
        this.radius = radius;
    };

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    };

    public double getRadius() {
        return this.radius;
    };

    public void setRadius(double radius) {
        this.radius = radius;
    };

    public double getArea() {
        return this.radius*this.radius*Math.PI;
    };

    public double getPerimeter() {
        return 2*Math.PI*this.radius;
    };

    public String toString() {
        return "Circle[radius="+this.radius+super.toString()+"]";
    }
}

class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;
    
    public Rectangle() {
        super();
    };

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    };

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    };

    public double getWidth() {
        return this.width;
    };

    public void setWidth(double width) {
        this.width = width;
    };

    public double getLength() {
        return this.length;
    };

    public void setLength(double length) {
        this.length = length;
    };

    public double getArea() {
        return this.length*this.width;
    };

    public double getPerimeter() {
        return 2*this.length*this.width;
    };

    public String toString() {
        return "Rectangle[length="+this.length+", width = "+this.width+super.toString();
    }
}

class Square extends Rectangle {
    // private double side = 1.0;
    public Square(){
        super();
    };
    public Square(double side) {
        super(side, side);
    };
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    };
    public String toString() {
        return "Square["+super.toString();
    }
}

public class ShapeTestDrive {
    public static void main(String[] args) {
        Square s = new Square(12);
        Square s1 = new Square(12, "red", true);
        System.out.println(s.toString());
        System.out.println(s1.toString());
    }
}