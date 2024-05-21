package InsertSort;

public class Main {

	public static void main(String[] args) {
		int quantidade = 10;
		int[] vetor = new int[quantidade];
		vetor[0] = 30;
		vetor[1] = 20;
		vetor[2] = 10;
		vetor[3] = 40;
		vetor[4] = 50;
		vetor[5] = 60;
		vetor[6] = 70;
		vetor[7] = 80;
		vetor[8] = 90;
		vetor[9] = 40;
		vetor[10] = 40;

		Modelo modelo = new Modelo(vetor);
		visao visao = new visao();
		Controle controlador = new Controle(modelo, visao);

		// Ordenar usando Insertion Sort
		System.out.println("Ordenação usando Insertion Sort:");
		controlador.ordenarVetorComInsertionSort();

		// Ou ordenar usando Bubble Sort
		System.out.println("\nOrdenação usando Bubble Sort:");
		controlador.ordenarVetorComBubbleSort();
	}
}
