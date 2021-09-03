import java.util.Scanner;

public class CompoundValue{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the monthly saving ammount: ");
		double ammount = input.nextDouble();
		double total = 0;
		double interestRate = 1.00417;
		total = ammount * interestRate;
		total = (total + ammount) * interestRate;
		total = (total + ammount) * interestRate;
		total = (total + ammount) * interestRate;
		total = (total + ammount) * interestRate;
		total = (total + ammount) * interestRate;
		System.out.println("After the sixth month, the account value is " + total);
		input.close();
	}
}