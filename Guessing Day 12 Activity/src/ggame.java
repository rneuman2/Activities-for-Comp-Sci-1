import java.util.Scanner;
import java.util.Random;

public class ggame {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		System.out.println("What is Your name?");
		String name = scnr.nextLine();
		System.out.println("Hi," + name + " Welcome!");
		System.out.println("Guess a number between -10 and 10");
		
		
		// Create a program that generates a number and if the user guess it wrong say "No ur wrong"
		Random rand = new Random();
		int numGuess = -10 + rand.nextInt(10);
		
		//Need to get unlimited guesses
		boolean guess = false;
		while (!guess) {
		
		int Guess = scnr.nextInt();
		if (Guess == numGuess) {
			System.out.print("You got it right! The answer is " + numGuess + " Nice job " + name);
		}
		else if(Guess < -10) {
			System.out.print("Out of range.");
		}
		else if(Guess > 10) {
			System.out.print("Out of range");
		}
		else if (Guess != numGuess) {
			System.out.print("Nope try again.");
		}
	}
	}

}
