public class Testar {

    public static void main(String[] args) {
        
        FilaComPrioridade<Paciente> fila = new FilaComPrioridade<Paciente>(5);
        
        fila.enfileirar(new Paciente("Paciente 1", 3));
        fila.enfileirar(new Paciente("Paciente 2", 1));
        fila.enfileirar(new Paciente("Paciente 1", 2));

        System.out.println(fila.toString());

    }
    
}
