package Visao;

import java.util.Scanner;

public class Visao {
	 public void mostrarMensagem(String mensagem) {
	        System.out.println(mensagem);
	    }

	    public int lerNumero() {
	        Scanner scanner = new Scanner(System.in);
	        return scanner.nextInt();
	    }
}
