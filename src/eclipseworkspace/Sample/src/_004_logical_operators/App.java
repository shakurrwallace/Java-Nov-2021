/*
 * 2 fonksiyon yazılacak foo bar diye, her fonksiyon içinde bir system.out.print bi tanesi true dönecek foo = true bar = false
 */
package _004_logical_operators;

public class App {
	public static void main(String[] args) {
		
		if (Sample.bar() && Sample.bar() || Sample.bar()) {
			System.out.println("true");
		} else { 
			System.out.println("false ");
		}
	}			
}


class Sample {
	public static boolean foo() {
		System.out.println("foo" );
		return true;
		
	}
	
	public static boolean bar() {
		System.out.println("bar");
		return false;
	}
}
// bar, 
//bar,
//bar
//false
 