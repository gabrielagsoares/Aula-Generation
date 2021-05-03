programa
{
    
    funcao inicio()
    {
        inteiro m[3][3], soma = 0, somaD = 0

        para(inteiro l = 0; l < 3; l ++){
            para(inteiro c = 0; c < 3 ; c ++){
            
            escreva("\nInsira o valor: ")
            leia(m[l][c])
            

             soma += m[l][c]
            somaD = m[0][0] + m[1][1] + m [2][2]
        
            }
        }
        
        escreva("\nA soma dos valores da matriz é: " + soma)
        escreva("\nA soma dos valores da primeira diagonal da matriz é: " + somaD)
    }
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 429; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {m, 6, 16, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */