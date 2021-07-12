import java.util.Scanner;

public class Lottery{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your lottery pick (three digits): ");
		int userPick = input.nextInt();
		int hundredsDigit = userPick / 100;
		int tensDigit = (userPick - hundredsDigit * 100) / 10;
		int unitsDigit = userPick % 10;
		int appPick = (int)(Math.random() * 1000);
		int appHundredsDigit = appPick / 100;
		int appTensDigit = (appPick - appHundredsDigit * 100) / 10;
		int appUnitsDigit = appPick % 10;

		System.out.println("The lottery number is " + appPick);
		if (appPick == userPick)
			System.out.println("Exact match: you win $10,000");
		else if (tensDigit == appUnitsDigit && unitsDigit == appTensDigit)
			System.out.println("Match all digits: you win $3,000");
		else if (tensDigit == appUnitsDigit || tensDigit == appTensDigit ||
			unitsDigit == appUnitsDigit || unitsDigit == appTensDigit)
			System.out.println("Match one digit: you win $1,000");
		else
			System.out.println("Sorry: no match");
		//continue from page 134 3.15
	}
}