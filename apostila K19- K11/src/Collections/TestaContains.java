package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaContains {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		HashSet set = new HashSet();
		
		long tempo = TestaContains.contains(list);
		System.out.println("Tempo do ArrayList "+ tempo + " ms");
		
		tempo = TestaContains.contains(set);
		System.out.println("tempo do HashSet "+ tempo + " ms");
		
	}
	public static long contains(Collection colecao) {
		
		int size = 100000;
		for(int i = 0; i < size; i++) {
			colecao.add(i);
		}
		
		long inicio = System.currentTimeMillis();
		
		for(int i = 0; i < size; i++) {
			colecao.contains(i);
		}
		long fim = System.currentTimeMillis();
		
		
		return fim - inicio;
	}

}
