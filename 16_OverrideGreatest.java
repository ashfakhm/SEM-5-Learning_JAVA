// Find greatest of two or three numbers using method overriding
class GreatestOfTwo {
    int x, y;
    GreatestOfTwo(int x, int y) {
        this.x = x;
        this.y = y;
    }
    int greatest() {
        return (x > y) ? x : y;
    }
}

class GreatestOfThree extends GreatestOfTwo {
    int z;
    GreatestOfThree(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
        int greatest() {
            if (x >= y && x >= z) {
                return x;
            } else if (y >= x && y >= z) {
                return y;
            } else {
                return z;
            }
    }
}

public class ThirtyEight {
    public static void main(String[] args) {
        GreatestOfTwo two = new GreatestOfTwo(5, 10);
        GreatestOfThree three = new GreatestOfThree(10, 5, 25);
        System.out.println("Greatest of two: " + two.greatest());
        System.out.println("Greatest of three: " + three.greatest());
    }
}