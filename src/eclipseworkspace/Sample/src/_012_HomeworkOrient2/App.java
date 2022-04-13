package _012_HomeworkOrient2;

public class App {

	public static void main(String[] args)
	{	
		OrientDraw.run();
	}
}
class OrientDraw {
	public static void run() {
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.println("Height değerini giriniz: ");
		
		int height = Integer.parseInt(kb.nextLine());
		System.out.println("Width değerini giriniz: ");
		int width = Integer.parseInt(kb.nextLine());
		
		for(int i = 1; i <= height; i++) {			
			System.out.print("|");
			int temp = i % width;
			
			for (int j = 1; j < temp; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int j = temp; j < width; j++) {
				System.out.print(" ");
			}
			System.out.println("|");	
		}
		
	}
	
}
