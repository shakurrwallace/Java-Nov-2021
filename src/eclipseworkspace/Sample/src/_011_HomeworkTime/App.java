///*Parametresi ile aldığı long türden saniye cinsinden süreyi saat, dakika ve saniye olarak ayrıştırarak ekrana
//yazdıran displayDuration isimli metodu yazınız. Eğer saat, dakika ya da saniye değeri 0(sıfır) ise ekrana
//yazdırılmayacaktır.
// * 
package _011_HomeworkTime;

public class App {

	public static void main(String[] args) {
		Duration.run();
	}
}
class Duration {
	public static void run() {
		java.util.Scanner kb = new java.util.Scanner(System.in);
	
		System.out.print("Süreyi saniye cinsinden giriniz: ");
		long seconds = Long.parseLong(kb.nextLine());
		
		long minutes = seconds / 60;
		long hours = minutes / 60;
		long days = hours / 24;
		long years = days / 365;
			
		displayDuration(years, days % 365, hours % 24, minutes % 60, seconds % 60);
	}
	public static void displayDuration(long years, long days, long hours, long minutes, long seconds) {
		if (years != 0)
			System.out.printf("%d yıl ", years);
		if (days != 0)
			System.out.printf("%d gün ", days);
		if (hours != 0)
			System.out.printf("%d saat ", hours);
		if (minutes != 0) 
			System.out.printf("%d dakika ", minutes);
		if (seconds != 0)
			System.out.printf("%d saniye ", seconds);
		
		
		
	}
}
