import java.util.Scanner;

public class DecimalToHex{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal value (0 to 15): ");
		int value = input.nextInt();
		if (value >= 0 && value <= 15)
			System.out.printf("The hex value is %X", value);
		else
			System.out.printf("%d is an invalid input", value);
		input.close();
	}
}