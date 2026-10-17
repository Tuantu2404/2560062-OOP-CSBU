// Exercise 1: Rectangle Class - Basic Class Design
    class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height) {
        if (width > 0) {
            this.width = width;
        } else {
            this.width = 1.0;
        }
        
        if (height > 0) {
            this.height = height;
        } else {
            this.height = 1.0;
        }
    }

    public double area() {
        return this.width * this.height;
    }

    public double perimeter() {
        return 2 * (this.width + this.height);
    }

    public void displayInfo() {
        System.out.println("Rectangle [Width: " + this.width + 
                           ", Height: " + this.height + 
                           ", Area: " + this.area() + 
                           ", Perimeter: " + this.perimeter() + "]");
    }
}

    public class exercise1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(); 
        Rectangle r2 = new Rectangle(5.0, 3.0);
        Rectangle r3 = new Rectangle(-2.0, 4.0);

        System.out.println("Rectangle's Information:");
        r1.displayInfo();
        r2.displayInfo();
        r3.displayInfo();
    }
}