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

public class MyCircle {
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

    public static void main(String[] args){
        MyPoint p1 = new MyPoint(1, 6);
        MyCircle c1 = new MyCircle(p1, 6);
        System.out.println(Arrays.toString(c1.getCenterXY()));
    }
 }