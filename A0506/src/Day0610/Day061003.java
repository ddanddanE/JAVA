package Day0610;

import java.util.HashMap;
import java.util.Scanner;

class Person{
	private String name;
	private int id;
	
	public Person() {}
	public Person(String name,int id) {
		this.name=name;
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return name + "," + id;
	}
	
	
}
public class Day061003 {

	public static void main(String[] args) {
		Person p[]=new Person[3];
		Scanner sc =new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < p.length; i++) {
			System.out.println("Enter Name:");
			String name = sc.next();
			System.out.println("Enter Id");
			int id = sc.nextInt();
			p[i]= new Person(name,id);
			map.put(name, id);
		}
		while(true) {
			System.out.println("what's your name?");
			String name =  sc.next();
			if(map.containsKey(name)) {
				System.out.println(map.get(name));
			}else if(name.toLowerCase().equals("stop")) {
				System.out.println("Á¾·á");
				break;
			}else {
				System.out.println("NoName");
			}
		}
		
		
	}

}
