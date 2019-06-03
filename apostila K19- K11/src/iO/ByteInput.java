package iO;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteInput {

	public static void main(String[] args) throws IOException {
		/**
		 * @param
		 * InputStream recebe somente byte a byte na entrada de usuario.
		 */
		InputStream entrada = System.in;

		int i;

		i = entrada.read();
		System.out.println("Valor lido: " + i);

		//Outputstream retorna um byte pelo numero representando um parâmetro.
		OutputStream saida = System.out;
		saida.write(120);
		saida.flush();
	}

}
