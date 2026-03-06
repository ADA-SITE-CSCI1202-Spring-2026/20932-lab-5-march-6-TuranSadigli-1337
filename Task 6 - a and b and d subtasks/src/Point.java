public class Point implements Movable {
    private double x;
    private double y;

    // Constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Setters (optional, but useful)
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void moveUp() {
        y += 1; // Move up by 1 unit
        System.out.println("Moving up: New position = " + this);
    }

    @Override
    public void moveDown() {
        y -= 1;
        System.out.println("Moving down: New position = " + this);
    }

    @Override
    public void moveLeft() {
        x -= 1;
        System.out.println("Moving left: New position = " + this);
    }

    @Override
    public void moveRight() {
        x += 1;
        System.out.println("Moving right: New position = " + this);
    }

    // Override toString
    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        Point p = new Point(3, 4);
        System.out.println("Starting point: " + p);

        p.moveUp();    // y increases
        p.moveRight(); // x increases
        p.moveDown();  // y decreases
        p.moveLeft();  // x decreases

        System.out.println("Final point: " + p);
    }
}