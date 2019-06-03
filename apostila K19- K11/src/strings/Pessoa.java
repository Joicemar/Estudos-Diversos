package strings;

public class Pessoa {
	
	public String nome;
	
	public void getNome(String nome) {
		this.nome = nome;
	}
	
	public String uper() {
		return nome.toUpperCase();
	}
	
	public String lower() {
		return nome.toLowerCase();
	}
		
	@Override
	public boolean equals(Object obj) {
		Pessoa pessoa = (Pessoa) obj;
		return pessoa.nome == this.nome;
	}

}
