import java.util.Scanner;

public class PointInTriangle{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("This program will test whether a point is inside a right triangle");
		System.out.println(" with height 100 and width 200 centered at the origin (1st quadrant).");
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		System.out.print("Point (" + x + ", " + y + ") is ");
		if (x < 0 || y < 0 || y > (-0.5 * x + 100))
			System.out.print("not ");
		System.out.println("in the triangle.");
		input.close();
	}
}