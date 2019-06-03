package iO;

import java.io.OutputStream;
import java.io.PrintStream;

public class PrintStreamTest {
	
	public static void main(String[] args) {
		
		OutputStream console = System.out;
		PrintStream printStream = new PrintStream(console);
		
		printStream.print("Curso de Java e Orientação a Objetos.");
	}

}
