package sockets.chat.cliente;

import java.util.Scanner;

public class ReceptorDeMensagem implements Runnable{

	private Scanner scanner;
	
	private TelaChat chat;
	
	
	
	public ReceptorDeMensagem(Scanner scanner, TelaChat chat) {
		this.scanner = scanner;
		this.chat = chat;
	}



	@Override
	public void run() {
		while(scanner.hasNextLine()) {
			String mensagem = scanner.nextLine();
			this.chat.adicionaMensagem(mensagem);
		}
	}

}
