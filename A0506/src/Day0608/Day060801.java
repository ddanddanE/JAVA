package Day0608;

class MovieThread extends Thread {
	public void run() {
		for(int i = 0; i<3; i++) {
			System.out.print("영화를 재생합니다.");
		}
	}

}

class MusicThread implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i<3; i++) {
			System.out.print("음악 재생합니다.");
		}
	}

}

public class Day060801 {

	public static void main(String[] args) {
		Thread th1 = new MovieThread();

		th1.start();

		Thread th2 = new Thread(new MusicThread());

		th2.start();

	}

}
