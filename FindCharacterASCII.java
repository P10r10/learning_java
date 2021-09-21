import java.util.Scanner;

public class FindCharacterASCII{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an ASCII code: ");
		int code = input.nextInt();
		System.out.printf("The character for ASCII code %d is %c\n", code, code);
		input.close();
	}
}