package Controle;

import Modelagem.peca;

public class Montador {
	private int tamanhoPilha = 4;
	private peca[] Computador;
	private int ponteiro;

	public Montador() {
		this.Computador = new peca[tamanhoPilha];
		this.ponteiro = 0;
	}

	public peca[] getVentilador() {
		return Computador;
	}

	public void setVentilador(peca[] ventilador) {
		this.Computador = ventilador;
	}

	public void empilhar(peca Peca) {
		System.out.println("Empilhando" + Peca.getNome());
		movimentarPilha();
		Computador[0] = Peca;
		ponteiro++;;
		getVentilador();
	}

	public void movimentarPilha() {
		for (int i = 0; i < ponteiro; i++) {
			if (ponteiro - i < Computador.length) {
				Computador[ponteiro - i] = Computador[ponteiro - i - 1];
			}
		}
		Computador[0]=null;
	}
	public void printComputador() {
		String retorno="";
		for(int i=0;i<Computador.length;i++) {
			retorno+=String.format("\t\t[%s]=>%s", i,Computador[i]!=null ? Computador[i].getNome():"");
		}
		System.out.println(retorno);
	}
}
