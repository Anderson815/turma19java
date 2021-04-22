programa
{
	
	funcao inicio()
	{
		//Variáveis
		cadeia times[] = {"PALMEIRAS", "SANTOS", "SPFC", "CORINTHIANS"}
		inteiro pontos[4]

		//times[0] = Palmeiras
		//pontos[0] = 
		
		//Processo
		para(inteiro rodada = 1; rodada <= 4; rodada++){
			escreva(rodada + "º Rodada\n\n")
			para(inteiro indice = 0; indice < 4; indice++){
				cadeia resultado = ""
				
				escreva("O time " + times[indice] + " G - Ganhou, E - Empatou, P - Perdeu: ")
				leia (resultado)
	
				se(resultado == "G" ou resultado == "g"){
					pontos[indice] += 3
				}senao se(resultado == "E" ou resultado == "e"){
					pontos[indice] += 1
				}senao se(resultado == "P" ou resultado == "p"){
					pontos[indice] += 0
				}senao{
					escreva("Você não escolheu nenhuma das opções")
				}
	
			}
			escreva("\n")
		}

		escreva("RESULTADO\n\n")

		para(inteiro indice = 0; indice < 4; indice++){
			escreva("\no " + times[indice] + " tem " + pontos[indice] + " pontos")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 818; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */