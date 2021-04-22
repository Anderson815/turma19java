programa
{
	
	funcao inicio()
	{
		//Variáveis
		inteiro anos, meses, dias, diasTotaisVividos

		//Entrada
		escreva("Quantos dias você viveu: ")
		leia(diasTotaisVividos)

		// Processamento
		anos = diasTotaisVividos / 365
		meses = (diasTotaisVividos % 365) / 30
		dias = ((diasTotaisVividos % 365) % 30)

		// Saida
		escreva("\nAnos: " + anos)
		escreva("\nMeses: " + meses)
		escreva("\ndias: " + dias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 413; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */