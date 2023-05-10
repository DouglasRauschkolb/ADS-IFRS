programa
{
	funcao inicio()
	{
		caracter palavra [7] = {'D', 'O', 'U', 'G', 'L', 'A', 'S'}
		caracter acerto [7] = {'-', '-', '-', '-', '-', '-', '-'}
		caracter letrasdigitadas[7]
		caracter letra
		inteiro i, erros = 0, acertos = 0, aux


		faca {

			escreva ("\n Digite uma letra: ")
			leia (letra)
			aux = acertos
			para (i=0; i<7; i=i+1){
				se (letra == palavra[i]) {
					acerto[i] = letra
					acertos = acertos + 1
				} 
			}
				se (aux == acertos) {
					erros = erros + 1
				}
			
			para (i=0; i<7; i=i+1){
				escreva(acerto[i])
			}
		} enquanto (erros < 5  e acertos < 7)
	}		
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 180; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */