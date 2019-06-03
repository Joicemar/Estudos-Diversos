package iO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class LerAquivo {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		InputStream ler = new FileInputStream("arquivo.txt");
		Scanner scanner = new Scanner(ler);
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			System.out.println(linha);
		}
		
	}

}
