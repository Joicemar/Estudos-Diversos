package Collections;

import java.util.Collection;
import java.util.LinkedList;

public class TimeForTest {
	
	public static void main(String[] args) {
		
		int size = 4000;
		LinkedList<Integer> linked = new LinkedList<>();
		
		for(int i = 0; i < size; i++) {
			linked.add(i);
		}
		
		long tempo = TimeForTest.forTradicional(linked);
		System.out.println("tempo do for normal: "+ tempo + " ms");
		
		tempo = TimeForTest.testForeach(linked);
		System.out.println("tempo do foreach: "+ tempo + " ms");
	}
	
	private static long testForeach(LinkedList<Integer> linked) {

		long inicio = System.currentTimeMillis();
		
		for(Integer i: linked) {
			int x = linked.get(i);
		}
		long fim = System.currentTimeMillis();

		return fim - inicio;
	}

	public static long forTradicional(LinkedList<Integer> linked) {
		
		long inicio = System.currentTimeMillis();
		
		for(int i = 0; i < linked.size(); i++ ) {
			int x = linked.get(i);
		}
		long fim = System.currentTimeMillis();
		
		return fim - inicio;
	}

}








