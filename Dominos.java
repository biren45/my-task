import java.util.*;
public class Dominos {
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) {
		final double DIS = .20;
		double dis;
		double item;
		System.out.println("inter item price");
		item = console.nextDouble();
		dis = item * 2 * DIS;
		System.out.println("the final price of the item is: ");
		System.out.println((item * 2) - dis );

	}

}
