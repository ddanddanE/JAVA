package Day0526;

import java.util.Scanner;

class Profile{
	String name;
	String id;
	
	Profile(String n,String i){
		name = n;
		id=i;
	}
}
public class Day052613 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		Profile p[]=new Profile[2];
		for (int i = 0; i < p.length; i++) {
			String name = sc.next();
			String id = sc.next();
			p[i]=new Profile(name,id);
		}
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].id+""+p[i].name);
		}
	}

}
