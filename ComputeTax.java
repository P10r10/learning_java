import java.util.Scanner;

public class ComputeTax{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("(0 - single, 1 - married jointly, 2 - married " +
			"separately, 3 - head of household)");
		System.out.print("Enter filing status: ");
		int status = input.nextInt();

		System.out.print(status);
		System.out.print(status);
		System.out.print(status);
		System.out.print(status);

		input.close();
	}
}
