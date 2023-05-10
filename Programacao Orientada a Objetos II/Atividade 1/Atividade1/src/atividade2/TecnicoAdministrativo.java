
package atividade2;

/**
 *
 * @author douglas
 */
public class TecnicoAdministrativo extends Servidor {
    
    private int carga_horaria;
    
    public Double calculaSalario(){
        return this.salario_base;
    }

    @Override
    public String toString() {
        return "TecnicoAdministrativo{" + super.toString()+ " carga_horaria=" + carga_horaria + '}';
    }

    public TecnicoAdministrativo(String nome, String numero_matricula, String rg, String cpf, EnumTitulacao titulacao, int carga_horaria) {
        super(nome, numero_matricula, rg, cpf, titulacao);
        this.carga_horaria = carga_horaria;
    }
    
}
