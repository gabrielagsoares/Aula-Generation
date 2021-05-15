package exercicioCollections;

public class estoqueTamanho {
	private String peca;
	private int tamanho;

	public estoqueTamanho(String peca, int tamanho) {
		super();
		this.peca = peca;
		this.tamanho = tamanho;
	}
	

	public String getPeca() {
		return peca;
	}


	public void setPeca(String peca) {
		this.peca = peca;
	}


	public int getTamanho() {
		return tamanho;
	}


	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}


	public String toString() { // transforma minhas variáveis declaradas em string
		return "\nItem: " + this.peca + "-" + " tamanho disponível: " + this.tamanho;
	


}
}
