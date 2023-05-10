
package Exercicio2C;

import java.util.Arrays;

/**
 *
 * @author douglas.220997
 */
public class Exercicio2C {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Produto produtos[] = new Produto[5];
        
        produtos[0] = new Livro("Autor livro 1", "Título livro 1", 10.00, 11111);
        produtos[1] = new Livro("Autor livro 2", "Título livro 2", 20.00, 22222);
        produtos[2] = new CD(10, "CD 1", 5.00, 33333);
        produtos[3] = new CD(20, "CD 2", 8.00, 44444);
        produtos[4] = new DVD(130.4, "DVD 1", 50.00, 55555);
        
        for(Produto prod : produtos){
            System.out.println(prod.toString());
        }
        
        
        //Exercicio 2 - B
        int index = 0;
        boolean encontrou = false;
        Produto procura =  new CD(10, "CD 1", 5.00, 33333);
        for (Produto prod : produtos) {
            if(prod.equals(procura)){
                encontrou = true;
                break;
            }
            index++;            
        }
        if(encontrou){
            System.out.println("Produto encontrado no índice : " + index);            
        }else{
            System.out.println("Produto não encontrado!");            
        }
        
        //Exercicio 2 - C
        System.out.println("######### VETOR ORDENADO #########");
        Arrays.sort(produtos);
        for (Produto prod : produtos) {
            System.out.println(prod.toString());            
        }
        
    }   
}
