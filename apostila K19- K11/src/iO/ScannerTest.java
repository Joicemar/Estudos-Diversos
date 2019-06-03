package iO;

import java.io.InputStream;
import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
		
		InputStream entrada = System.in;
		Scanner scanner = new Scanner(entrada);
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			System.out.println("Você digitou: "+linha);
		}
	}

}
