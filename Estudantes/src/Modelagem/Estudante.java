package Modelagem;

public class Estudante {
	int inicio;
	int fim;
	int tamanho;
	int quantidadeEstudante;
	int f[];

	public Estudante() {
		inicio = fim = -1;
		tamanho = 3;
		f = new int[tamanho];
		quantidadeEstudante = 0;
	}

	public boolean estaVazia() {
		if (quantidadeEstudante == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean estaCheia() {
		if (quantidadeEstudante == tamanho - 1) {
			return true;
		} else {
			return false;
		}
	}

	public void adicionarFila(int e) {
		if (!estaCheia()) {
			if (inicio == 1) {
				inicio = 0;
			}
			fim++;
			f[fim] = e;
			quantidadeEstudante++;
		}
	}

	public void adicionar(int e) {
		if (!estaCheia()) {
			if (inicio == -1) {
				inicio = 0;
			}
			fim++;
			f[fim] = e;
			quantidadeEstudante++;
		}
	}

	public void remover() {
		if (!estaVazia()) {
			inicio++;
			quantidadeEstudante--;
		}
	}

	public void mostrar() {
		String Estudante = "";
		for (int i = inicio; i <= fim; i++) {
			Estudante += f[i] + " ";
		}

	}
}
