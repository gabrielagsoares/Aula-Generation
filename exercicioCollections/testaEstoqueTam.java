package exercicioCollections;

import java.util.ArrayList;


public class testaEstoqueTam {

	public static void main(String[] args) {
		estoqueTamanho i1 = new estoqueTamanho("Camiseta ", 42);
		estoqueTamanho i4 = new estoqueTamanho("Vestido ", 36);
		estoqueTamanho i3 = new estoqueTamanho("Jaqueta ", 14);
	
		
		ArrayList<estoqueTamanho> estoque = new ArrayList<>();
		estoque.add( i1 );
		estoque.add( i4 );
		estoque.add( i3 );
	
		
		System.out.println(estoque);
	}
}
