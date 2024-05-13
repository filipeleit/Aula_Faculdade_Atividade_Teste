package BobbleSort;

public class Modelagem {
	private int[] numbers;

	public Modelagem() {
		numbers = new int[10];
	}

	public void setNumber(int index, int value) {
		numbers[index] = value;
	}

	public int[] getNumbers() {
		return numbers;
	}

	public void bubbleSort() {
		int n = numbers.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (numbers[j] > numbers[j + 1]) {
					// troca os elementos
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}
	}
}
