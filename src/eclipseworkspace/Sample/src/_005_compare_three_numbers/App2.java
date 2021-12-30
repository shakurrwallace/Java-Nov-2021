/* KLAVYEDEN GİRİLEN 3 KENAR UZUNLUĞUNU BİR ÜÇGEN OLUŞTURUP OLUŞTURMADIĞINI EKRANA YAZDIRAN PROGRAM.
 *	ÜÇGEN OLMA KOŞULU : 
 *	A + B > C 
 *	A + C > B 
 *	B + C > A
 *	 3 KOŞULU BERABER SAĞLAYAN KENAR BİR ÜÇGEN OLABİLİR
 *	2. eşkenar üçgen 
 *	formül : her kenar birbirine eşit olması lazım.
 *	3. ikizkenar üçgen
 *	formül : iki kenar birbirine eşitse
 * */
package _005_compare_three_numbers;

public class App2 {

	public static void main(String[] args) {
		java.util.Scanner kb = new java.util.Scanner(System.in);
		int a,b,c;
		System.out.println("1. kenarı giriniz: ");
		a = Integer.parseInt(kb.nextLine());

		System.out.println("2. kenarı giriniz: ");
		b = Integer.parseInt(kb.nextLine());

		System.out.println("3. kenarı giriniz: ");
		c = Integer.parseInt(kb.nextLine());

		Triangle.isTriangle(a,b,c);
		Triangle.isEqualTriangle(a,b,c);
		Triangle.isIsoscelesTriangle(a,b,c);
	}
}
class Triangle {
	public static void isTriangle (int a, int b, int c) {
		if (a + b > c && a + c > b && b + c > a) {
			System.out.println("Üçgendir. ");
		}
		else {
			System.out.println("Üçgen değildir. ");
		}
	}
	
	public static void isEqualTriangle(int a, int b, int c) {
		if (a == b && b == c ) {
			System.out.println("Eşkenar üçgendir");
		}
		else {
			System.out.println("Eşkenar değildir.");
		}
	}
	
	public static void isIsoscelesTriangle (int a, int b, int c) {
		if (a == b && b != c || c == a && a != b || b == c && c != a ) {
			System.out.println("İkizkenar üçgendir");
		}
		else {
			System.out.println("İkizkenar değildir.");
		}
	}
}

