programa
{
	
	funcao inicio()
	{
		//Variáveis
		inteiro horas, minutos, segundos, segundosDuracao

		//Entrada
		escreva("Quantos segundos irá durar o evento: ")
		leia(segundosDuracao)

		// Processamento
		horas = segundosDuracao / 3600
		minutos = (segundosDuracao % 3600) / 60
		segundos = (segundosDuracao % 3600) % 60

		// Saida
		escreva("\nHoras: " + horas)
		escreva("\nMinutos: " + minutos)
		escreva("\nSegundos: " + segundos)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 429; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */