package exerciciosPooTeste;

import exerciciosPoo.exercicio3Produto;

public class exercicio3ProdutoTeste {
public static void main(String[] args) {
	exercicio3Produto produto = new exercicio3Produto();
	produto.setNomeProduto("Smartphone ");
	produto.setTipo("Eletr�nico");
	produto.setNumeroIdentificacao(38896);
	produto.setQtdEstoque(3);
	produto.setValorNormal(999.99);
	produto.setValorPromocional(799.99);
	
	System.out.println("Produto: " + produto.getNomeProduto());
	System.out.println("Tipo: " + produto.getTipo());
	System.out.println("N�mero de identifica��o: " + produto.getNumeroIdentificacao());
	System.out.println("Quantidade dispon�vel em estoque: " + produto.getQtdEstoque());
	System.out.println("Valor: R$ : " + produto.getValorNormal());
	System.out.println("Valor promocional: R$ : " + produto.getValorPromocional());
}
}
