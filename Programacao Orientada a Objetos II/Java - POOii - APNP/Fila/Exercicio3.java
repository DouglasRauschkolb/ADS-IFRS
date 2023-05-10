import java.util.Scanner;

public class Exercicio3 {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Fila atendimento_comercial     = new Fila(5);
        Fila atendimento_financeiro    = new Fila(5);

        Integer opcao;

        do {

            System.out.println("Você é: \n  1 - Atendente \n  2 - Cliente \n  3 - Sair");
            opcao = scanner.nextInt();

            switch(opcao){
                case 1: 
                    Integer opcao_atendente;
                    do {
                        System.out.println("Você é atendente: \n  1 - Comercial \n  2 - Financeiro \n  3 - Voltar");
                        opcao_atendente = scanner.nextInt();
                        switch(opcao_atendente){
                            case 1:
                                if (atendimento_comercial.estaVazia()) {
                                    System.out.println("Fila está vazia");
                                } else {
                                    System.out.println("Atendendo senha: " + atendimento_comercial.desenfileirar());
                                }
                                break;

                            case 2:
                                if (atendimento_financeiro.estaVazia()) {
                                    System.out.println("Fila está vazia");
                                } else {
                                    System.out.println("Atendendo senha: " + atendimento_financeiro.desenfileirar());
                                }    
                                break;

                            case 3:
                                System.out.println("Voltando");
                                break;

                            default:
                                System.out.println("Opção inválida");
                        }
                    } while (opcao_atendente != 3);   
                    break;

                case 2: 
                    Integer opcao_cliente;
                    do {
                        System.out.println("Você deseja atendimento: \n  1 - Comercial \n  2 - Financeiro \n  3 - Voltar ");
                        opcao_cliente = scanner.nextInt();
                        String proxima_senha;
                        switch(opcao_cliente){
                            case 1:
                                proxima_senha = "C" + String.format("%03d", (atendimento_comercial.getUltimaSenha()+1));
                                atendimento_comercial.enfileirar(proxima_senha);
                                System.out.println("Sua senha é: " + proxima_senha);
                                break;

                            case 2:
                                proxima_senha = "F" + String.format("%03d", (atendimento_financeiro.getUltimaSenha()+1));
                                atendimento_financeiro.enfileirar(proxima_senha);
                                System.out.println("Sua senha é: " + proxima_senha);
                                break;

                            case 3:
                                System.out.println("Voltando");
                                break;
                                
                            default:
                                System.out.println("Opção inválida");
                        }
                    } while (opcao_cliente != 3);
                    break;

                case 3: 
                    System.out.println("Saindo");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 3);

    }

}
