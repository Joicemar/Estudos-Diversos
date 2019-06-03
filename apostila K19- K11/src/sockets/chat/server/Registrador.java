package sockets.chat.server;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import sockets.Emissor;

public class Registrador implements Runnable{
	
	private Distribuidor distribuidor;
	private ServerSocket serversocket;
	
	public Registrador(Distribuidor distribuidor, ServerSocket serversocket) {
		this.distribuidor = distribuidor;
		this.serversocket = serversocket;
	}

	@Override
	public void run() {
		while(true) {
			try {
				Socket socket = this.serversocket.accept();
				Scanner entrada = new Scanner(socket.getInputStream());
				PrintStream saida = new PrintStream(socket.getOutputStream());
				
				Receptor receptor = new Receptor(entrada, this.distribuidor);
				Thread pilha = new Thread(receptor);
				pilha.start();
				
				Emissor emissor = new Emissor(saida);
				this.distribuidor.adicionaEmissor(emissor);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
