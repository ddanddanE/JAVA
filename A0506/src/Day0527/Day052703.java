package Day0527;
class Th extends Thread{//������ Ŭ���� �ۼ�: ��ӹ޾� ����
	String name;
	
	Th(String n){
		name=n;
	}
	public void run() {//������ ���� ���� �޼ҵ�(������ �ڵ�)
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
		Th t=new Th("������1");
		Th t1=new Th("������2");
		
		t.start();
		t1.start();
		

	}

}
