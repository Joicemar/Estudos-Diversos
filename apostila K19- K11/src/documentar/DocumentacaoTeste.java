package documentar;

/**
 * 
 * @author bboyg
 *
 * @version 1.0
 * 
 */
public class DocumentacaoTeste {
	int num;
	/**
	 *  @param
	 *  	documenta��o do par�metro
	 *  @exception
	 *  	documenta��o da situa��o que gera a exception IllegalArgumentException
	 *  
	 */
	public DocumentacaoTeste(int num) {
		if(num < 1) {
			throw new IllegalArgumentException (" n�mero negativo ");
		}
		this.num = num;
	}
	/**
	 * @return 
	 * 		documenta��o do valor de retorno no m�todo
	 */
	public int getNum() {
		return num;
	}
}
