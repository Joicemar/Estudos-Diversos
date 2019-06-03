package interfaces;

public class TestaInterfaces {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		cc.deposita(100);
		System.out.println("Saldo " + cc.getSaldo());
	}

}
