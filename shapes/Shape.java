
public class Shape {
    protected String color;
    public Shape(String color) {
        this.color = color;
    }
    public double calculateArea() {
        return 0;
    }
    public void displayInfo() {
        System.out.println("Shape color: " + color);
    }
    public double calculateArea(double length, double width) {
        return length * width;
    }
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}
