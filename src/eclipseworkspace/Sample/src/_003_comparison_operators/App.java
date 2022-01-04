/* Katsayıları klavyeden girilen ikinci dereceden bir denklemin köklerini bulup ekrana yazdıran programı yazınız 
 * 
 */
package _003_comparison_operators;

public class App {

	public static void main(String[] args) {
		java.util.Scanner kb = new java.util.Scanner(System.in);
		int a, b, c, delta;
		
		System.out.println("A değeri giriniz: ");
		a = Integer.parseInt(kb.nextLine());
		System.out.println("B değeri giriniz: ");
		b = Integer.parseInt(kb.nextLine());
		System.out.println("C değeri giriniz: ");
		c = Integer.parseInt(kb.nextLine());
		
		delta = b * b - 4 * a * c;
	}
	public static int function (int delta, int a , int b, int c) 
	{
	int x1, x2;
		if (delta > 0) {
			x1 = -b + delta / 2 * a;
			x2 = -b - delta / 2 * a;
		}
		else if (delta == 0) {
			x1 = x2 = -b / 2 * a; 
		}
		else if (delta < 0) {
			System.out.println("Gerçek kök yok. ");
		}
		return delta;
	
	
	}
}
