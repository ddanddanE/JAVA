package Day0527;
class Th extends Thread{//스레드 클래스 작성: 상속받아 만듬
	String name;
	
	Th(String n){
		name=n;
	}
	public void run() {//스레드 실행 시작 메소드(스레드 코드)
		for (int i = 0; i < 10; i++) {
			System.out.println(name);
			try {
				sleep(100);
			} catch (Exception e) {
			}
		}
	}
}
public class Day052703 {

	public static void main(String[] args) {
		Th t=new Th("스레드1");
		Th t1=new Th("스레드2");
		
		t.start();
		t1.start();
		

	}

}
