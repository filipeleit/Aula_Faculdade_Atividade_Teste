package views;

import javax.swing.JOptionPane;

import Modelagem.Numero;
import Negocio.Arvore;

public class ArvorePre {

	public static void main(String[] args) {
		Numero n = new Numero();
		Arvore a = new Arvore();
		
	    Numero n1 = new Numero();
	    Numero n2 = new Numero();
	    Numero n3 = new Numero();
	    Numero n4 = new Numero();
	    Numero n5 = new Numero();
	    Numero n6 = new Numero();
	    Numero n7 = new Numero();
	    Numero n8 = new Numero();
	    Numero n9 = new Numero();
		
		n1.setDado(43);
		n2.setDado(42);
		n3.setDado(43);
		n4.setDado(40);
		n5.setDado(44);
		n6.setDado(46);
		n7.setDado(38);
		n8.setDado(47);
		n9.setDado(39);
		
		
		a.adicionarPre(n1);
		a.adicionarPre(n2);
		a.adicionarPre(n3);
		a.adicionarPre(n4);
		a.adicionarPre(n5);
		a.adicionarPre(n6);
		a.adicionarPre(n7);
		a.adicionarPre(n8);
		a.adicionarPre(n9);
		
		JOptionPane.showMessageDialog(null, "pre-ordem");
		a.exibirPre(a);
	}

}
