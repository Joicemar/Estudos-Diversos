package threads;

public class TestThread {
	public static void main(String[] args) {
		
		ExThread teste = new ExThread();

		Thread thread = new Thread(teste);
		
		thread.start();
		
	}

	/**
	 * @param
	 * As tarefas s�o executadas �dentro� de objetos da classe Thread.
	 * Para cada tarefa que desejamos executar, devemos criar um objeto
	 *  da classe Thread e associ�-lo ao objeto que define a tarefa.
	 *  
	 *  Depois de associar uma tarefa (objeto de uma classe que implementa Runnable)
	 *   a um objeto da classe Thread, devemos �disparar� a execu��o da thread 
	 *   atrav�s dom�todo start().
	 */
}

