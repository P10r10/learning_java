import java.util.Scanner;

public class PointInCircle{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("This program will test whether a point is inside");
		System.out.println(" a circle with radius 10 centered at the origin.");
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		System.out.print("Point (" + x + ", " + y + ") is ");
		double distance = Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5);
		System.out.println(distance <= 10 ? "in the circle." : "not in the circle.");
	}
}