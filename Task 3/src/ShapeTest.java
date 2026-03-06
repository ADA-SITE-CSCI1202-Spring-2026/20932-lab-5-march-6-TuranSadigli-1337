// ShapeTest.java - Exercise 3 ONLY
public class ShapeTest {
    // Rectangle class
    static class Rectangle {
        int width, height;

        public Rectangle(int w, int h) {
            width = w;
            height = h;
        }

        public boolean equals(Object obj) {
            if (this == obj) return true;
            // Fix: obj == null, not obj != null
            if (obj == null || !(obj instanceof Rectangle)) return false;
            Rectangle rect = (Rectangle) obj;
            return this.width == rect.width && this.height == rect.height;
        }
    }

    // Square class extending Rectangle
    static class Square extends Rectangle {
        public Square(int side) {
            super(side, side);
        }
    }

    public static void main(String[] args) {
        // Test code for Exercise 3
        Object o1 = new Rectangle(5, 10);
        Object o2 = new Rectangle(15, 15);
        Object o3 = new Square(15);

        System.out.println("Objects are identical: " + o1.equals(o2));
        System.out.println("Objects are identical: " + o1.equals(o3));
        System.out.println("Objects are identical: " + o2.equals(o3));
    }
}