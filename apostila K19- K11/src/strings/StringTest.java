package strings;

public class StringTest {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		p1.getNome("Palloma");
		p2.getNome("Paloma");
		
		System.out.println("Nome é igual? "+ p1.equals(p2));
		
		System.out.println(p1.nome.toUpperCase());
		System.out.println(p1.lower()+" , "+p1.uper());
		System.out.println(p1.nome);
		String frase = " Ola planeta Terra ";
		
		System.out.println(frase.trim());
		
		String[] palavras = frase.split(" ");
		System.out.println(palavras[2]);
		
	}

}
