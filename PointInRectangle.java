import java.util.Scanner;

public class PointInRectangle{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("This program will test whether a point is inside a rectangle");
		System.out.println(" with height 5 and width 10 centered at the origin.");
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		System.out.print("Point (" + x + ", " + y + ") is ");
		y = Math.abs(y);
		x = Math.abs(x);
		if (x > 5 || y > 2.5)
			System.out.print("not ");
		System.out.println("in the rectangle.");
	}
}