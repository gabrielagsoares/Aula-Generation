package exerciciosHeranca;

 	/*Crie uma hierarquia de classes com atributos e
		comportamentos, utilize os seus conhecimentos e distribua as
			características de forma que tudo o que for comum a todos os animais fique na classe
				Animal*/

public class animais {
	private String nome;
	private int idade;
	private String som;
	private String acao;
	public String getNome() {
		return nome; // gets e sets  / encapsulamento
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public String getAcao() {
		return acao;
	}
	public void setAcao(String acao) {
		this.acao = acao;
	}
	
}
