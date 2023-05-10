programa
{
	funcao inicio()
	{
		caracter texto[4] = {'C','A','S','A'}
		caracter certo[4] = {'-', '-', '-', '-'}
		caracter letras[7]
		caracter letra
		inteiro k, x, erros=0, acertos=0, aux, qLetras = 0
		faca{
			faca{
				leia(letra)
				x = 0
				para(k=0; k<qLetras; k=k+1){
					se (letra == letras[k]){
						x = x+1
					}
				}
				se (x == 0){
					letras[qLetras] = letra
					qLetras = qLetras + 1
				}
			}enquanto(x!=0)
			
			aux = acertos
			para(k=0; k<4; k=k+1){
				se(letra == texto[k]){
					certo[k] = letra
					acertos = acertos+1
				}
			}
			se (aux == acertos){
				erros = erros+1
			}
			
			
			para(k=0; k<4; k=k+1){
				escreva(certo[k])
			}
			escreva('\n')
			escreva("Acertos: ", acertos, '\n')
			escreva("Erros: ", erros, '\n')
		}enquanto(erros < 3 e acertos < 4)
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 512; 
 */