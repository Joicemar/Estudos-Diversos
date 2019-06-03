package object;

public class TestFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		f1.setNome("Pedro");
		f2.setNome("Yusuki");
		
		System.out.println(f1.equals(f2));
	}
}
