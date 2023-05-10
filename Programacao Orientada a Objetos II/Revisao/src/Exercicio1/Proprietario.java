package Exercicio1;

import java.util.Date;

/**
 *
 * @author douglas.rauschkolb
 */
public class Proprietario {
    
    private String      nome;
    private String      cpf;
    private String      rg;
    private Date        dt_nascimento;
    private Endereco    endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(Date dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Proprietario{" + "nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", dt_nascimento=" + dt_nascimento + ", endereco=" + endereco + '}';
    } 
    
    //Construtor
    public Proprietario(String nome, String cpf, String rg, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
    }     

}
