package Modelagem;

public class peca {

    private int codigo;
    private String nome;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
    
    public String toString() {
   	 return this.nome;
    }
    public peca(int codigo,String nome) {
   	 this.codigo=codigo;
   	 this.nome=nome;
    }
    public boolean equals(Object p) {
   	 return ((peca)p).getNome().equals(this.getNome());
    }
}

