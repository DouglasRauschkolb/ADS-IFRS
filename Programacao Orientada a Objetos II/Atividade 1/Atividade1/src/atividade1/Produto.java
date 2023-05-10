
package atividade1;

/**
 *
 * @author douglas.220997
 */
public abstract class Produto {
    
    protected Integer codigo_produto;
    protected String nome_produto;
    protected Integer codigo_fabricante;
    protected String descricao;
    protected Double preco;
    protected Integer quantidade_estoque;
    protected Double valor_imposto;
    
    public void Adicionar(Integer quantidade){
        this.quantidade_estoque = this.quantidade_estoque + quantidade;
        System.out.println("Itens em estoque: " + this.quantidade_estoque);
    }
    
    public void Remover(Integer quantidade){
        this.quantidade_estoque = this.quantidade_estoque - quantidade;
        System.out.println("Preço unitário de compra: " + this.preco * this.valor_imposto);
        System.out.println("Itens em estoque: " + this.quantidade_estoque);
    }

    @Override
    public String toString() {
        return "{" + "codigo_produto=" + codigo_produto + ", nome_produto=" + nome_produto + ", codigo_fabricante=" + codigo_fabricante + ", descricao=" + descricao + ", preco=" + preco + ", quantidade_estoque=" + quantidade_estoque + ", valor_imposto=" + valor_imposto + '}';
    }

    public Produto(Integer codigo_produto, String nome_produto, Integer codigo_fabricante, String descricao, Double preco, Integer quantidade_estoque) {
        this.codigo_produto = codigo_produto;
        this.nome_produto = nome_produto;
        this.codigo_fabricante = codigo_fabricante;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade_estoque = quantidade_estoque;
    }
}
