package number;

import java.util.LinkedList;

public class GuessNumber {

	// Attributes (Fields)
	private LinkedList<Integer> numbers;
	private int numGuessGenerated;

	public GuessNumber() {

		numbers = new LinkedList<Integer>();

	}

	public void addNumbers(int numMax) {

		for (int i = 1; i <= numMax; i++) {
			numbers.add(i);
		}

	}

	// Getters & Setters

	public LinkedList<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(LinkedList<Integer> numbers) {
		this.numbers = numbers;
	}

	public int getNumGuessGenerated() {
		return numGuessGenerated;
	}

	public void setNumGuessGenerated(int numGuessGenerated) {
		this.numGuessGenerated = numGuessGenerated;
	}

	public int generateNumber() {

		if (numbers.size() != 1) {

			int numMax = numbers.getLast();
			int numMin = numbers.getFirst();
			this.numGuessGenerated = (int) Math.floor(Math.random() * (numMax - numMin) + numMin);

		} else {

			this.numGuessGenerated = numbers.getFirst();

		}

		return numGuessGenerated;

	}

	public int deleteNumbers(int numToGuess) {

		int result;

		if (numGuessGenerated < numToGuess) {

			for (int i = numbers.getFirst(); i <= numGuessGenerated; i++) {
				numbers.removeFirst();
			}

		}

		if (numGuessGenerated > numToGuess) {

			int aux = numGuessGenerated;

			for (int i = aux; i <= numbers.getLast();) {
				numbers.removeLast();
			}

		}

		return result = numGuessGenerated;
	}

	public void printResult(int number) {

		String result = "";

		if (numGuessGenerated > number) {

			result = "Your number is greater";

		} else if (numGuessGenerated < number) {

			result = "Your number is smaller";

		} else {

			result = "Congratulations, your number is correct";

		}

		System.out.println(result);
	}
}
