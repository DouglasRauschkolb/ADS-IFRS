import java.util.Arrays;
import java.util.Scanner;

public class RevisaoVetores {
	
	private static Integer[] vetor_inteiros = new Integer[5];
	
	public static void main(String[] args) {
		
		lerValoresVetor();
		
		mostrarValoresVetor();
		
		ordernarCrescente();
		mostrarValoresVetor();
		
		ordernarDecrescente();
		mostrarValoresVetor();
	}
	
	private static void lerValoresVetor() {
		
		for(int l_i = 0; l_i < vetor_inteiros.length; l_i++) {
			System.out.println("Digite o "+ (l_i+1) +"° valor inteiro: ");
			vetor_inteiros[l_i] = new Scanner(System.in).nextInt();
		}
		System.out.println("Muito Obrigado!");
	}
	
	private static void mostrarValoresVetor() {
		System.out.println("-------------------------");
		for(int l_i = 0; l_i < vetor_inteiros.length; l_i++) {
			System.out.println("Valor do "+ (l_i+1) +"° inteiro: " + vetor_inteiros[l_i]);
		}
		System.out.println("-------------------------");
	}
	
	private static void ordernarCrescente() {
		Arrays.sort(vetor_inteiros);
	}
	
	private static void ordernarDecrescente() {
		Integer l_aux;
		Integer vetor_aux[] = new Integer[vetor_inteiros.length];
		
		Arrays.sort(vetor_inteiros);
		
		l_aux = 0;
		for(int l_i = vetor_inteiros.length - 1; l_i >= 0; l_i--) {
			vetor_aux[l_aux] = vetor_inteiros[l_i];
			l_aux = l_aux + 1;
		}

		for(int l_i = 0; l_i < vetor_inteiros.length; l_i++) {
			vetor_inteiros[l_i] = vetor_aux[l_i];
		}		
	}

}
