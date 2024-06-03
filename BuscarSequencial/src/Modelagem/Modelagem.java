package Modelagem;

public class Modelagem {
	private int[] vetor;

    public Modelagem() {
        vetor = new int[10];
    }

    public void adicionarNumero(int indice, int numero) {
        vetor[indice] = numero;
    }

    public int[] getVetor() {
        return vetor;
    }
}
