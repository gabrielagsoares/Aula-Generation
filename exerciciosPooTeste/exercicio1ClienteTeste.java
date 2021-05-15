package exerciciosPooTeste;

import exerciciosPoo.exercicio1Cliente;

public class exercicio1ClienteTeste {
public static void main(String[] args) {
	
	exercicio1Cliente cliente = new exercicio1Cliente();
	cliente.setNome("Gisele Carvalho ");
	cliente.setProduto("Notebook");
	cliente.setValor(2200);
	
	System.out.println("Cliente: " + cliente.getNome());
	System.out.println("Produto: " + cliente.getProduto());
	System.out.println("Valor da compra: " + cliente.getValor());
	
	
	
}
}
