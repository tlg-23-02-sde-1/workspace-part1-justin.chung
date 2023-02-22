package math.shape;

class ShapeClient {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(3, 4);
        shapes[2] = new Triangle(3,4);
        shapes[3] = new Triangle(1,1);
        for (Shape s : shapes) {
            System.out.println(s);
            System.out.println("Perimeter: " + s.perimeter());
            System.out.println("Area: " + s.area());
        }

        System.out.println("Circles: ");
        for (Shape s:shapes) {
            if (s instanceof Circle) {
                Circle c = (Circle) s;
                System.out.println(c);
            }
        }

        System.out.println("Rectangles: ");
        for (Shape s: shapes) {
            if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;
                System.out.println(r);
            }
        }

        System.out.println("Triangles: ");
        for (Shape s: shapes) {
            if (s instanceof Triangle) {
                Triangle t = (Triangle) s;
                System.out.println(t);
            }
        }
    }
}