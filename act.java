import java.util.Scanner;

/** 
 * Computer Science Section C
 * @author Rys
 *Feb 20 2018
 */
public class act {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		int num1;
		int num2;
		int remainder; 
		
		num1 = scnr.nextInt();
		num2 = scnr.nextInt();
	     System.out.println((num1) + " + " + (num2) + " = " + (num1 + num2));
	     System.out.println((num1) + " - " + (num2) + " = " + (num1 - num2));
	     System.out.println((num1) + " * " + (num2) + " = " + (num1 * num2));
	    
	     remainder = num1 % num2;
	     System.out.println((num1) + " / " + (num2) + " = " + (num1 / num2) + " remainder is " + remainder);
	     
	   }
		
	
	

	}


