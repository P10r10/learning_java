import java.util.Scanner;

public class HeadsOrTails{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Guess Heads or Tails (0 or 1): ");
		int guess = input.nextInt();
		System.out.print("Your guess was ");
		if(guess == 0)
			System.out.print("Heads!");
		else if(guess == 1)
			System.out.print("Tails!");
		else
			System.out.print("Unknown...");
	}
}