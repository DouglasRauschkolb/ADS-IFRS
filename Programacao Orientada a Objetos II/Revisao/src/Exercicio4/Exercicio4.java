package Exercicio4;

import java.util.Scanner;

/**
 *
 * @author douglas.rauschkolb
 */
public class Exercicio4 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        
        Scanner scan = new Scanner(System.in);
        
        //Criando endereço
        Endereco endereco = new Endereco();
        endereco.setCep("99999-99");
        endereco.setRua("Guido B. Donelli");
        endereco.setComplemento("2000");
        endereco.setBairo("Industrial");
        endereco.setCidade("Barão");
        endereco.setEstado("RS");
        
        //Criando imovel novo
        Novo imovel_novo = new Novo();
        imovel_novo.setEndereco(endereco);
        imovel_novo.setPreco(100000.00);    
        imovel_novo.setValor_adicional(20000.00);
        
        //Criando imovel velho
        Velho imovel_velho = new Velho();
        imovel_velho.setEndereco(endereco);
        imovel_velho.setPreco(100000.00);    
        imovel_velho.setDesconto_valor(20000.00);
        
        System.out.println("Digite 1 para Imóvel Novo ou 2 para Imóvel Velho:");
        
        int opcao = scan.nextInt();
        
        switch(opcao){
            case 1:
                System.out.println("Imóvel Novo!");
                System.out.println("Valor final: " + (imovel_novo.getPreco() + imovel_novo.getValor_adicional()));
                break;
            case 2:
                System.out.println("Imóvel Velho!");
                System.out.println("Valor final: " + (imovel_velho.getPreco() - imovel_velho.getDesconto_valor()));            
                break;
            default:
                System.out.println("Opção inválida!");
        }
        
    }  
}
