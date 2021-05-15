package exerciciosPoo;
	/*Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console */

public class exercicio3Produto {
	//atributos
	private String nomeProduto;
	private String tipo;
	private int numeroIdentificacao;
	private int qtdEstoque;
	private double valorNormal;
	private double valorPromocional;
 // gets e sets 
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getNumeroIdentificacao() {
		return numeroIdentificacao;
	}
	public void setNumeroIdentificacao(int numeroIdentificacao) {
		this.numeroIdentificacao = numeroIdentificacao;
	}
	public int getQtdEstoque() {
		return qtdEstoque;
	}
	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
	public double getValorNormal() {
		return valorNormal;
	}
	public void setValorNormal(double valorNormal) {
		this.valorNormal = valorNormal;
	}
	public double getValorPromocional() {
		return valorPromocional;
	}
	public void setValorPromocional(double valorPromocional) {
		this.valorPromocional = valorPromocional;
	}
	
}