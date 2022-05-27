package Day0520;

class Human{
	String name;
	int age;
	void show() {
		System.out.println(name+" "+age);
	}
}
class Student extends Human{
	String major;
	
	void pr() {
		show();
		System.out.println(major);
	}
}

public class Day052002 {
	public static void main(String[] args) {
		Human h = new Human();
		Student s = new Student();
		
		s.name="¿ëÇÐ";
		s.age=30;
		s.show();
		s.major="IT";
		s.pr();
	}
	public void ted() {
		
	}
}
