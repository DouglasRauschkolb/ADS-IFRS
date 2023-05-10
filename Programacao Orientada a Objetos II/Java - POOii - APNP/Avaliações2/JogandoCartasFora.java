import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class JogandoCartasFora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int entrada = 0;

        do {
            // Recebe o numero
            do {
                System.out.print("Digite um numero de 0 a 50: ");
                entrada = scanner.nextInt();
                if (entrada < 0 || entrada > 50) {
                    System.out.println("Numero inválido");
                }
            } while (entrada < 0 || entrada > 50);

            if (entrada > 0) {
                Stack baralho = new Stack<Integer>();
                ArrayList descartadas = new ArrayList<Integer>();

                // Monta o baralho
                for (int i = entrada; i > 0; i--) {
                    baralho.push(i);
                }

                // Desembaralha e seleciona as cartas
                int teste = 1;
                while (baralho.size() > 1) {    
                    if (teste % 2 != 0) {
                        descartadas.add(baralho.pop());
                    } else {
                        baralho.add(0, baralho.pop());
                    }
                    teste++;
                }

                // Mostra resultado
                System.out.print("Discarded cards: ");
                for (int i = 0; i < descartadas.size(); i++) {
                    if (i == (descartadas.size()-1)) {
                        System.out.print(descartadas.get(i));
                    } else {
                        System.out.print(descartadas.get(i) + ", ");
                    }
                }
                System.out.println();
                System.out.println("Remainig card: " + baralho.peek());
            }

        } while (entrada > 0);
    
    }

}