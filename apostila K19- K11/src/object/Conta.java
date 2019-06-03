package object;

public class Conta {
	
	private int numero;
	private double salario;
	
	public String toString() {
		return "Conta numero: "+this.numero+" saldo: "+ this.salario;
	}
	
	@Override
	public boolean equals(Object obj) {
		Conta conta = (Conta) obj;
		return conta.numero == this.numero;
	}

}
