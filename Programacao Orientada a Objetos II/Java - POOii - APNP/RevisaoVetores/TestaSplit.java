
public class TestaSplit {
	
	public static void main(String[] args) {
		
		testeSplit();
		
	}
	
	private static void testeSplit() {
		String frase = "Socorram-me, subi no ônibus em Marrocos";
		Integer l_i;

		String[] palavras = frase.split(" ");
		
		for(l_i = palavras.length - 1; l_i >= 0; l_i--) {
			System.out.print(palavras[l_i] + " ");
		}
	}

}
