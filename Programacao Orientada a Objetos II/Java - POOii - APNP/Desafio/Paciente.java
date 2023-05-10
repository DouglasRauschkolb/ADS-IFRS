public class Paciente implements Comparable {

    private String nome;
    private Integer prioridade;

    public Paciente(String nome, Integer prioridade){
        super();
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Integer getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Integer prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public int compareTo(Object o) {
        if (this.prioridade > ((Paciente)o).getPrioridade()){
	        return 1;
	    } else if (this.prioridade < ((Paciente)o).getPrioridade()){
	        return -1;
	    }
	    return 0;
    }

    @Override
    public String toString() {
        
        return "Paciente [ nome= " + nome + ", prioridade= " + prioridade + "]"; 
    }
    
}
