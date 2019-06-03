package exception;

public class Funcionario {
	
	private double salario;
	
	public void aumentaSalario(double salario) {
		if(salario < 1) {
			IllegalArgumentException erro = new IllegalArgumentException();
			throw erro;
		}
		this.salario = salario;
	}

}
