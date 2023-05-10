
package Exercicio2C;

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

    public Livro(String autor, String nome, Double preco, Integer codigo_barra) {
        super(nome, preco, codigo_barra);
        this.autor = autor;
    }
    
}
