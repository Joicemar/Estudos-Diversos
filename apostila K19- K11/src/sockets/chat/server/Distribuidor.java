package sockets.chat.server;

import java.util.ArrayList;
import java.util.Collection;

import sockets.Emissor;
import sockets.com.EmissorMensagem;

public class Distribuidor {
	private Collection<Emissor> emissores = new ArrayList<Emissor>();

	public void adicionaEmissor(Emissor emissor) {
		this.emissores.add(emissor);
	}
	
	public void distribuiMensagens(String mensagem) {
		for(Emissor emissor: this.emissores) {
			emissor.enviar(mensagem);
		}
	}
}
