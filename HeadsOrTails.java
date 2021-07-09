import java.util.Scanner;

public class HeadsOrTails{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Guess Heads or Tails (0 or 1): ");
		int guess = input.nextInt();

		System.out.print("Your guess was ");
		if(guess == 0)
			System.out.println("Heads!");
		else if(guess == 1)
			System.out.println("Tails!");
		else
			System.out.println("Unknown...");

		int appGuess = (int)(Math.random() * 2);
		System.out.print("App guess was ");
		if(appGuess == 0)
			System.out.println("Heads!");
		else if(appGuess == 1)
			System.out.println("Tails!");
		System.out.println("Your prediction was " +
			(guess == appGuess ? "correct!" : "wrong!"));
	}
}