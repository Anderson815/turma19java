programa
{
	
	funcao inicio()
	{
		 //Variáveis
		 inteiro numero = 0
           inteiro numeroPorTres = 0
		
		 //Processo
		 escreva("Digite um número: ")
		 leia(numero)

           numeroPorTres = numero

	      escreva("\nA sequencia: ")
		
		 enquanto(numeroPorTres <= 100){
		 	escreva(numeroPorTres + " - ")
		 	numeroPorTres *= 3
		 }

		 escreva(numeroPorTres)
		 
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