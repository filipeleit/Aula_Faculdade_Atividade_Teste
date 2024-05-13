package BobbleSort;

import java.util.Scanner;

public class view {
	private Scanner scanner;

	public view() {
		scanner = new Scanner(System.in);
	}

	public int[] getInputNumbers() {
		int[] inputNumbers = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o número " + (i + 1) + ":");
			inputNumbers[i] = scanner.nextInt();
		}
		return inputNumbers;
	}

	public void displaySortedNumbers(int[] numbers) {
		System.out.println("Números ordenados:");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println((i + 1) + ": " + numbers[i]);
		}
	}

}
