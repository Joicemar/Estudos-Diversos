package interfaces;

public class ContaPoupanca implements Conta{

	private double saldo;

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
		
	}

	@Override
	public void saca(double valor) {
		this.saldo -= valor;
		
	}

	public double getSaldo() {
		return this.saldo;
	}
}
