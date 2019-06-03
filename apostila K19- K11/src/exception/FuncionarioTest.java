package exception;

public class FuncionarioTest {
	
	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		
		try {
			f.aumentaSalario(0);			
		}catch(IllegalArgumentException e) {
			System.out.println("Houve um IllegalArgumentException ao aumentar o salario.");
		}
	}

}
