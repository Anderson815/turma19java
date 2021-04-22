programa
{
	
	funcao inicio()
	{
		 //Variáveis
		 inteiro numeroInfo = 1
		 inteiro numeroSoma = 1
		 inteiro soma = 0

		 escreva("Digite um número: ")
		 leia(numeroInfo)
		 numeroSoma = numeroInfo
		
		 faca{	 	
		 	soma += numeroSoma
		 	numeroSoma--
		 }enquanto(numeroSoma > 0)

		 escreva("A soma é " + soma)
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