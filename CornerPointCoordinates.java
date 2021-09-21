import java.util.Scanner;

public class CornerPointCoordinates{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius of the bounding circle: ");
		double r = input.nextDouble();
		System.out.println("The coordinates of five points on the pentagon are ");
		double angle = Math.PI / 2;
		double step = Math.PI * 2 / 5;
		double x = r * Math.cos(angle);
		double y = r * Math.sin(angle);
		System.out.printf("(%.4f, %.4f\n", x, y);
		angle -= step;
		x = r * Math.cos(angle);
		y = r * Math.sin(angle);
		System.out.printf("(%.4f, %.4f\n", x, y);
		angle -= step;
		x = r * Math.cos(angle);
		y = r * Math.sin(angle);
		System.out.printf("(%.4f, %.4f\n", x, y);
		angle -= step;
		x = r * Math.cos(angle);
		y = r * Math.sin(angle);
		System.out.printf("(%.4f, %.4f\n", x, y);
		angle -= step;
		x = r * Math.cos(angle);
		y = r * Math.sin(angle);
		System.out.printf("(%.4f, %.4f\n", x, y);
	}
}