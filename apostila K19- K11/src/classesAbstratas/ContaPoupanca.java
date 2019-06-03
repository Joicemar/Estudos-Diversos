package classesAbstratas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta {

	private int diaDoAniversario;
	
	public void imprimeEstratoDetalhado() {
		System.out.println("======== Estrato Detalhado ========");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date data = new Date();
		
		System.out.println("DATA: "+ sdf.format(data));
		System.out.println("SALDO: "+ this.getSaldo());
		System.out.println("ANIVERSARIO: "+ this.diaDoAniversario);
	}
}
