package EXAM;
class Grade{
	private int english;
	private int math;
	private int science;
	
	public Grade() {
		// TODO Auto-generated constructor stub
	}
	
	public Grade(int english, int math, int science) {
		this.english=english;
		this.math=math;
		this.science=science;
	}
	int getE() {
		return english;
	}
	int getM() {
		return math;
	}
	int getS() {
		return science;
	}
	
	double avg() {
		double d = (english+math+science)/3;
		return d;
	}
	
	
}
public class Day0527a1 {

	public static void main(String[] args) {
		Grade g = new Grade();
		
		Grade g1 = new Grade(100, 23, 70);
		
		System.out.println("�⺻ ������");
		System.out.println("��������: "+g.getE());
		System.out.println("��������: "+g.getM());
		System.out.println("��������: "+g.getS());
		System.out.println(g.avg());
		
		System.out.println("==================================");
		
		System.out.println("�ʱ�ȭ ������");
		System.out.println("��������: "+g1.getE());
		System.out.println("��������: "+g1.getM());
		System.out.println("��������: "+g1.getS());
		System.out.println(g1.avg());
	}

}

