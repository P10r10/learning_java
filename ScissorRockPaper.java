import java.util.Scanner;

public class ScissorRockPaper{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Scissor (0), rock (1), paper (2): ");
		int user = input.nextInt();
		int computer = (int)(Math.random() * 3);

		System.out.print("Computer is ");
		switch (computer){
			case 0: System.out.print("scissor. "); break;
			case 1: System.out.print("rock. "); break;
			case 2: System.out.print("paper. "); break;
		}
		System.out.print("You are ");
		switch (user){
			case 0: System.out.print("scissor"); break;
			case 1: System.out.print("rock"); break;
			case 2: System.out.print("paper"); break;
		}
		System.out.print(user == computer ? " too. It is a draw." : ". ");
		if (user == 0){
			if (computer == 2)
				System.out.print("You win.");
			else if (computer == 1)
				System.out.print("You lose.");
		}
		else if (user == 1){
			if (computer == 0)
				System.out.print("You win.");
			else if (computer == 2)
				System.out.print("You lose.");
		}
		else if (user == 2){
			if (computer == 1)
				System.out.print("You win.");
			else
				System.out.print("You lose.");
		}
		System.out.println();
		input.close();
	}
}