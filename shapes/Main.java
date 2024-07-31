
public class Main {
    public static void main(String[] args) {
        Shape genericShape = new Shape("No Color");
        Circle circle = new Circle("Red", 5);
        Rectangle rectangle = new Rectangle("Blue", 4, 6);

        System.out.println("Generic Shape Area: " + genericShape.calculateArea());
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());

        System.out.println();

        genericShape.displayInfo();
        circle.displayInfo();
        rectangle.displayInfo();
        System.out.println();
        System.out.println("Overloaded Method for Rectangle Area: " + genericShape.calculateArea(4, 6));
        System.out.println("Overloaded Method for Circle Area: " + genericShape.calculateArea(5));
    }
}
