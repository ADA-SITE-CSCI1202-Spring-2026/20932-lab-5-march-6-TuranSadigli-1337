public class Circle implements Movable {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle(double x, double y, double radius) {
        this.center = new Point(x, y);
        this.radius = radius;
    }

    // Getters
    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
        System.out.println("Circle moved up: " + this);
    }

    @Override
    public void moveDown() {
        center.moveDown();
        System.out.println("Circle moved down: " + this);
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
        System.out.println("Circle moved left: " + this);
    }

    @Override
    public void moveRight() {
        center.moveRight();
        System.out.println("Circle moved right: " + this);
    }

    // Override toString
    @Override
    public String toString() {
        return "Circle[center=" + center + ", radius=" + radius + "]";
    }

    // Test the Circle movements
    public static void main(String[] args) {
        Circle c = new Circle(2, 3, 5);
        System.out.println("Starting circle: " + c);

        c.moveUp();     // Move circle up
        c.moveRight();  // Move circle right
        c.moveDown();   // Move circle down
        c.moveLeft();   // Move circle left

        System.out.println("Final circle: " + c);
    }
}