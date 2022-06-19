package Day0601;

import java.util.HashSet;
class Student{
	String num;
	String name;
	public Student(String num, String name) {
		this.num = num;
		this.name = name;
	}
	void show() {
		System.out.println(num+" "+name);
	}
	/*@Override
	public int compareTo(Student s) {
		if(num>s.num) {
			return 1;
		}else if (num<s.num) {
			return-1;
		}else {
			return 0;
		}
		
		
	}*/
	@Override
	public String toString() {
		return num + "," + name;
	}
	@Override
	public int hashCode() {
		return Integer.parseInt(num);
	}
	@Override
	public boolean equals(Object obj) {
		Student std = (Student)obj;
		if(std.num == num) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
public class Day060106 {

	public static void main(String[] args) {
		HashSet<Student> set = new HashSet<Student>();
		set.add(new Student("100", "ȫ�浿"));
		set.add(new Student("200", "������"));
		set.add(new Student("300", "�̼���"));
		set.add(new Student("400", "�����"));
		set.add(new Student("100", "���߱�"));
		System.out.println(set);
	}

}
