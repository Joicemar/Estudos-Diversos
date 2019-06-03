package sockets.chat.cliente;

import java.io.PrintStream;

public class ClienteEmissorDeMensagem {

	private PrintStream saida;
	
	public ClienteEmissorDeMensagem(PrintStream saida) {
		this.saida = saida;
	}
	
	public void envia(String mensagem) {
		this.saida.println(mensagem);
	}
}
