package interfaces;

public interface Conta {
	
	void deposita(double valor);
	void saca(double valor);
}


/*
 * As classes concretas que implementam uma interface são obrigadas a possuir uma implementação
para cada método declarado na interface. Caso contrário, ocorrerá um erro de compilação.
 */

/*
 * Como exemplo, suponha que a classe CONTACORRENTE implemente a interface CONTA.
Podemos guardar a referência de um objeto do tipo CONTACORRENTE em uma variável do
tipo CONTA:  Conta c = new ContaCorrente();
 */ 