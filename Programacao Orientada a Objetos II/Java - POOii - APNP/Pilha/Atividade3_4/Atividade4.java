package Atividade3_4;

import java.util.Random;

public class Atividade4 {
    
    public static void main(String[] args) {

        Integer[][] numeros  = new Integer[3][3];
        Integer[] pontuacao  = new Integer[3];
        Boolean[] empatou = new Boolean[3];
        Integer vencedor_rodada;
        
        PilhaInteger pilha1 = new PilhaInteger(3);
        PilhaInteger pilha2 = new PilhaInteger(3);
        PilhaInteger pilha3 = new PilhaInteger(3);

        popularPilha(pilha1);
        popularPilha(pilha2);
        popularPilha(pilha3);

        pontuacao[0] = 0;
        pontuacao[1] = 0;
        pontuacao[2] = 0;

        for (int l_i = 0; l_i < 3; l_i++){

            numeros[0][l_i] = pilha1.desempilhar();
            numeros[1][l_i] = pilha2.desempilhar();
            numeros[2][l_i] = pilha3.desempilhar();

        }

        for (int l_i = 0; l_i < 3; l_i++){

            vencedor_rodada = -1;

            if (numeros[0][l_i] > numeros[1][l_i] && numeros[0][l_i] > numeros[2][l_i]){
                vencedor_rodada = 0;
            }

            if (numeros[1][l_i] > numeros[0][l_i] && numeros[1][l_i] > numeros[2][l_i]){
                vencedor_rodada = 1;
            }

            if (numeros[2][l_i] > numeros[1][l_i] && numeros[2][l_i] > numeros[0][l_i]){
                vencedor_rodada = 2;
            }

            if (vencedor_rodada == -1){
                // Se empatou a rodada, nenhum recebe os pontos
                empatou[l_i] = true;
            } else {
                // Não empatou
                empatou[l_i] = false;
                // Vencedor recebe a pontuação da rodada
                pontuacao[vencedor_rodada] = pontuacao[vencedor_rodada] + numeros[0][l_i] + numeros[1][l_i] + numeros[2][l_i];
                
                // Verifica se as rodadas anteriores empataram
                if (l_i > 0 ){
                    if (l_i == 1){
                        if (empatou[l_i-1]) {
                            pontuacao[vencedor_rodada] = pontuacao[vencedor_rodada] + numeros[0][l_i-1] + numeros[1][l_i-1] + numeros[2][l_i-1];
                        }
                    } else {
                        if (empatou[l_i-1]) {
                            pontuacao[vencedor_rodada] = pontuacao[vencedor_rodada] + numeros[0][l_i-1] + numeros[1][l_i-1] + numeros[2][l_i-1];
                        }
                        if (empatou[l_i-2]) {
                            pontuacao[vencedor_rodada] = pontuacao[vencedor_rodada] + numeros[0][l_i-2] + numeros[1][l_i-2] + numeros[2][l_i-2];
                        }
                    }
                }
            }
        }


        if ((pontuacao[0] > pontuacao[1]) && pontuacao[0] > pontuacao[2]){
            System.out.println("Pilha 1 venceu!!");
        } else if ((pontuacao[1] > pontuacao[2]) && pontuacao[1] > pontuacao[0]){
            System.out.println("Pilha 2 venceu!!");
        } else if ((pontuacao[2] > pontuacao[1]) && pontuacao[2] > pontuacao[0]){
            System.out.println("Pilha 3 venceu!!");
        } else {
            // Caso 2 ou 3 tiver empatado, não temos um vencedor
            System.out.println("Não tivemos vencedor.");
        }

    }

    private static void popularPilha(PilhaInteger pilha){

        Random random = new Random();

        for (int l_i = 1; l_i <=3; l_i++ ){
            pilha.empilhar(random.nextInt(9)+1);
        }
    }
}
