package iO;

import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class EscreverArquivoTest {
	
	public static void main(String[] args) throws IOException  {
		
		FileReader file = new FileReader("arquivo.txt");
		
		Scanner scanner = new Scanner(file);
		
		File file2 = new File ("arquivo2.txt");
		PrintStream p = new PrintStream(file2);
		FileWriter w = null;
		try {
			w = new FileWriter(file2);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		w.write("escrevendo");
		while(scanner.hasNext()) {
			
			String line = scanner.nextLine();
			p.println("Escrevendo no arquivo.\n "+line);
			//System.out.println(file2.exists());
			//System.out.println(file2.getAbsolutePath());
		}
		
		FileReader r = new FileReader("arquivo2.txt");
		Scanner ler = new Scanner(r);
		while(ler.hasNext()) {
			System.out.println("==========");

			String linha = ler.nextLine();
			System.out.println(linha);
		}
		file.close();
		((Closeable) file2).close();
		

	}

}
