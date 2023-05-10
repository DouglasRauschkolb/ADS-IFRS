
package Exercicio2A;

/**
 *
 * @author douglas.220997
 */
public class CD extends Produto {
    
    private Integer numero_faixa;

    @Override
    public String toString() {
        return "CDs{" + super.toString()+ "numero_faixa=" + numero_faixa + '}';
    }

    public CD(Integer numero_faixa, String nome, Double preco) {
        super(nome, preco);
        this.numero_faixa = numero_faixa;
    }
    
}
