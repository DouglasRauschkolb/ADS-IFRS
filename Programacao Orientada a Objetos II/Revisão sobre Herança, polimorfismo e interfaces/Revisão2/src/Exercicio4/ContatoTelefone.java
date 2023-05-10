
package Exercicio4;

/**
 *
 * @author douglas.220997
 */
public class ContatoTelefone implements Contato{
    
    private String nome;
    private String tipo;
    private String telefone;
    
    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getTipo() {
        return this.tipo;
    }

    @Override
    public String getContato() {
        return telefone;
    }

    
    public ContatoTelefone(String nome, String tipo, String telefone) {
        this.nome = nome;
        this.tipo = tipo;
        this.telefone = telefone;
    }
    
}
