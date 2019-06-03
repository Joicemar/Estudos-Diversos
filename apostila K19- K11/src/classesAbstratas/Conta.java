package classesAbstratas;

abstract class Conta {
	
	private int saldo;

	public abstract void imprimeEstratoDetalhado();
	
	public int getSaldo() {
		return saldo;
	}
}
