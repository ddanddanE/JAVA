package Day0530;
abstract class Profile1{
	abstract void add(String name,String id);
	abstract String check(String id);
}
class Person{
	String name;
	String id;
	public Person(String name, String id) {
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
}
class Per extends Profile1{
	Person arr[];
	int n;
	
	public Per(int i) {
		arr=new Person[i];
	}

	@Override
	void add(String name, String id) {
		arr[n]=new Person(name,id);
		n++;
	}

	String check(String id) {
		for (int i = 0; i < n; i++) {
			if(id.compareTo(arr[i].getId())==0) {
				return arr[i].getName();
			}
		}
		return null;
	}
	
}
public class Day053006 {

	public static void main(String[] args) {
		Profile1 p=new Per(5);
		p.add("의영","123");
		p.add("연운","456");
		p.add("신우","344");
		
		System.out.println(p.check("123"));
		System.out.println(p.check("456"));
		System.out.println(p.check("456"));
	}

}
