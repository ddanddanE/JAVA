package Day0530;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person1 implements Serializable{
	String a;
	String b;
	int c;
	int d;
	public Person1(String a, String b, int c, int d) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
		void show() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
		}
		public Person1() {
			// TODO Auto-generated constructor stub
		}
	
}
class Circle1{

    private double x,y;

    private int r;

    Circle1(double x, double y, int r){

           this.x=x;  this.y=y; this.r=r; }

    void show(){

      System.out.println(x + " " +y + " " +r);}
    }
public class Day053010 {

	public static void main(String[] args) {
		Person1 p=new Person1("Jack", "computer", 20, 123); 
		
		p.show();   //데이터 다 출력하는 함수
		
		ObjectOutputStream os = null;
		try {
			os = new ObjectOutputStream(new FileOutputStream("1234.dat"));
			os.writeObject(p);
		}catch (Exception e) {
		}
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("1234.dat"));
			Person1 p1 = (Person1) in.readObject();
			System.out.println(p1.a);
			System.out.println(p1.b);
			System.out.println(p1.c);
			System.out.println(p1.d);
		}catch (Exception e) {
		}
	}

}
