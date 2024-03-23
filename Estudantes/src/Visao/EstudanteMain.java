package Visao;

import javax.swing.JOptionPane;

import Modelagem.Estudante;

public class EstudanteMain {

	public static void main(String[] args) {
		Estudante estudante = new Estudante();
		estudante.adicionarFila(10);
		estudante.adicionar(12);
		estudante.mostrar();
		estudante.remover();
		estudante.mostrar();
		JOptionPane.showMessageDialog(null, estudante);
	}

}
