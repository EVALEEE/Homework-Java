package comp1110.homework.O04;

/**
 * @author EVA LEE
 * @version 1.0
 * @time 3/3/2024 3:21 pm
 */
public abstract class Shape {
    // stores information about simple shapes.
    double length;

    // xy-position of the center of each shape
    double x;
    double y;


    public abstract double perimeter();
    //return the length of the perimeter


    public abstract double area();
    //return the area of the shape

    public abstract boolean overlaps(Shape other);
    //takes a single Shape as an argument and returns true
    //if the other shape overlaps the shape it is called on.

    public static void main(String[] args) {
        Shape s1 = new Square(10);    // a square with sides of 10.0 units
        Shape s2 = new Circle(1.0);   // a circle of radius 1.0 units
        System.out.println(s1.perimeter());
        System.out.println(s1.area());
        System.out.println(s2.perimeter());
        System.out.println(s2.area());
    }
}

class Square extends Shape {
    public Square(double length) {
        this.length = length;
    }

    public Square(double length, double x, double y) {
        this.length = length;
        this.x = x;
        this.y = y;
    }

    @Override
    public double perimeter() {
        return length * 4;
    }

    @Override
    public double area() {
        return length * length;
    }

    @Override
    public boolean overlaps(Shape other) {
        if (other instanceof Square) {
            Square square = (Square) other;
            double halfDiagonalSum = (length + square.length) / 2.0;
            double distanceX = Math.abs(x - square.x);
            double distanceY = Math.abs(y - square.y);
            return distanceX < halfDiagonalSum && distanceY < halfDiagonalSum;
        } else if (other instanceof Circle) {
            Circle circle = (Circle) other;
            double halfSideLength = length / 2.0;
            double distanceX = Math.abs(x - circle.x);
            double distanceY = Math.abs(y - circle.y);
            double radiusSum = circle.length;
            return distanceX < (halfSideLength + radiusSum) && distanceY < (halfSideLength + radiusSum);
        }
        return false;
    }
}

class Circle extends Shape {

    public Circle(double length) {
        this.length = length;
    }

    public Circle(double length, double x, double y) {
        this.length = length;
        this.x = x;
        this.y = y;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * length;
    }

    @Override
    public double area() {
        return Math.PI * length * length;
    }

    @Override
    public boolean overlaps(Shape other) {
        if (other instanceof Circle) {
            Circle circle = (Circle) other;
            double distance = Math.sqrt(Math.pow(x - circle.x, 2) + Math.pow(y - circle.y, 2));
            return distance < (length + circle.length);
        } else if (other instanceof Square) {
            Square square = (Square) other;
            double halfSideLength = square.length / 2.0;
            double distanceX = Math.abs(x - square.x);
            double distanceY = Math.abs(y - square.y);
            double radiusSum = length;
            return distanceX < (halfSideLength + radiusSum) && distanceY < (halfSideLength + radiusSum);
        }
        return false;
    }
}