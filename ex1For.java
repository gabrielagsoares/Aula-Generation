package lacosDeRepeticao;

public class ex1For {
		//Informar todos os números de 1000 a 1999 que quando divididos por 11
			//obtemos resto = 5			//%d chama os números inteiros 
	
	public static void main(String args[]) 
	{
		int num;
		for(num=1000; num<=1999; num++)
		if(num%11 == 5)
		{
			System.out.printf("\n %d", num);
			
				
		}
		
	}
}
