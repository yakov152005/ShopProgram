import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Shop[] shopsArr = new Shop[3];
		cheapest(shopsArr, s);
	}

	public static void cheapest(Shop[] shopsArr, Scanner s) {
		String name;
		double banana, apple, orange;

		for (int i = 0; i < shopsArr.length; i++) {
			System.out.print("Name of the shop " + (i + 1) + ": ");
			name = s.nextLine();
			System.out.print("Price for KG banana: ");
			banana = s.nextDouble();
			System.out.print("Price for KG apple: ");
			apple = s.nextDouble();
			System.out.print("Price for KG orange: ");
			orange = s.nextDouble();

			s.nextLine(); // consume newline character
			shopsArr[i] = new Shop(name, banana, apple, orange);
		}

		System.out.println("|Hello consumer|");
		System.out.print("How many kg of |Banana| would you like to buy?");
		double buyBanana = s.nextDouble();
		System.out.print("How many kg of |Apple| would you like to buy?");
		double buyApple = s.nextDouble();
		System.out.print("How many kg of |Orange| would you like to buy?");
		double buyOrange = s.nextDouble();

		double minCost = Double.MAX_VALUE;
		String cheapestShop = "";

		for (Shop shop : shopsArr) {
			double totalCost = (buyBanana * shop.getBanana()) + (buyApple * shop.getApple()) + (buyOrange * shop.getOrange());
			if (totalCost < minCost) {
				minCost = totalCost;
				cheapestShop = shop.getName();
			}
		}

		System.out.println("Cheapest shop: " + cheapestShop);
		System.out.println("Total cost: " + minCost);
	}
}
