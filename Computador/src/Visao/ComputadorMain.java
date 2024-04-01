package Visao;

import javax.swing.JOptionPane;

import Controle.Montador;
import Modelagem.peca;

public class ComputadorMain {

	public static void main(String[] args) {
		peca gabinete = new peca(1,"GABINETE");
		peca placaMae= new peca(2,"PLACA MAE");
		peca fonte= new peca(3,"FONTE");
		peca processador= new peca(4,"PROCESSADOR");

		Montador m= new Montador();
				
		System.out.println("\n\n--------EMPILHANDO-----------");
		m.empilhar(gabinete);
		m.empilhar(placaMae);
		m.empilhar(fonte);
		m.empilhar(processador);
		
		m.printComputador();
		System.out.println("\n");
		System.out.println("imprimindo pilha");
		JOptionPane.showMessageDialog(null,m.getVentilador());

		

	}

}
