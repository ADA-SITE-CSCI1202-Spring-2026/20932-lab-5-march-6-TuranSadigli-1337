public class MovableTest {

    // Method to move all Movable objects in an array (part f and g)
    public static void moveAll(Movable[] movables, String direction) {
        System.out.println("Moving all " + direction + ":");
        for (int i = 0; i < movables.length; i++) {
            switch(direction.toLowerCase()) {
                case "up":
                    movables[i].moveUp();
                    break;
                case "down":
                    movables[i].moveDown();
                    break;
                case "left":
                    movables[i].moveLeft();
                    break;
                case "right":
                    movables[i].moveRight();
                    break;
            }
            System.out.println("  " + movables[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== TESTING EXERCISE 6 ===\n");

        // Test 6b: Testing Point movements
        System.out.println("--- Testing Point (6b) ---");
        Point p = new Point(3, 4);
        System.out.println("Initial: " + p);

        p.moveUp();
        System.out.println("After moveUp: " + p);
        p.moveRight();
        System.out.println("After moveRight: " + p);
        p.moveDown();
        System.out.println("After moveDown: " + p);
        p.moveLeft();
        System.out.println("After moveLeft: " + p);

        // Test 6d: Testing Circle movements
        System.out.println("\n--- Testing Circle (6d) ---");
        Circle c = new Circle(5, 5, 10);
        System.out.println("Initial: " + c);

        c.moveUp();
        System.out.println("After moveUp: " + c);
        c.moveRight();
        System.out.println("After moveRight: " + c);
        c.moveDown();
        System.out.println("After moveDown: " + c);
        c.moveLeft();
        System.out.println("After moveLeft: " + c);

        System.out.println("\n--- Testing Array of Movable objects (6f & 6g) ---");

        // Create an array with mixture of Points and Circles
        Movable[] shapes = new Movable[4];
        shapes[0] = new Point(0, 0);
        shapes[1] = new Circle(10, 10, 5);
        shapes[2] = new Point(-5, -5);
        shapes[3] = new Circle(2, 3, 7);

        System.out.println("Initial positions:");
        for (Movable m : shapes) {
            System.out.println("  " + m);
        }

        // Move all in different directions
        System.out.println();
        moveAll(shapes, "up");
        System.out.println();
        moveAll(shapes, "right");
        System.out.println();
        moveAll(shapes, "down");
        System.out.println();
        moveAll(shapes, "left");

        System.out.println("\nFinal positions:");
        for (Movable m : shapes) {
            System.out.println("  " + m);
        }
    }
}