package Day0603;

import java.util.Scanner;

class Profile{

	  String name,id;

	  Profile(String name, String id){

	    this.name=name; this.id=id;

	  }

	  String getname(){ return name;}

	  String getid(){ return id;}

	}

public class Day060305 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�迭 ũ�� �Է�:");
		int a =sc.nextInt();
		Profile []pr=new Profile[a];
		
		for (int i = 0; i < pr.length; i++) {
			System.out.println("�̸� �Է�: ");
			String b=  sc.next();
			System.out.println("���̵� �Է�: ");
			String c= sc.next();
			pr[i] = new Profile(b, c);
		}
		System.out.println("�Է¿Ϸ�");
		
		for (Profile profile : pr) {
			System.out.println(profile.getname()+" "+profile.getid());
		}
	}
}
