package InsertSort;

public class Controle {
	private Modelo modelo;
	private visao visao;

	public Controle(Modelo modelo, visao visao) {
        this.modelo = modelo;
        this.visao = visao;
    }
	public void ordenarVetorComInsertionSort() {
        modelo.insertSort();
        visao.imprimirVetor(modelo.getVetor());
    }

    public void ordenarVetorComBubbleSort() {
        modelo.bubbleSort();
        visao.imprimirVetor(modelo.getVetor());
    }
}
