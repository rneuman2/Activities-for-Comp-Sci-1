/** Ryanna Neuman
 * Computer Science C
 * March 12, 2018
 */ 
 
import java.util.Scanner;
public class madLib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a noun: ");
		String noun = scnr.nextLine();
		System.out.println("Enter a noun: ");
		String noun2 = scnr.nextLine();
		System.out.println("Enter an adjective: ");
		String adj = scnr.nextLine();
		System.out.println("Enter an adjective: ");
		String adj2 = scnr.nextLine();
		System.out.println("Enter a plural noun: ");
		String pnoun = scnr.nextLine();
		System.out.println("Enter a verb: ");
		String verb = scnr.nextLine();
		System.out.println("Enter a whole number: ");
		int num = scnr.nextInt();
		System.out.println("Enter a decimal number: ");
		double dec = scnr.nextDouble();
		
		

		
		System.out.println("Once upon a time there was a " + noun + " that wanted to be an " + noun2 + " the " + noun + " was very " + adj + " and " + adj2 + " However to be like " + noun2 + " it would need " + pnoun + " but also need to be able to " + verb + " a lot for " + num + " miles. If it does that then it will have $" + dec + " dollars to buy whatever it wants." );
	}

}
