package Exercicio3;

import java.util.Scanner;

/**
 *
 * @author douglas.rauschkolb
 */
public class Exercicio3 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        
        Ingresso ingresso = new Ingresso();
        ingresso.setValor(100.00);
        
        Normal normal = new Normal();
        normal.setValor(100.00);
        
        CamaroteSuperior camarote_superior = new CamaroteSuperior(ingresso);
        camarote_superior.setValor_adicional(100.00);
        camarote_superior.setValor_adicional_sup(25.00);
        
        CamaroteInferior camarote_inferior = new CamaroteInferior(ingresso);
        camarote_inferior.setValor_adicional(50.00);
        camarote_inferior.setLocalizacao("Direita");
        
        System.out.println("Digite 1 para normal ou 2 para VIP:");
        
        Scanner scan = new Scanner(System.in);
        
        int opcao_tipo = scan.nextInt();
        
        switch(opcao_tipo){
            case 1:
                normal.imprime();
                normal.imprimeValor();
                break;
            case 2:
                System.out.println("Ingresso VIP");
                System.out.println("Digite 1 para Camarote Superior ou 2 para Camarote Inferior:");
                
                int opcao_local = scan.nextInt();
                
                switch(opcao_local){
                    case 1:
                        System.out.println("VIP - Camarote Superior!");
                        System.out.println("Valor do ingresso: " + camarote_superior.retornaValorIngressoSup());
                        break;
                    case 2:
                        System.out.println("VIP - Camarote Inferior! " + camarote_inferior.getLocalizacao());
                        System.out.println("Valor do ingresso: "+ camarote_inferior.retornaValorvip());
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                } 
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
    
}
