
package Exercicio2B;

/**
 *
 * @author douglas.220997
 */
public class DVD extends Produto {
    
    private Double duracao;

    @Override
    public String toString() {
        return "DVDs{" + super.toString() + "duracao=" + duracao + '}';
    }

    public DVD(Double duracao, String nome, Double preco, Integer codigo_barra) {
        super(nome, preco, codigo_barra);
        this.duracao = duracao;
    }
   
}
