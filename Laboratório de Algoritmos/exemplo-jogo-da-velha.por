programa
{
	funcao inicio()
	{
		inteiro i, j, quantidade = 0
		caracter tab[3][3]
		caracter jogada
		logico fim = falso
		faca{
			leia(jogada)
		}enquanto(jogada != 'x' e jogada != 'o')

		/* Preenchi a matriz com -*/
		para(i=0; i<3; i++){
			para(j=0; j<3; j++){
				tab[i][j] = '-'
			}
		}

		/* Escrevi a matriz inicial */
		para(i=0; i<3; i++){
			para(j=0; j<3; j++){
				escreva(tab[i][j])
			}
			escreva('\n')
		}
		enquanto (fim != verdadeiro){
			faca{
				leia(i, j)
			}enquanto(tab[i][j] != '-')
			escreva("Saiu do repita\n")
			
			tab[i][j] = jogada

			se(tab[0][0] == tab[1][1] e tab[0][0] == tab[2][2] e tab[0][0] == jogada){
				escreva(jogada, " venceu!\n")
				fim = verdadeiro
			}
			se(tab[0][2] == tab[1][1] e tab[0][2] == tab[2][0] e tab[0][2] == jogada){
				escreva(jogada, " venceu!\n")
				fim = verdadeiro
			}
			para(i=0; i<3; i++){
				se(tab[i][0] == tab[i][1] e tab[i][0] == tab[i][2] e tab[i][0] == jogada){
					escreva(jogada, " venceu!\n")
					fim = verdadeiro
				}
			}
			para(j=0; j<3; j++){
				se(tab[0][j] == tab[1][j] e tab[0][j] == tab[2][j] e tab[0][j] == jogada){
					escreva(jogada, " venceu!\n")
					fim = verdadeiro
				}
			}
			
			se (jogada == 'x') {
				jogada = 'o'
			}senao{
				jogada = 'x'
			}
			
			para(i=0; i<3; i++){
				para(j=0; j<3; j++){
					escreva(tab[i][j])
				}
				escreva('\n')
			}
			quantidade = quantidade + 1
			se (quantidade == 9){
				escreva("Deu velha\n")
				fim = verdadeiro
			}
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1487; 
 */