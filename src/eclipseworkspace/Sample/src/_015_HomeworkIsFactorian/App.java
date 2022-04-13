/*	Pozitif bir sayının factorian sayısı olup olmadığını test eden isFactorian isimli metodu yazınız ve test ediniz.
Açıklamalar:
• Basamaklarının faktoriyelleri toplamı kendisine eşit olan sayıya factorian denir.
• Sayma sayılarında (pozitif sayılarda) 4 tane factorian sayı vardır. Bunlardan ilk ikisi şüphesiz 1 ve 2'dir.
• Diğerlerini de bulan test kodunu yazınız.
• İpucu: Kalan iki sayı da 100000 değerinden küçüktür. 
 * */
package _015_HomeworkIsFactorian;

public class App {
	public static void main(String[] args) 
	{
	FactorialNumberTest.run();	
	}
}

class FactorialNumberTest { 
	public static void run () 
	{	
		for (int n = 1; n < 100000; n++) {
			if (isFactorian(n))
			System.out.printf("%d sayısı faktoriyeldir.%n",n);	
		}		
	}
	
	public static boolean isFactorian(int n) 
	{
		int FactorialNumbers = 1;
	
		for (int i = 2; i <= n; i++) {
			FactorialNumbers *= i;
			
			if (n == FactorialNumbers)
				return true;
		}
		return false;
	}
}

