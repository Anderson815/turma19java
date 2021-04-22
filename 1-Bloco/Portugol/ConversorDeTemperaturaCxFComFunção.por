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
		fahrenheit = fahrenheitConvertido(celsius)

		// Saida
		escreva("Oi " + nome + ". " + celsius + "º Celsius convertido para o Fahrenheit é " + fahrenheit)
	}

	funcao real fahrenheitConvertido(real celsius){
		real f = 0.00
		f = (celsius * (9/5)) + 32
		retorne f
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 491; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */