package Day0523;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
class Student{
	String a;
	String b;
	public Student(String a,String b) {
		this.a=a;
		this.b=b;
	}
	void pr() {
		System.out.println(a+" "+b);
	}
}

public class Day052303 {

	public static void main(String[] args) {
		//1.
		try {
			FileWriter fw = new FileWriter("java.txt");
			InputStreamReader isr = new InputStreamReader(System.in);
			int r=-1;
			while ((r=isr.read())!=-1) {
				fw.write(r);
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		//2.
		Student s1 = new Student("김길동","kim");
		Student s2 = new Student("이길동","lee");
		s1.pr();
		s2.pr();
	}

}
