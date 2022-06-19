package Day0530;

import java.util.ArrayList;

class Profile{
	String id;
	int age;
	
	public Profile(String i,int a) {
		id=i;
		age=a;
	}
}

public class Day053004 {

	public static void main(String[] args) {
			ArrayList<Profile> p = new ArrayList<Profile>();
			p.add(new Profile("아이디1", 20));
			p.add(new Profile("아이디2", 21));
			p.add(new Profile("아이디3", 22));
			
			for (int i = 0; i < p.size(); i++) {
				Profile p1 = p.get(i);
				System.out.println(p1.id+" "+p1.age);
			}
		
		

	}

}
