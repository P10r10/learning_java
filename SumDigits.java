import java.util.Scanner;

public class SumDigits{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number between 0 and 1000: ");
		int nb = input.nextInt();
		int sum = 0;
		sum += nb % 10;
		nb /= 10;
		sum += nb % 10;
		nb /= 10;
		sum += nb % 10;
		nb /= 10;
		System.out.println("The sum of the digits is " + sum);
	}
}