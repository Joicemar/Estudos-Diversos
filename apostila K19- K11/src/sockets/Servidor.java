package sockets;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	public static void main(String[] args) throws IOException {
		
		ServerSocket server = new ServerSocket(10000);
		
		Socket socket = server.accept();
		
		PrintStream saida = new PrintStream(socket.getOutputStream());
		
		saida.println("Você se conectou.");
	}
	

}
