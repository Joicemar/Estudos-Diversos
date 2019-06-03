package threads;

public class ExThread implements Runnable{
	
	public void run(){
		for(int i = 0; i < 11; i++) {
			System.out.println(i);
		}
	}

}
