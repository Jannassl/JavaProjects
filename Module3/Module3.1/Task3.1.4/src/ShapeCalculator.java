public class ShapeCalculator {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5,"red");
        shapes[1] = new Rectangle(4, 6,"Green");
        shapes[2] = new Triangle(3, 8,"Yellow");

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("Circle Area: " + shape.calculateArea()+ "Color: "+shape.getColor());
            } else if (shape instanceof Rectangle) {
                System.out.println("Rectangle Area: " + shape.calculateArea()+ "Color: "+shape.getColor());
            } else if (shape instanceof Triangle) {
                System.out.println("Triangle Area: " + shape.calculateArea()+ "Color: "+shape.getColor());
            }
        }
    }
}