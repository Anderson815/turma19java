programa
{
	
	funcao inicio()
	{
		 //Variáveis
		 inteiro soma = 0

		 //Processo
		 escreva("----- PROGRAMA DA SOMA - MULTIPLOS DE 3 E IMPARES -----")
		 
		 para(inteiro numero = 1; numero <= 500; numero++){
		 	se((numero % 2) == 1 e (numero % 3) == 0){
		 		soma+= numero
	 		}
		 }

		 escreva("\nA soma é " + soma)
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