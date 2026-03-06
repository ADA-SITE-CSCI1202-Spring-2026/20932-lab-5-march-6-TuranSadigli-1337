// Rectangle.java - Exercise 2 ONLY
public class Rectangle {
    int width, height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Rectangle)) {
            return false;
        }
        Rectangle rect = (Rectangle) obj;
        return this.width == rect.width && this.height == rect.height;
    }

    public static void main(String[] args) {
        // Test code for Exercise 2
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(15, 10);
        Rectangle r3 = new Rectangle(5, 10);

        System.out.println(r1.equals(r2)); // false
        System.out.println(r1.equals(r3)); // true
    }
}