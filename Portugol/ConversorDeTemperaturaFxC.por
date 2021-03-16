programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		// Variáveis
		cadeia nome
		real celsius
		real fahrenheit

		// Entrada
		escreva("Digite o seu nome: ")
		leia(nome)

		escreva("Digite a temperatura fahrenheit: ")
		leia(fahrenheit)

		// Processo
		celsius = (fahrenheit - 32) * 5/9

		// Saida
		escreva("Oi " + nome + ". " + fahrenheit + "º Fahrenheit convertido para o Celsius é " + Matematica.arredondar(celsius, 2))

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 307; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */