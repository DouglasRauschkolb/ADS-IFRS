
package Exercicio2B;

import java.util.Objects;

/**
 *
 * @author douglas.220997
 */
public class Produto {
    
    protected String nome;
    protected Double preco;
    protected Integer codigo_barra;
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        return Objects.equals(this.codigo_barra, other.codigo_barra);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.codigo_barra);
        return hash;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", preco=" + preco + ", codigo_barra=" + codigo_barra + '}';
    }

    public Produto(String nome, Double preco, Integer codigo_barra) {
        this.nome = nome;
        this.preco = preco;
        this.codigo_barra = codigo_barra;
    }
    
}
