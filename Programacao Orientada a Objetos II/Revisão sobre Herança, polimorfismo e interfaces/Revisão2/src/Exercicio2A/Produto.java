
package Exercicio2A;

/**
 *
 * @author douglas.220997
 */
public class Produto {
    
    protected String nome;
    protected Double preco;

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", preco=" + preco + '}';
    } 

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
}
