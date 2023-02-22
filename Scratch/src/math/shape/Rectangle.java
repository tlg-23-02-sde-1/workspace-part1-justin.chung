package math.shape;

class Rectangle implements Shape {
    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public double area() {
        return length * width;
    }

    public String toString() {
        return "Rectangle with length " + length + " and width " + width;
    }
}