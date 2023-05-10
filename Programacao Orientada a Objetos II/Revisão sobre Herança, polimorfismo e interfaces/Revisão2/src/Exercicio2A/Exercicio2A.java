
package Exercicio2A;

/**
 *
 * @author douglas.220997
 */
public class Exercicio2A {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Produto produtos[] = new Produto[5];
        
        produtos[0] = new Livro("Autor livro 1", "Título livro 1", 10.00);
        produtos[1] = new Livro("Autor livro 2", "Título livro 2", 20.00);
        produtos[2] = new CD(10, "CD 1", 5.00);
        produtos[3] = new CD(20, "CD 2", 8.00);
        produtos[4] = new DVD(130.4, "DVD 1", 50.00);
        
        for(Produto prod : produtos){
            System.out.println(prod.toString());
        }
    }   
}
