package Day0527;

class Th1 implements Runnable {
	String name;
	
	Th1(String n){
		name = n;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				
			}
			}

	}

}

public class Day052704 {
	public static void main(String[] args) {
		Th1 t = new Th1("½º·¹µå1");
		Thread t1 = new Thread(t);
		t1.start();
	}
}

