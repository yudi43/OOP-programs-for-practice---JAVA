class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public String toString() {
        return "Circle[radius = " + radius + " color = " + color + "]";
    }

 }

 public class TestCircle{
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("The circle has a radius of " + c1.getRadius() + " and area of  " + c1.getArea() + " and color is " + c1.getColor());
        System.out.println(c1.toString());

        Circle c2 = new Circle(2.0);
        System.out.println("The circle has a radius of " + c2.getRadius() + " and area of  " + c2.getArea());
        System.out.println(c2.toString());
    
        Circle c4 = new Circle();
        c4.setRadius(5.0);
        c4.setColor("Pink");
        System.out.println("radius is : " + c4.getRadius() + " and the color is " + c4.getColor());
        System.out.println(c4.toString());
        
    }
 }