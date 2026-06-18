class Rectangle {
    // 1. Data Members
    private int height;
    private int width;

    // 2. Constructor
    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    // 3. New Concept: A method that RETURNS a value
    public int getArea() {
        return height * width; // Instead of printing, it hands the math result back
    }

    // 4. Display Method
    public void display() {
        System.out.println(height + ", " + width);
    }

    // 5. Execution
    public static void main(String[] x) {
        Rectangle r = new Rectangle(10, 5);
        r.display();
        
        // We call r.getArea() and attach it to our print statement
        System.out.println("Area: " + r.getArea()); 
    }
}