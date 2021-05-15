package exercicioCollections;

import java.util.ArrayList;
import java.util.Collections;

/*com Collection do tipo List do Java para manipular os dados
 1-Armazenar dados da List/ 2-Remover dados da list;
3- Atualizar dados da list/ 4-Apresentar todos os dados da list.
 */
public class loja {
	public static void main(String[] args) {

		String estoque1 = "Calça";
		String estoque2 = "Camiseta";
		String estoque3 = "Bermuda";
		String estoque4 = "Jaqueta";
		String estoque5 = "Vestido";
		String estoque6 = "Saia";
		
		ArrayList<String> estoque = new ArrayList<>();
		estoque.add(estoque1);  
		estoque.add(estoque2); 	
		estoque.add(estoque3);	
		estoque.add(estoque4);
		estoque.add(estoque5);
		estoque.add(estoque6);
		
		System.out.println("Estoque : " + (estoque));
		
		
		estoque.remove(2); //remover posições 
		estoque.remove(0);
		estoque.remove(3);
		System.out.println("\nPeças disponíveis em estoque: " + (estoque)); //lista atualizada 
		
		
		
	}
}