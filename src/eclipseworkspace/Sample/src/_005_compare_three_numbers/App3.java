package _005_compare_three_numbers;
/*	KLAVYEDEN GİRİLEN 3 FARKLI SAYININ ORTANCASINI EKRANA YAZDIRAN PROGRAM 
 * 
 * 
 * */
public class App3 {
	public static void main(String[] args) {
		java.util.Scanner kb = new java.util.Scanner(System.in);
		int a, b, c;
		System.out.println("1. sayıyı giriniz: ");
		a = Integer.parseInt(kb.nextLine());
	
		System.out.println("2. sayıyı giriniz: ");
		b = Integer.parseInt(kb.nextLine());
	
		System.out.println("3. sayıyı giriniz: ");
		c = Integer.parseInt(kb.nextLine());
		
		if (a > b && a < c || a > c && a < b) {
			System.out.println("A ortanca sayıdır ");
		} else if (b > a && b < c || b > c && b < a) {
			System.out.println("B ortanca sayıdır.");
		} else {
			System.out.println("C ortanca sayıdır. ");
		}
	}
}
