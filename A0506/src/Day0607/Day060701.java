package Day0607;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
class Person{
	int num;
	String name;
	public Person(int i, String string) {
		num = i;
		name = string;
	}
	@Override
	public boolean equals(Object obj) {
		Person p = (Person) obj;
		if(num == p.num) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return num;
	}
}
public class Day060701 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List (Vector,arrlist,linkedlist)
		//SET(hashset,treeset)
		//map(hashmap,treemap)
		
		Set<Person> s = new HashSet<Person>();
		s.add(new Person(12,"È«±æµ¿"));
		s.add(new Person(23,"±è±æµ¿"));
		s.add(new Person(12,"ÀÌ±æµ¿"));
		
		Iterator<Person> it = s.iterator();
		
		while (it.hasNext()) {
			Person person = it.next();
			System.out.println(person.num+" "+person.name);
			
		}

		 int a[]={1,2,3,4,5};

		 int b[]={6,7,8,9,10};

		int c=add(a,5);

		int d=add(a,5,b);

		 System.out.println(c);

		 System.out.println(d);
	}

	private static int add(int[] a, int i, int[] b) {
		int sum=0;
		for (int j = 0; j < a.length; j++) {
			sum+=a[j];
			sum+=b[j];
		}
		return sum;
	}

	private static int add(int[] a, int i) {
		int sum=0;
		for (int j = 0; j < a.length; j++) {
			sum+=a[j];
		}
		return sum;
	}

}
