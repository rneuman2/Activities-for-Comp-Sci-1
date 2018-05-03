import java.util.Scanner;

/**
 * Computer Science section C
 * @author Rys
 * Feb 20, 2018
 */
public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		
		
		Day Num1 = new Day(2018,2,22);

		System.out.println("What's Your Birthday?");
		System.out.println("Year: ");
		int year = scnr.nextInt();
		System.out.println("Month: ");
		int month = scnr.nextInt();
		System.out.println("Day: ");
		int dayofmonth = scnr.nextInt();
		Day Birth = new Day(year,month,dayofmonth);
		System.out.println(Birth);
		
		//prints out input's bday
		


		
		
		int daysfrombirth = Num1.daysFrom(Birth);
		System.out.println("days old: " + daysfrombirth);
		
		Day today = new Day();
		int today1;
		int month1;
		today.addDays(100);
		today1 = today.getDayOfMonth();
		month1 = today.getMonth();
		int year1 = today.getYear();
		
		System.out.println("100 Days + today is " + year1 + "-" + month1 + "-" + today1);
		
		
		
		
		
		
		
		
		
	}

}
