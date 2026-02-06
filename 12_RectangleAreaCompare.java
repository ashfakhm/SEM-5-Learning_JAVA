
// Class representing a rectangle
class Rectangle {
    int length;
    int breadth;

    // Constructor
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    int area() {
        return length * breadth;
    }

    // Method to compare area with another rectangle
    void compareArea(Rectangle other) {
        int area1 = this.area();
        int area2 = other.area();
        if (area1 > area2) {
            System.out.println("First rectangle has a larger area.");
        } else if (area1 < area2) {
            System.out.println("Second rectangle has a larger area.");
        } else {
            System.out.println("Both rectangles have the same area.");
        }
    }
}

// Main class to test rectangle area comparison
class CompareArea {
    public static void main(String args[]) {
        Rectangle r1 = new Rectangle(5, 3);
        Rectangle r2 = new Rectangle(4, 3);
        r1.compareArea(r2);
    }
}
