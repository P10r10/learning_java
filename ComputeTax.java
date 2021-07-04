import java.util.Scanner;

public class ComputeTax{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("(0 - single, 1 - married jointly, 2 - married " +
			"separately, 3 - head of household)");
		System.out.print("Enter filing status: ");
		int status = input.nextInt();
		System.out.print("Enter taxable income: ");
		double income = input.nextDouble();
		double tax = 0;

		switch(status){
			case 0:{
				if (income <= 8350)
					tax = income * 0.1;
				else if (income <= 33950)
					tax = 8350 * 0.1 + (income - 8350) * 0.15;
				else if (income <= 82250)
					tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
				else if (income <= 171550)
					tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 +
					(income - 82250) * 0.28;
				else if (income <= 372950)
					tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (82250 - 33951) * 0.25 +
					(171550 - 82250) * 0.28 + (income - 171550) * 0.33;
				else
					tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (82250 - 33951) * 0.25 +
					(171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
				break;
			}
			case 1:
			case 2:
			case 3:
		}

		System.out.print(tax);

		input.close();
	}
}
