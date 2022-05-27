package Day0527;
class Th3 extends Thread{
	String str;
	
	Th3(String str, int n){
		this.str=str;
		setPriority(n); //쓰레드 우선순위 세팅
	}
	public void run() {
		System.out.println(str);
		System.out.println(getPriority());
		//쓰레드 우선순위 얻어냄
	}
}
public class Day052707 {

	public static void main(String[] args) {
		 Th3 t1=new Th3("민훈",Thread.MAX_PRIORITY);
		 Th3 t2=new Th3("의영",Thread.MIN_PRIORITY);
		 Th3 t3=new Th3("상우",Thread.NORM_PRIORITY);
		 
		 t1.start();
		 t2.start();
		 t3.start();

	}

}
