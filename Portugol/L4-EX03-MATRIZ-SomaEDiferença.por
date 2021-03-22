programa
{
	
	funcao inicio()
	{
		 const inteiro linha = 4
		 const inteiro coluna = 6
		 
		 inteiro n1[linha][coluna]
		 inteiro n2[linha][coluna]
		 inteiro m1[linha][coluna]
		 inteiro m2[linha][coluna]

		 escreva("----- MATRIZ N1 -----")
		 para(inteiro indiceLinha = 0; indiceLinha < linha; indiceLinha++){
		 	escreva("\nLINHA " + indiceLinha + "\n")

		 	para(inteiro indiceColuna =0; indiceColuna < coluna; indiceColuna++){
				inteiro valor
		 		
		 		escreva("\tCOLUNA " + indiceColuna + ": ")
		 		leia(valor)

		 		n1[indiceLinha][indiceColuna] = valor
		 	}
		 }

		 escreva("\n----- MATRIZ N2 -----")
		 para(inteiro indiceLinha = 0; indiceLinha < linha; indiceLinha++){
		 	escreva("\nLINHA " + indiceLinha + "\n")

		 	para(inteiro indiceColuna =0; indiceColuna < coluna; indiceColuna++){
				inteiro valor
		 		
		 		escreva("\tCOLUNA " + indiceColuna + ": ")
		 		leia(valor)

		 		n2[indiceLinha][indiceColuna] = valor
		 	}
		 }

		 escreva("\n----- MATRIZ M1 (SOMA DE N1 COM N2) -----")
		 para(inteiro indiceLinha = 0; indiceLinha < linha; indiceLinha++){
		 	escreva("\n")

		 	para(inteiro indiceColuna =0; indiceColuna < coluna; indiceColuna++){
				inteiro soma
				soma = n1[indiceLinha][indiceColuna] + n2[indiceLinha][indiceColuna]
				m1[indiceLinha][indiceColuna] = soma
				
		 		escreva("[" + m1[indiceLinha][indiceColuna] + "] ")
		 	}
		 }	

		 escreva("\n\n----- MATRIZ M2 (DIFERENÇA DE N1 COM N2) -----")
		 para(inteiro indiceLinha = 0; indiceLinha < linha; indiceLinha++){
		 	escreva("\n")

		 	para(inteiro indiceColuna =0; indiceColuna < coluna; indiceColuna++){
				inteiro soma
				soma = n1[indiceLinha][indiceColuna] - n2[indiceLinha][indiceColuna]
				m2[indiceLinha][indiceColuna] = soma
				
		 		escreva("[" + m2[indiceLinha][indiceColuna] + "] ")
		 	}
		 }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 32; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */