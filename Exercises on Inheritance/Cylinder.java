class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {};

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }

    public String toString() {
        return "Circle[radius="+this.radius+", color="+this.color+"]";
    }
}

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder(){
        super();
        height = 1.0;
    };

    public Cylinder(double radius) {
        super(radius);
    };

    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    };

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    ;}

    public double getHeight() {
        return this.height;
    };

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return getArea()*height;
    }

    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        c1.setRadius(54);

        System.out.println(c1.getRadius());
        System.out.println(c1.getHeight());
        System.out.println(c1.getVolume());
        System.out.println(c1.getArea());

    }
}