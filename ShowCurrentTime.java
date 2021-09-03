import java.util.Scanner;

public class ShowCurrentTime{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the time zone offset to GMT: ");
		int offset = input.nextInt();
		int seconds = (int)(System.currentTimeMillis() / 1000 % 60);
		int minutes = (int)(System.currentTimeMillis() / 1000 / 60 % 60);
		int hours = (int)(System.currentTimeMillis() / 1000 / 3600 % 24);
		hours += offset;

		System.out.println("The current time is " + hours + ":" + minutes + ":" + seconds);
	}
}