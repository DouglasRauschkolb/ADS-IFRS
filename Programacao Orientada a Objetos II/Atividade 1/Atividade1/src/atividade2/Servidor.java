
package atividade2;

/**
 *
 * @author douglas
 */
public abstract class Servidor {
    
    protected String nome;
    protected String numero_matricula;
    protected String rg;
    protected String cpf;
    protected EnumTitulacao titulacao;
    protected final Double salario_base = 2000.00;

    @Override
    public String toString() {
        return "nome=" + nome + ", numero_matricula=" + numero_matricula + ", rg=" + rg + ", cpf=" + cpf + ", titulacao=" + titulacao + ", salario_base=" + salario_base;
    }

    public Servidor(String nome, String numero_matricula, String rg, String cpf, EnumTitulacao titulacao) {
        this.nome = nome;
        this.numero_matricula = numero_matricula;
        this.rg = rg;
        this.cpf = cpf;
        this.titulacao = titulacao;
    }
    
}
