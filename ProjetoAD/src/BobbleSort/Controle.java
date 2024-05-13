package BobbleSort;

public class Controle {
	private Modelagem model;
	private view view;

	public Controle(Modelagem model, view view) {
		this.model = model;
		this.view = view;
	}

	public void processNumbers() {
		int[] inputNumbers = view.getInputNumbers();
		for (int i = 0; i < inputNumbers.length; i++) {
			model.setNumber(i, inputNumbers[i]);
		}
		model.bubbleSort();
		int[] sortedNumbers = model.getNumbers();
		view.displaySortedNumbers(sortedNumbers);
	}
}
