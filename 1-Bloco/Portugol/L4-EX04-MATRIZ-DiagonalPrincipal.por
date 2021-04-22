programa
{
	
	funcao inicio()
	{
		 const inteiro linha = 3
		 const inteiro coluna = 3
		 
		 inteiro matriz[linha][coluna]
		 inteiro somaGeral = 0
		 inteiro somaDiagonal = 0

		 escreva("----- MATRIZ -----")
		 para(inteiro indiceLinha = 0; indiceLinha < linha; indiceLinha++){
		 	escreva("\nLINHA " + indiceLinha + "\n")

		 	para(inteiro indiceColuna =0; indiceColuna < coluna; indiceColuna++){
				inteiro valor
		 		
		 		escreva("\tCOLUNA " + indiceColuna + ": ")
		 		leia(valor)

		 		matriz[indiceLinha][indiceColuna] = valor
		 		somaGeral += valor

		 		se(indiceLinha == indiceColuna){
		 			somaDiagonal += valor
		 		}
		 	}
		 }

		 escreva("\n\nSoma de todos os elementos: " + somaGeral)
		 escreva("\nSoma dos elementos da diagonal principal: " + somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 37; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */