package Exercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Aplicação da Agenda.
 */
public final class AplAgenda {

    private static final Scanner scanner = new Scanner(System.in);
    /**
     * Onde são mantidos os contatos.
     */
    private static List contatos = new ArrayList();

    /**
     * Adiciona um contato.
     */
    private static void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    /**
     * Obtém um contato, dado o índice.
     */
    private static Contato obterContato(int indice) {
        if (indice < contatos.size()) {
            return (Contato) contatos.get(indice);
        } else {
            return null;
        }
    }

    /**
     * Imprime todos os contatos e seus índices.
     */
    private static void imprimirContatos() {
        if (contatos.size() == 0) {
            System.out.println("\tAgenda vazia.");
        } else {
            for (int i = 0; i < contatos.size(); i++) {
                Contato contato = (Contato) contatos.get(i);
                System.out.println("\t" + i + ": " + contato.getNome() + " ("
                        + contato.getTipo() + ")");
            }
        }
        System.out.println();
    }

    /**
     * Lê do teclado.
     */
    private static String lerTeclado() {
        return scanner.nextLine();
    }

    /**
     * Método main.
     */
    public static void main(String[] args) {
        System.out.println("Bem-vindo à Agenda.\n");
        System.out.println("Digite o comando. '?' para ajuda e 'S' para sair.");
        System.out.print("\n> ");
        // Lê o comando.
        String comando = lerTeclado();
        // Continua pedindo comandos até encontrar o comando S, de sair.
        while (!"S".equalsIgnoreCase(comando)) {
            // Comando ?: ajuda.
            if ("?".equals(comando)) {
                System.out.println(
                        "\nCOMANDOS DISPONÍVEIS:\n"
                        + " ?: Mostra esta lista de comandos;\n\n"
                        + " A: Mostra a agenda;\n"
                        + " C: Mostra um contato da agenda;\n"
                        + " S: Sai do programa;\n\n"
                        + "+T: Adiciona um telefone;\n"
                );
            } // Comando A: mostrar agenda.
            else if ("A".equalsIgnoreCase(comando)) {
                System.out.println("\nAGENDA:");
                imprimirContatos();
            } // Comando C: mostrar contato.
            else if ("C".equalsIgnoreCase(comando)) {
                executarMostrarContato();
            } // Comando +T: adicionar telefone.
            else if ("+T".equalsIgnoreCase(comando)) {
                executarAdicionarTelefone();
            }
            // Lê o próximo comando.
            System.out.print("\n> ");
            comando = lerTeclado();
        }
    }

    /**
     * Comando C: mostrar contato.
     */
    public static void executarMostrarContato() {
        // Lê o índice.
        System.out.print("\nNúmero: ");
        String indice = lerTeclado();
        // Verifica se é um número.
        if (indice.matches("[0-9]+")) {
            // Converte para inteiro.
            int i = Integer.parseInt(indice);
            // Verifica se o índice existe.
            if (i < contatos.size()) {
                // Imprime o contato.
                Contato contato = (Contato) contatos.get(i);
                System.out.println(
                        "\nNome: " + contato.getNome()
                        + "\n" + contato.getTipo() + ": " + contato.getContato()
                );
            } // Não existe.
            else {
                System.out.println("Agenda não contém item de número " + i);
            }
        } // Não é número.
        else {
            System.out.println("Não é um número.");
        }
    }

    /**
     * Comando +T: adicionar telefone.
     */
    public static void executarAdicionarTelefone() {
        //Solicita os dados ao usuário
        System.out.println("Infome o tipo do contato: (R) Residencial, (C) Comercial, (L)Celular e (F)Fax!");
        String tipo = lerTeclado();
        System.out.println("Infome o nome!");
        String nome = lerTeclado();
        System.out.println("Infome o telefone!");
        String telefone = lerTeclado();
        
        //Crio a variavel do tipo ContatoTelefone
        ContatoTelefone contatoTelefone = null;
        switch(tipo){
            case "R":
                //Instancio um Telefone Residencial
                contatoTelefone = new ContatoTelefoneResidencial(nome, telefone);
                break;
            case "C":
                //Instancio um Telefone Comercial
                contatoTelefone = new ContatoTelefoneComercial(nome, telefone);
                break;
            case "L":
                //Instancio um Telefone Celular
                contatoTelefone = new ContatoTelefoneCelular(nome, telefone);
                break;
            case "F":
                //Instancio um Telefone Fax
                contatoTelefone = new ContatoFax(nome, telefone);
                break;
                        
        }
        //Adiciona o contato no telefone
        adicionarContato(contatoTelefone);
    }
}
