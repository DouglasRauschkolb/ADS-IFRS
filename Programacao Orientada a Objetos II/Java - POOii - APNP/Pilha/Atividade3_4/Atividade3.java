package Atividade3_4;

import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        
        Integer valor;

        PilhaInteger pilha = new PilhaInteger(5);

        for (int l_i = 1; l_i <= 10; l_i++) {
            System.out.print("Digite o " + l_i + "° valor inteiro: ");
            valor = new Scanner(System.in).nextInt();

            if((valor % 2) == 0) {
                pilha.empilhar(valor);
            } else {
                if (pilha.desempilhar() == null){
                    System.out.println("Pilha está vazia");
                }
            }
        }

        if (pilha.estaVazia()) {
            System.out.println("Pilha vazia");
        } else {
            Integer l_tamanho = pilha.getTamanho();
            for(int l_i = 0; l_i < l_tamanho; l_i++){
                System.out.println("Desempilhado valor: " + pilha.desempilhar());
            }
        }

    }

}