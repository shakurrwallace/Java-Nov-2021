/*	klavyeden girilen 3 farklı sayının en büyüğünü ekrana yazdıran program sayıların farklı girildiğini farzediyoruz 
 * 
 * */
package _005_compare_three_numbers;

public class App {
	public static void main(String[] args) {
		java.util.Scanner kb = new java.util.Scanner(System.in);
		int a,b,c;
		System.out.println("1. sayıyı giriniz: ");
		a = Integer.parseInt(kb.nextLine());

		System.out.println("2. sayıyı giriniz: ");
		b = Integer.parseInt(kb.nextLine());

		System.out.println("3. sayıyı giriniz: ");
		c = Integer.parseInt(kb.nextLine());
//		ESKİ YÖNTEM 
//		if (a > b ) {
//			if (a > c) {
//				System.out.println("A en büyük"); 
//			} else {
//				System.out.println("C en büyük");
//			}
//		} else if (b >  c) {
//			System.out.println("B en büyük");
//		} else {
//			System.out.println("C en büyük");
//		}
//		//Mantıksal operatörler ile kullanımı.
		
		if (a > b && a > c ) {
			System.out.println("A en büyüktür.");
		} else if (b > a && b > c) { 
			System.out.println("B en büyük.");
		} else {
			System.out.println("C en büyük ");
		}
		
		
	}
}
