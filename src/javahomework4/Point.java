package javahomework4;

public class Point {
    /*
    Write a class with the name Point. The class needs two
fields (instance variables) with name x and y of type int.
Find the distance between two points.

     */
    int x, y;

    public Point() {

    }
public Point(int x, int y) {
        this.x = x;
        this.y = y;

}
public int getX() {
        return x;
}
public int getY() {
        return y;
}
public void setX(int x) {
        this.x = x;
}
public void setY(int y) {
        this.y = y;
}
    // Method to calculate distance from this point to (0, 0)
public double distance() {
    return Math.sqrt(x * x + y * y);
}
    // Method to calculate distance from this point to (x, y)
public double distance( int x,int y) {
    int deltaX = this.x - x;
    int deltaY = this.y - y;
    return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
}
    // Method to calculate distance from this point to another Point
    public double distance(Point another) {
        int deltaX = this.x - another.x;
        int deltaY = this.y - another.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
}

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());

    }
}
