programa
{
	
	funcao inicio()
	{

		//Variáveis
		cadeia codigo = ""
		inteiro horas = 0
		
		inteiro horasExcedente = 0
		real salarioTotal = 0.00
		real salarioExcedente = 0.00

		//Processo
		escreva("Digite o código do funcionário: ")
		leia(codigo)

		escreva("Dige o total de horas trabalhadas: ")
		leia(horas)


		se(horas > 50){
			horasExcedente = horas - 50
			salarioExcedente = horasExcedente * 20.00
			salarioTotal = salarioExcedente + (50 * 10.00)
		}
		senao{
			salarioTotal = 10.00 * horas 
		}


		escreva("\nFuncionário: " + codigo)
		escreva("\nSalário Total: " + salarioTotal)
		escreva("\nSalário Excedente: " + salarioExcedente)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 38; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */