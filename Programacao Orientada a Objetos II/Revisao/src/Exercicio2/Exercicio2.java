package Exercicio2;

/**
 *
 * @author douglas.rauschkolb
 */
public class Exercicio2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        
        //Criando Assistente administrativo
        Administrativo admin = new Administrativo(11111, "José");
        admin.setTurno("Noite");
        admin.setAdicional_noturno(500.00);
        
        //Criando Assistente tecnico
        Tecnico tecnico = new Tecnico(22222, "João");
        tecnico.setBonus_salarial(200.00);
        
        System.out.println("Admin - Nome: " + admin.getNome() + " Matricula: " + admin.getNr_matricula());
        
        System.out.println("Tecnico - Nome: " + tecnico.getNome() + " Matricula: " + tecnico.getNr_matricula());

    }
    
}
