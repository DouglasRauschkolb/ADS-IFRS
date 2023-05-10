programa
{

	inclua biblioteca Util --> util
	
	funcao inicio()
	{
		inteiro matNumeros [9][9], linha, coluna, cont[9], i, maisimp = 0

		para (i=0; i<9; i=i+1) {
			cont[i] = 0
		}
		
		para (linha=0; linha<9; linha = linha+1) {
			para (coluna=0; coluna<9; coluna = coluna+1){
				matNumeros[linha][coluna] = util.sorteia(1, 100)
			}
		}
		
			para (coluna=0; coluna<9; coluna = coluna+1){
				se (matNumeros[0][coluna]%2 != 0){
					cont[0] = cont[0]+1
				}
				se (matNumeros[1][coluna]%2 != 0){
					cont[1] = cont[1]+1
				}
				se (matNumeros[2][coluna]%2 != 0){
					cont[2] = cont[2]+1
				}
				se (matNumeros[3][coluna]%2 != 0){
					cont[3] = cont[3]+1
				}
				se (matNumeros[4][coluna]%2 != 0){
					cont[4] = cont[4]+1
				}
				se (matNumeros[5][coluna]%2 != 0){
					cont[5] = cont[5]+1
				}
				se (matNumeros[6][coluna]%2 != 0){
					cont[6] = cont[6]+1
				}
				se (matNumeros[7][coluna]%2 != 0){
					cont[7] = cont[7]+1
				}
				se (matNumeros[8][coluna]%2 != 0){
					cont[8] = cont[8]+1
				}
				
			}
		
		para (linha=0; linha<9; linha = linha+1) {
			para (coluna=0; coluna<9; coluna = coluna+1){
				escreva(matNumeros[linha][coluna], " / ")
			}
			escreva ("\n")
		}
		
		para (i=0; i<9; i=i+1) {
			se (cont[i] > maisimp)
			maisimp =i
		}
		escreva ("\n\n A linha que tem mais numeros impares é a linha ", maisimp+1, ".\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 340; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */