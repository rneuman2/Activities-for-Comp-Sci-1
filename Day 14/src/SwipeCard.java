/**
 * Computer Science Section C
 * @author Ryanna Neuman
 * April 4, 2018
 */
// command i fixes indentation 

import java.util.Scanner;

public class SwipeCard {
	private int meals = 50000;
	private double cash = 47.00;

	//Constructor
	public SwipeCard() {
		int Random = 150 + (int)(Math.random() * 101);
		meals += Random;

		int Random2 = 200 + (int)(Math.random()* 101);
		cash += Random2;
	}

	public String toString() {
		return "This swipe card has " + meals + " meals and " + cash + " dollars remaining";	
	}

	public void swipe() {
		meals = meals - 1;
	}

	public void spend(double amt) {
		cash = cash - amt;
	}

	public int getPossMeals(String mealType) {
		double costOneMeal = 15.00;

		if (mealType == "meals") {
			return meals;
		}else if (mealType == "cash") {
			return (int) (meals / costOneMeal);
		}else if (mealType == "both") {
			return (int) (meals + ((meals /costOneMeal)/cash));
		}else {
			return meals;
		}
	}		
	public boolean shouldWorry() {
		if(meals < 15 && cash < 50) {
			return true;
		}else {
			return false;
		}
	}
	public double roundDownToNearestPenny(double original) {
		double roundUp = original*100;
		return Math.floor(roundUp)/100;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		SwipeCard swipes = new SwipeCard();
		double cash;
		//= scnr.nextDouble();
		int meals;
		//= scnr.nextInt();

		System.out.println(swipes.toString());
		// number 6.

		swipes.swipe();
		System.out.println(swipes.toString());

		swipes.spend(20);
		System.out.println(swipes.toString());


		System.out.println(swipes.getPossMeals("cash"));

		System.out.println(swipes.shouldWorry());

		System.out.println(swipes.roundDownToNearestPenny(123.4567));

	}
}











