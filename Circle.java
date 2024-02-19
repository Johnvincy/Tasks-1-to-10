package Guvijavacodes;

public class Circle {

	private double radius;
    public Circle() {
        this.radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = 5;
    }
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
	public static void main(String[] args) {
		//Constructor with no arguments
		Circle circle1 = new Circle();
        System.out.println("Circle 1 Radius: " + circle1.getRadius());
        System.out.println("Circle 1 Circumference: " + circle1.calculateCircumference());

       //constructor with one argument
        Circle circle2 = new Circle(5.0);
        System.out.println("Circle 2 Radius: " + circle2.getRadius());
        System.out.println("Circle 2 Circumference: " + circle2.calculateCircumference());

	}
	private String getRadius() {
		return null;
	}

}
