
package atividade1;

/**
 *
 * @author douglas.220997
 */
public class Atividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Importado produto_importado = new Importado(11111, "Produto 1", 123, "Produto Importado", 100.00, 1000);
        System.out.println(produto_importado.toString());
        produto_importado.Adicionar(100);
        produto_importado.Remover(50);

        Nacional produto_nacional = new Nacional(22222, "Produto 2", 321, "Produto Nacional", 100.00, 1000);
        System.out.println(produto_nacional.toString());
        produto_nacional.Adicionar(100);
        produto_nacional.Remover(50);
        
    }
    
}
