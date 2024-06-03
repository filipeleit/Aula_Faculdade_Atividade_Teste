package Main;

import Controller.Controle;
import Modelagem.Modelagem;
import Visao.Visao;

public class Main {

	public static void main(String[] args) {
		Modelagem modelo = new Modelagem();
        Visao visao = new Visao();
        Controle controlador = new Controle(modelo, visao);

        // Adicionando números
        controlador.adicionarNumeros();

        // Busca sequencial
        visao.mostrarMensagem("Digite o número que deseja encontrar:");
        int elementoParaEncontrar = visao.lerNumero();
        int resultado = controlador.buscarElemento(elementoParaEncontrar);

        if (resultado != -1) {
            visao.mostrarMensagem("Elemento encontrado no índice " + resultado);
        } else {
            visao.mostrarMensagem("Elemento não encontrado.");
        }
    }

	}


