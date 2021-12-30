package _002_example2;

public class App {

	public static void main(String[] args) {
		MathUtil.run();

	}
}

class MathUtil{
	public static void run ()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);

		System.out.print("Birinci sayıyı giriniz: ");
		int x = Integer.parseInt(kb.nextLine());
		System.out.print("İkinci sayıyı giriniz: ");
		int y = Integer.parseInt(kb.nextLine());
	 
		System.out.print("Üçüncü sayıyı giriniz: ");
		int x2 = Integer.parseInt(kb.nextLine());
		System.out.print("Dördüncü sayıyı giriniz: ");
		int y2 = Integer.parseInt(kb.nextLine());
	 
		double result = NumberUtil.foo(x, y, x2, y2);
		System.out.printf("%.2f%n", result);
	}
}

class NumberUtil {
	public static double foo(int x, int y, int x2, int y2) {
		double result = Math.sqrt(Math.pow(x2 - x, 2)+ Math.pow(y2 - y, 2));
		return result;
	}
}

