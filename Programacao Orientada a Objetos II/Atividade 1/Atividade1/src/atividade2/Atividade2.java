
package atividade2;

/**
 *
 * @author douglas
 */
public class Atividade2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
    
        TecnicoAdministrativo servidor1 = new TecnicoAdministrativo("João", "12345", "1111111111", "111.111.111-11", EnumTitulacao.GRADUADO, 20);
        System.out.println(servidor1.toString());
        System.out.println("Salário: " + servidor1.calculaSalario());

        Professor servidor2 = new Professor("José", "999383", "9999999999", "999.999.999-99", EnumTitulacao.ESPECIALISTA, "Informatica");
        System.out.println(servidor2.toString());
        System.out.println("Salário: " + servidor2.calculaSalario());
    }
}
