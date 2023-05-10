programa
{
	funcao inicio()
	{
		real salario, salariofinal
		
		escreva("Digite o salário inicial: ")
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
		escreva ("\n Seu salário final será: ", salariofinal, "\n")	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 45; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */