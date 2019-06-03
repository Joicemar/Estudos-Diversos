package object;

public class Funcionario {
	
	private double salario;
	private String nome;
	
	@Override
	public boolean equals(Object obj) {
		Funcionario f = (Funcionario) obj;
		return f.nome == this.nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}



}
