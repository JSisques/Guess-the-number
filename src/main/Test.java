package main;

import number.*;

public class Test {

	public static void main(String[] args) {
		
		//Objet generation
		GenerateNumber numToGuess = new GenerateNumber();
		GuessNumber num = new GuessNumber();
		
		System.out.println("The number to guess is: " + numToGuess.getNumGenerated());
		num.addNumbers(numToGuess.getNumMax());
		
		//Calculate the time
		long startTime = System.currentTimeMillis();
		
		do {
			
			num.generateNumber();
			System.out.println("Your number is: " + num.getNumGuessGenerated());
			
			num.printResult(numToGuess.getNumGenerated());
			
			num.deleteNumbers(numToGuess.getNumGenerated());
			
		} while (numToGuess.getNumGenerated() != num.getNumGuessGenerated());
		
		long finalTime = System.currentTimeMillis();
		double time = (double)(finalTime-startTime) / 1000;
		
		System.out.println( time + " seconds");
	}
	

}
