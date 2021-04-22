programa
{
	
	funcao inicio()
	{
		// Variáveis
		cadeia nome
		real celsius
		real fahrenheit

		// Entrada
		escreva("Digite o seu nome: ")
		leia(nome)

		escreva("Digite a temperatura celsius: ")
		leia(celsius)

		// Processo
		fahrenheit = (celsius * (9/5)) + 32

		// Saida
		escreva("Oi " + nome + ". " + celsius + "º Celsius convertido para o Fahrenheit é " + fahrenheit)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 265; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */