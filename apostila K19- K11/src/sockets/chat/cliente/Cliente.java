package sockets.chat.cliente;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket socket = new Socket("IP DO SERVIDOR", 10000);
		
		PrintStream saida = new PrintStream(socket.getOutputStream());
		
		Scanner entrada = new Scanner(socket.getInputStream());
		
		ClienteEmissorDeMensagem emissor = new ClienteEmissorDeMensagem(saida);
		
		TelaChat telachat = new TelaChat(emissor);
		
		ReceptorDeMensagem receptor = new ReceptorDeMensagem(entrada, telachat);
		
		Thread pilha = new Thread(receptor);
		
		pilha.start();
	}

}
