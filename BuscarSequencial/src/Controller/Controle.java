package Controller;

import Modelagem.Modelagem;
import Visao.Visao;

public class Controle {
	private Modelagem modelo;
    private Visao visao;

    public Controle(Modelagem modelo, Visao visao) {
        this.modelo = modelo;
        this.visao = visao;
    }

    public void adicionarNumeros() {
        for (int i = 0; i < 10; i++) {
            visao.mostrarMensagem("Digite o número " + (i + 1) + ":");
            int numero = visao.lerNumero();
            modelo.adicionarNumero(i, numero);
        }
    }

    public int buscarElemento(int elemento) {
        int[] vetor = modelo.getVetor();
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == elemento) {
                return i;
            }
        }
        return -1;
    }
}
