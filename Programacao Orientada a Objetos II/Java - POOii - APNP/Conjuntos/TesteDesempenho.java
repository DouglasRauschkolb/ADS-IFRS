public class TesteDesempenho {
    
    public static void main(String[] args) {
        
        /*
        long inicio = System.currentTimeMillis();

        ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();

        for (int i = 0; i < 50000; i++) {
            conjunto.adiciona("palavra" + i);
        }

        for (int i = 0; i < 50000; i++) {
            conjunto.contem("palavra" + i);
        }

        long fim = System.currentTimeMillis();

        System.out.println( "Teste conjunto sem melhorias: " + (fim-inicio)); // TEMPO SEM AS MELHORIAS: 29705
        */

        
        long inicio_melhoria = System.currentTimeMillis();

        ConjuntoEspalhamentoMelhorado conjunto_melhoria = new ConjuntoEspalhamentoMelhorado();

        for (int i = 0; i < 50000; i++) {
            conjunto_melhoria.adiciona("palavra" + i);
        }

        for (int i = 0; i < 50000; i++) {
            conjunto_melhoria.contem("palavra" + i);
        }

        long fim_melhoria = System.currentTimeMillis();

        System.out.println( "Teste conjunto com melhorias: " + (fim_melhoria-inicio_melhoria)); // TEMPO COM AS MELHORIAS: 162
        

    }

    // Pesquisar qual API do Java implementa esta estrutura de dados.
    /* 
        Implementão a classe java.util.Set, mas existem três implementações: java.util.HashSet, java.util.LinkedHashSet e java.util.TreeSet
    */

}
