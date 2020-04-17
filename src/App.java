
public class App {

	public static void main(String[] args) {
		double tea = 2.99;
		float fish = 3.50f;
		int cash = 20;
		int fiat = 66;
		long friends = 100000000000000L;
		int mates = 100;
		int hisAge = 40;
		int herAge = 36;
		String hisFirstName = "Jimbo";
		String herFirstName = "Suzie";
		String hisLastName = "Franken";
		String herLastName = "Clownshoes";
		char hisMiddleInitial = 'W';
		char herMiddleInitial = 'L';
		double balanceAfterTea  = cash - tea;
		int friendsPerYear = mates / hisAge;
		String fullName = hisFirstName + " " + hisMiddleInitial + " " + hisLastName;
		
		System.out.println("The price of tea in China is: " + tea);
		System.out.println("Today's price of fish by the pound is: " + fish);
		System.out.println("I have this much money in my wallet: " + cash);
		System.out.println("The number of American Dollars on hand are: " + fiat);
		System.out.println("The number of Facebook friends are: " + friends);
		System.out.println("I have this many real friends: " + mates);
		System.out.println("The man's age is: " + hisAge);
		System.out.println("The woman's age is: " + herAge);
		System.out.println("His first name is: " + hisFirstName);
		System.out.println("Her first name is: " + herFirstName);
		System.out.println("His last name is: " + hisLastName);
		System.out.println("Her last name is: " + herLastName);
		System.out.println("His middle initial is: " + hisMiddleInitial);
		System.out.println("Her middle initial is: " + herMiddleInitial);
		System.out.println("I had some tea and had this much money after: " + balanceAfterTea);
		System.out.println("I've made this many friends a year: " + friendsPerYear);
		System.out.println("His full name is: " + fullName);
	}

}
