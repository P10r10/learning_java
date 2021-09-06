import java.util.Scanner;

public class SolveQuadraticEquations{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double discriminant = Math.pow(b, 2) - 4 * a * c;
		if (discriminant < 0)
			System.out.println("The equation has no real roots");
		else if (discriminant == 0)
			System.out.println("The equation has one real root: " + (-b / (2 * a)));
		else{
			System.out.print("The equation has two real roots:");
			System.out.print(" " + ((-b + Math.pow(discriminant, 0.5))/ (2 * a)));
			System.out.println(" " + ((-b - Math.pow(discriminant, 0.5))/ (2 * a)));
		}
		input.close();
	}
}