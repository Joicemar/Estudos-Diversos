package sockets.chat.server;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {
	public static void main(String[] args) throws IOException {
		
		Distribuidor distribuidor = new Distribuidor();
		
		ServerSocket serversocket = new ServerSocket(10000);
		
		Registrador registrador = new Registrador(distribuidor, serversocket);
		Thread pilha = new Thread(registrador);
		pilha.start();
		
	}

}
