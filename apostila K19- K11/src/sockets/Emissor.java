package sockets;

import java.io.PrintStream;

public class Emissor {
	
	private PrintStream saida;
	
	public Emissor(PrintStream saida) {
		this.saida = saida;
	}
	
	public void enviar(String msg) {
		this.saida.println(msg);
	}

}
