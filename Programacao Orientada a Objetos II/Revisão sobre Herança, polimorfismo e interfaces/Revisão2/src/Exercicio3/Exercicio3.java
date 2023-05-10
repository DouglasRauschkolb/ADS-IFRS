package Exercicio3;

import java.util.Scanner;
import javax.sound.midi.Soundbank;

/**
 *
 * @author douglas.220997
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas formas você deseja informar: ");
        int numero_formas = scan.nextInt();
        FormaGeometrica formas[] = new FormaGeometrica[numero_formas];

        for (int l_i = 0; l_i < numero_formas; l_i++) {
            System.out.println("Deseja criar: \n 1 - Quadrado \n 2 - Retângulo \n 3 - Circulo");
            System.out.println("Digite a opção: ");
            int tipo_forma = scan.nextInt();

            switch (tipo_forma) {
                case 1:
                    System.out.println("Informe o tamanho do lado do quadrado: ");
                    double lado = scan.nextDouble();
                    formas[l_i] = new Quadrado(lado);
                    break;
                case 2:
                    System.out.println("Informe o tamanho da base: ");
                    double base = scan.nextDouble();
                    System.out.println("Informe a altura: ");
                    double altura = scan.nextDouble();
                    formas[l_i] = new Retangulo(base, altura);
                    break;
                case 3:
                    System.out.println("Informe o tamanho do raio: ");
                    double raio = scan.nextDouble();
                    formas[l_i] = new Circulo(raio);
                    break;
                default:
                    System.out.println("Opção inválida");
                    l_i = l_i - 1;

            }
        }

        for (int l_i = 0; l_i < numero_formas; l_i++) {
            System.out.println("################# Forma " + (l_i+1) + " ##################");
            System.out.println(formas[l_i].toString());
            System.out.println("Perimetro: " + formas[l_i].calculaPerimetro());
            System.out.println("Area: " + formas[l_i].calculaArea());

        }
    }
}
