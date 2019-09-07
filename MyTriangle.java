import java.util.Arrays;
class MyPoint {
    private int x = 0;
    private int y = 0;
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return this.x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return this.y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY() {
        int[] ar = new int[2];
        ar[0] = x;
        ar[1] = y;
        return ar;
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "("+x+","+y+")";
    }
    public double distance(int x, int y){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    public double distance(MyPoint another){
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    public double distance(){
        int xDiff = this.x - 0;
        int yDiff = this.y - 0;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
}

class MyCircle {
    private MyPoint center = new MyPoint(0, 0);
    private int radius = 1;

    public MyCircle() {};
    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public MyPoint getCenter() {
        return this.center;
    }
    public void setCenter(MyPoint point) {
        this.center = point;
    }
    public int getCenterX() {
        return center.getX();
    }
    public void setCenterX(int x) {
        this.center.setX(x);
    }
    public int getCenterY() {
        return this.center.getY();
    }
    public void setCenterY(int y) {
        this.center.setY(y);
    }
    public int[] getCenterXY() {
        int[] ar = new int[2];
        ar[0] = this.center.getX();
        ar[1] = this.center.getY();
        return ar;
    }
    public void setCenterXY(int x, int y) {
        this.center.setX(x);
        this.center.setY(y);
    }
    public String toString() {
        return "MyCircle[radius=" + this.radius + ",[center=("+this.center.getX()+","+this.center.getY()+")]";
    }
    public double getArea() {
        return Math.PI*this.radius*this.radius;
    }
    public double getCircumference() {
        return 2*Math.PI*this.radius;
    }
    public double distance(MyCircle another) {
        return this.center.distance(another.center);
    }
 }

 public class MyTriangle {
    private int x1, x2, x3, y1, y2, y3; 
    private MyPoint v1 = new MyPoint(x1, y1);
    private MyPoint v2 = new MyPoint(x2, y2);
    private MyPoint v3 = new MyPoint(x3, y3);

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
    this.v1.setX(x1);
    this.v1.setY(y1);
    this.v2.setX(x2);
    this.v2.setY(y2);
    this.v3.setX(x3);
    this.v3.setX(y3);
    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public String toString() {
        return "MyTriangle[v1=" + Arrays.toString(v1.getXY()) + ", v2=" + Arrays.toString(v2.getXY()) + ", v3=" + Arrays.toString(v3.getXY()) + "]";
    }
    public String getType() {
        double d1 = v1.distance(v2);
        double d2 = v2.distance(v3);
        double d3 = v3.distance(v1);
        if(d1 == d2 && d2== d3 && d3 == d1) {
            return "Equilateral";
        }else if((d1 == d2 && d2 == d3) || (d2 == d3 && d3 == d1) || (d3 == d1 && d1 == d2)){
            return "Isosceles";
        }else{
            return "Scalene";
        }
    }

    public static void main(String[] args) {
        MyPoint v1 = new MyPoint(1, 5);
        MyPoint v2 = new MyPoint(3, 7);
        MyPoint v3 = new MyPoint(5, 9);
        MyTriangle t1 = new MyTriangle(v1, v2, v3);
        System.out.println(t1.getType());
    }
}