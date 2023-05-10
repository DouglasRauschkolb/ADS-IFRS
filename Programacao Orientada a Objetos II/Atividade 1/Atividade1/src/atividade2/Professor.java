
package atividade2;

/**
 *
 * @author douglas
 */
public class Professor extends Servidor {
    
    private String area_atuacao;
    
    public Double calculaSalario(){
        Double salario_final = null;
        switch(this.titulacao){
            case DOUTOR:
                salario_final = this.salario_base * 1.20;
                break;
            case MESTRE:
                salario_final = this.salario_base * 1.10;
                break;
            case ESPECIALISTA:
                salario_final = this.salario_base * 1.07;
                break;
            case GRADUADO:
                salario_final = this.salario_base * 1.02;
                break;
            default:
                System.out.println("Titulação inválida");
        }
        return salario_final;
    }

    @Override
    public String toString() {
        return "Professor{" + super.toString() + " area_atuacao=" + area_atuacao + '}';
    }

    public Professor(String nome, String numero_matricula, String rg, String cpf, EnumTitulacao titulacao, String area_atuacao) {
        super(nome, numero_matricula, rg, cpf, titulacao);
        this.area_atuacao = area_atuacao;
    }
    
}
