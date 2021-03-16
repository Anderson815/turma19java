programa
{
	
	funcao inicio()
	{
		//Variáveis
		inteiro anos, meses, dias, diasTotaisVividos

		//Entrada
		escreva("Quantos anos você tem: ")
		leia(anos)

		escreva("Quantos meses você tem: ")
		leia(meses)

		escreva("Quantos dias você tem: ")
		leia(dias)

		// Processamento
		diasTotaisVividos = anos * 365 + meses * 30 + dias

		// Saida
		escreva("\nVocê viveu até agora " + diasTotaisVividos + " dias")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 410; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */