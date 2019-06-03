package interfaces;

public interface Conta {
	
	void deposita(double valor);
	void saca(double valor);
}


/*
 * As classes concretas que implementam uma interface s�o obrigadas a possuir uma implementa��o
para cada m�todo declarado na interface. Caso contr�rio, ocorrer� um erro de compila��o.
 */

/*
 * Como exemplo, suponha que a classe CONTACORRENTE implemente a interface CONTA.
Podemos guardar a refer�ncia de um objeto do tipo CONTACORRENTE em uma vari�vel do
tipo CONTA:  Conta c = new ContaCorrente();
 */ 