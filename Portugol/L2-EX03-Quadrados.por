programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		/*Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
*/

	//Variáveis
	real numero1 = 0
	real numero2 = 0
	real numero3 = 0
	real numero4 = 0

	real quadradoNumero1 = 0
	real quadradoNumero2 = 0
	real quadradoNumero3 = 0
	real quadradoNumero4 = 0

	//Processo
	escreva("Digite o 1º número: ")
	leia(numero1)

	escreva("Digite o 2º número: ")
	leia(numero2)

	escreva("Digite o 3º número: ")
	leia(numero3)

	escreva("Digite o 4º número: ")
	leia(numero4)

	quadradoNumero1 = Mat.potencia(numero1, 2)
	quadradoNumero2 = Mat.potencia(numero2, 2)
	quadradoNumero3 = Mat.potencia(numero3, 2)
	quadradoNumero4 = Mat.potencia(numero4, 2)

	se(quadradoNumero3 >= 1000.00){
		escreva("O quadrado do terceiro ultrapassou 1000 tendo como valor: " + quadradoNumero3)
	}senao{
		
		escreva("\n1º número: " + numero1 + " - Quadrado: " + quadradoNumero1)
		escreva("\n2º número: " + numero2 + " - Quadrado: " + quadradoNumero2)
		escreva("\n3º número: " + numero3 + " - Quadrado: " + quadradoNumero3)
		escreva("\n4º número: " + numero4 + " - Quadrado: " + quadradoNumero4)
	}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1276; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */