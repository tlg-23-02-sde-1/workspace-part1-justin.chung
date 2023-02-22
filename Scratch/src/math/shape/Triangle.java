package math.shape;

class Triangle implements Shape{
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double perimeter() {
        return height + base + Math.sqrt(height * height + base * base);
    }

    public double area() {
        return height * base / 2;
    }

    public String toString() {
        return "Triangle with height " + height + " and base " + base;
    }
}