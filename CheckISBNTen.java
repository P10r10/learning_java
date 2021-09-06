import java.util.Scanner;

public class CheckISBNTen{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int nb = input.nextInt();
		int d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, keep_nb;
		keep_nb = nb;
		d9 = nb % 10;
		nb /= 10;
		d8 = nb % 10;
		nb /= 10;
		d7 = nb % 10;
		nb /= 10;
		d6 = nb % 10;
		nb /= 10;
		d5 = nb % 10;
		nb /= 10;
		d4 = nb % 10;
		nb /= 10;
		d3 = nb % 10;
		nb /= 10;
		d2 = nb % 10;
		nb /= 10;
		d1 = nb % 10;
		d10 = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		System.out.print("The ISBN-10 number is " + keep_nb);
		System.out.println(d10 == 10 ? "X" : d10);
		input.close();
	}
}
