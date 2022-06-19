package Day0609;

public class Day060901 implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		try {
			Thread.sleep(10000);
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		Day060901 t1 =new Day060901();
		Thread th = new Thread(t1);
		th.start();
		}

	

}
