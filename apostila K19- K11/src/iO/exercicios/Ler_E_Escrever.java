package iO.exercicios;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @return 
 * Crie um teste que faça a leitura do conteúdo 
 * de um arquivo e grave emoutro arquivo.
 */
public class Ler_E_Escrever {
	public static void main(String[] args) throws IOException {
		
		FileReader file = new FileReader("arquivo.txt");
		File file2 = new File("dados.txt");
		
		Scanner scanner = new Scanner(file);
		PrintStream write = new PrintStream(file2);
		
		while(scanner.hasNext()) {
			
			String line = scanner.nextLine();
			write.println(line);
		}
	}

}
