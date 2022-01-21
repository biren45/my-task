import java.util.*;
public class Jiofiber {
static Scanner console = new Scanner(System.in);
	public static void main(String[] args) {
		final double TAX = .18;
		double tax;
		double item;
		System.out.println("inter item price");
		item = console.nextDouble();
		tax = item * TAX;
		System.out.println("The Tax of the item is :" + tax);
		System.out.println("the final price of the item is: ");
		System.out.println(item + tax );
		
	}

}
