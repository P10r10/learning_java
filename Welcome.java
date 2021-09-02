public class Welcome{
	public static void main(String[] args){
		System.out.println("Welcome to java");
		System.out.println("Welcome to Computer Science");
		System.out.println("Programming is fun");
		System.out.println("    J       A    V     V       A");
		System.out.println("    J      A A    V   V       A A");
		System.out.println("J   J     AAAAA    V V       AAAAA");
		System.out.println(" J J     A     A    V       A     A");
		double a = 3.4;
		double b = 50.2;
		double c = 2.1;
		double d = 0.55;
		double e = 44.5;
		double f = 5.9;
		double x, y;

		x = (e * d - b * f) / (a * d - b * c);
		y = (a * f - e * c) / (a * d - b * c);

		System.out.println("x is " + x + " and y is " + y);
	}
}