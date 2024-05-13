package BobbleSort;

public class Main {

	public static void main(String[] args) {
		Modelagem model = new Modelagem();
		view view = new view();
		Controle controller = new Controle(model, view);

		controller.processNumbers();
	}

}
