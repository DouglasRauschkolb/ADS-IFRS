package Exercicio1;

/**
 *
 * @author douglas.rauschkolb
 */
public class Marca {
    
    private String nome;
    private Integer nr_modelos;
    private Integer ano_lancamento;
    private Integer cod_identificador;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNr_modelos() {
        return nr_modelos;
    }

    public void setNr_modelos(Integer nr_modelos) {
        this.nr_modelos = nr_modelos;
    }

    public Integer getAno_lancamento() {
        return ano_lancamento;
    }

    public void setAno_lancamento(Integer ano_lancamento) {
        this.ano_lancamento = ano_lancamento;
    }

    public Integer getCod_identificador() {
        return cod_identificador;
    }

    public void setCod_identificador(Integer cod_identificador) {
        this.cod_identificador = cod_identificador;
    }

    @Override
    public String toString() {
        return "Marca{" + "nome=" + nome + ", nr_modelos=" + nr_modelos + ", ano_lancamento=" + ano_lancamento + ", cod_identificador=" + cod_identificador + '}';
    }  
}
