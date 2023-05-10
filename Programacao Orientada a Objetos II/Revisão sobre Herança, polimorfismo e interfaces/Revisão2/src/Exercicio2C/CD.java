
package Exercicio2C;

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

    public CD(Integer numero_faixa, String nome, Double preco, Integer codigo_barra) {
        super(nome, preco, codigo_barra);
        this.numero_faixa = numero_faixa;
    }
    
}
