package Exercicio2;

/**
 *
 * @author douglas.rauschkolb
 */
public class Assistente extends Funcionario {
    
    private Integer nr_matricula;
    private String  nome;

    public Integer getNr_matricula() {
        return nr_matricula;
    }

    public void setNr_matricula(Integer nr_matricula) {
        this.nr_matricula = nr_matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   
    @Override
    public void exibeDados(){
        System.out.println("Sobreescrever!");
    }

    public Assistente(Integer nr_matricula, String nome) {
        this.nr_matricula = nr_matricula;
        this.nome = nome;
    }
    
}
