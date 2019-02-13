package number;

import java.util.Scanner;

public class GenerateNumber {

	// Attributes (Fields)
	private int numGenerated;
	private int numMax;
	private int numMin;

	Scanner scan = new Scanner(System.in);

	public GenerateNumber() {

		System.out.print("Type the maximum value: ");
		this.numMax = scan.nextInt();
		System.out.print("Type the minimum value: ");
		this.numMin = scan.nextInt();
		// Generate a number between 2 numbers
		this.numGenerated = (int) Math.round(Math.random() * (numMax - numMin + 1) + numMin); 
																								
	}
	
	//Getters & Setters

	public int getNumGenerated() {
		return numGenerated;
	}

	public void setNumGenerated(int numGenerated) {
		this.numGenerated = numGenerated;
	}

	public int getNumMax() {
		return numMax;
	}

	public void setNumMax(int numMax) {
		this.numMax = numMax;
	}

	public int getNumMin() {
		return numMin;
	}

	public void setNumMin(int numMin) {
		this.numMin = numMin;
	}
	
	

}
