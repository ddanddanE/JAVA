package Day0526;
interface IT{
	public void java();
}
class Student{
	public void study(IT it) {
		it.java();
	}
}
class ITStudent implements IT{
	public void java() {
		System.out.println("�ڹ� ����");
	}
}
class DBStudent implements IT{
	public void java() {
		System.out.println("�����ͺ��̽� ����");
	}
}

public class Day052604 {

	public static void main(String[] args) {
		Student s=new Student();
		ITStudent i=new ITStudent();
		DBStudent d=new DBStudent();
		s.study(i);//IT i = i;
		s.study(d);//IT i = d;

	}

}
