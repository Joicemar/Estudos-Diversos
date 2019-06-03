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
	 *  	documentação do parâmetro
	 *  @exception
	 *  	documentação da situação que gera a exception IllegalArgumentException
	 *  
	 */
	public DocumentacaoTeste(int num) {
		if(num < 1) {
			throw new IllegalArgumentException (" número negativo ");
		}
		this.num = num;
	}
	/**
	 * @return 
	 * 		documentação do valor de retorno no método
	 */
	public int getNum() {
		return num;
	}
}
