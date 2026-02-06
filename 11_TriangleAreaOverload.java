

// Class for calculating area of triangle using method overloading
class AreaTriangle {
	// Area of equilateral triangle
	void area(float a) {
		double result = (Math.sqrt(3) / 4) * a * a;
		System.out.println("Area (equilateral): " + result);
	}

	// Area using base and height works for isosceles triangle as well
	void area(float base, float height) {
		double result = 0.5 * base * height;
		System.out.println("Area (base & height): " + result);
	}

	// Area using scalene triangle calculated using three sides length
	void area(float a, float b, float c) {
		double s = (a + b + c) / 2;
		double result = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		System.out.println("Area : " + result);
	}
}

// Main class to test area calculations
class FindAreaTriangle {
	public static void main(String args[]) {
		AreaTriangle triangle = new AreaTriangle();
		triangle.area(5);           // Equilateral triangle (one side needed)
		triangle.area(5, 6);        // Isosceles triangle (base and height)
		triangle.area(5, 6, 7);     // Scalene triangle (three sides)
	}
}
