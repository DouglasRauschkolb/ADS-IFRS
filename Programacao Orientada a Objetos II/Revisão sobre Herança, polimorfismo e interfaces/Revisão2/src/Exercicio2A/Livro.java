
package Exercicio2A;

/**
 *
 * @author douglas.220997
 */
public class Livro extends Produto {
    
    private String autor;

    @Override
    public String toString() {
        return "Livros{" + super.toString() + "autor=" + autor + '}';
    }

    public Livro(String autor, String nome, Double preco) {
        super(nome, preco);
        this.autor = autor;
    }
    
}
