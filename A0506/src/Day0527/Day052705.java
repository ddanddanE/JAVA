package Day0527;
class Music extends Thread{
	String music;
	Music(String m) {
		music = m;
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(music);
		}
	}
}
class Movie implements Runnable{
	String movie;
	Movie(String m){
		movie = m;
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(movie);
		}
	}
}
public class Day052705 {

	public static void main(String[] args) {
		Music m= new Music("�������");
		m.start();
		
		Movie m1= new Movie("��ȭ���");
		Thread t=new Thread(m1);
		t.start();
		try {
			m.join();
			t.join();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
