/** 
* Computer Science C
* @author Ryanna Neuman
*Feb 8 2018
*/
import java.util.Scanner;
public class Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			Scanner scnr = new Scanner(System.in);
			int temp;
			int cel;
			int far;
			int cel2;
			int cel3;
			temp= scnr.nextInt();
			
		System.out.println("Temp: " + temp);
		far = temp * 9 / 5 + 32; 
		System.out.println(temp + " C is " + far + " F " );
		cel = temp - 32; 
		cel2 = cel * 5; 
		cel3= cel2 / 9;
		System.out.println(temp + " F is " + cel3 + " C " );
		
/** Weight Section
 */
			int weight;
			int kilo;
			int pounds;
			weight = scnr.nextInt();
		
		System.out.println(" Weight: " + weight);
		kilo =weight/(22/10);
		System.out.println(weight + " lbs " + kilo + " kilograms ");
		pounds = weight * (22/10);
		System.out.println(weight + " kilograms " + pounds + " lbs ");
		
		
			
	}	
	}