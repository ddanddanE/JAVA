package Day0527;

import java.util.Scanner;

class PhoneNum{
	String name;
	String phone;
	public PhoneNum(String n, String p) {
		name = n;
		phone = p;
	}
	void show() {
		System.out.println("이름: "+name);
		System.out.println("번호: "+phone);
	}
}
class School extends PhoneNum{
	String major;
	public School(String n,String p,String m) {
	super(n, p);
	major = m;
	}
	@Override
	void show() {
		super.show();
		System.out.println("전공: "+major);
	}
}
class Company extends PhoneNum{
	String grade;
	public Company(String n, String p,String g) {
		super(n, p);
		grade =g;
	}
	@Override
	void show() {
		super.show();
		System.out.println("직급: "+grade);
	}
	
}
class Arr{
	PhoneNum [] arr;
	int n;
	Arr(int n){
		arr = new PhoneNum[n];
		n=0;
	}
	void add(PhoneNum p) {
		arr[n++]=p;
	}
	void friend(char ch) {
		Scanner sc= new Scanner(System.in);
		System.out.println("이름: ");
		String name = sc.next();
		System.out.println("번호: ");
		String phone = sc.next();
		
		switch(ch) {
		case 'A':
			System.out.println("전공: ");
			String major=sc.next();
			add(new School(name,phone,major));
			break;
		case 'B':
			System.out.println("직급: ");
			String grade=sc.next();
			add(new Company(name,phone,grade));
			break;
		}
	}
	void all() {
		for (int i = 0; i < n; i++) {
			arr[i].show();
		}
	}
}


	
public class Day052702 {

	public static void main(String[] args) {
		Arr ar = new Arr(5);
		
		while(true) {
			System.out.println("A.학교 친구정보");
			System.out.println("B.직장 친구정보");
			System.out.println("C.종료");
			System.out.println("D.문자입력");
			Scanner sc = new Scanner(System.in);
			char c = sc.next().charAt(0);
			switch (c) {
			case 'A':
				ar.friend(c);
				break;
			case 'B':
				ar.friend(c);
				break;
			case 'C':
				System.out.println("종료");
				return;
			case 'D':
				ar.all();
			}
		}
	}

}
