/*Parametresi ile aldığı int türden bir sayının basamaksal kökünü bulan calculateDigitalRoot isimli metodu yazınız ve test
ediniz
Açıklamalar:
• Bir sayının basamaksal kökü tüm basamaklarının toplanması ile elde edilen sayıdır. Basamakları toplama işlemi,
tek basamaklı bir sayı elde edilene kadar sürdürülür:
36987 -> 3 + 6 + 9 + 8 + 7 = 33
33 -> 3 + 3 = 6 -> basamaksal kök
 * 
 * 
 * 
 * */
package _014_HomeworkDigitsSum;
public class App {
	public static void main (String [] args) 
		{
		DigitsTest.run();			
		}
	}

class DigitsTest {
		
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);		
			
		for(;;) {
			System.out.print("Bir sayı giriniz:");
			int val = Integer.parseInt(kb.nextLine());
				
			System.out.printf("%d sayısının basamakları toplamı:%d%n", val,calculateDigitalRoot(val));
				
			if (val == 0)
				return;
		}
	}
	
	public static int calculateDigitalRoot(int val)
	{		
		int sum = 0;
			
		while (val != 0) {
			sum += val % 10;
			val /= 10;
		}
			
		return sum;
	}
}


