programa
{
	funcao inicio()
	{
		real salario, salariofinal
		
		escreva("Digite o sal�rio inicial: ")
		leia (salario)

		se (salario < 500.00 ) {
			salariofinal = (salario*1.05) + 150.00
		}
		senao {
			se (salario <= 600 ) {
				salariofinal = (salario*1.12) + 150.00
			}
			senao {
				se (salario > 600 e salario <= 1200) {
					salariofinal = (salario*1.12) + 100.00
				}
				senao {
					salariofinal = salario + 100.00
				}
			}
		}
		escreva ("\n Seu sal�rio final ser�: ", salariofinal, "\n")	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 45; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */