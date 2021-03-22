programa
{
	
	funcao inicio()
	{
		 //Variável
		 real valores[5]
		 inteiro indiceMaiorValor = 0
		 
		 //Processo
		 escreva("\nCAPTURA DE VALORES\n")		 
		 para(inteiro indice = 0; indice < 5; indice++){
		 	escreva("Digite o " + (indice + 1) + "º valor: ")
		 	leia(valores[indice])
		 }

		 escreva("\nVALORES ESCRITOS\n")
		 para(inteiro indice = 0; indice < 5; indice++){
		 	escreva("O " + (indice + 1) + "º valor: " + valores[indice] + "\n")

		 	se(valores[indiceMaiorValor] < valores[indice] ){
		 		indiceMaiorValor = indice
		 	}
		 }

		 escreva("\nO " + (indiceMaiorValor + 1) + "º valor: " + valores[indiceMaiorValor] + " é o maior\n")
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