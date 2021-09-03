import java.util.Scanner;

public class VolumeOfCylinder{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the radius and lenght of a cylinder: ");
		double radius = input.nextDouble();
		double lenght = input.nextDouble();
		double area = Math.pow(radius, 2) * Math.PI;
		double volume = area * lenght;
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
	}
}