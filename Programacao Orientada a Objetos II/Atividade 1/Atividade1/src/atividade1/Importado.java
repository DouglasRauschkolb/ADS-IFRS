
package atividade1;

/**
 *
 * @author douglas.220997
 */
public class Importado extends Produto {

    public Importado(Integer codigo_produto, String nome_produto, Integer codigo_fabricante, String descricao, Double preco, Integer quantidade_estoque) {
        super(codigo_produto, nome_produto, codigo_fabricante, descricao, preco, quantidade_estoque);
        this.valor_imposto = 1.15;
    }

    @Override
    public String toString() {
        return "Produto Importado" + super.toString();
    }
 
}
