package Day0527;
class Th3 extends Thread{
	String str;
	
	Th3(String str, int n){
		this.str=str;
		setPriority(n); //������ �켱���� ����
	}
	public void run() {
		System.out.println(str);
		System.out.println(getPriority());
		//������ �켱���� ��
	}
}
public class Day052707 {

	public static void main(String[] args) {
		 Th3 t1=new Th3("����",Thread.MAX_PRIORITY);
		 Th3 t2=new Th3("�ǿ�",Thread.MIN_PRIORITY);
		 Th3 t3=new Th3("���",Thread.NORM_PRIORITY);
		 
		 t1.start();
		 t2.start();
		 t3.start();

	}

}
