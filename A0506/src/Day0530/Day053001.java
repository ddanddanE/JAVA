package Day0530;
class Java{
	String java;
	public Java(String java) {
		this.java = java;
	}
	void show() {
		System.out.println(java);
	}
	
}
class DB{
	int db;
	public DB(int db) {
		this.db = db;
	}
	void pr() {
		System.out.println(db);
	}
	
}
class Program<T>{
	T t;
	void in(T t) {
		this.t =t;
	}
	T get() {
		return t;
	}
}
public class Day053001 {

	public static void main(String[] args) {
		Program<Java> p =new Program<Java>();
		p.in(new Java("Java"));
		
		Java j = p.get();
		j.show();
		
		Program<DB> d =new Program<DB>();
		d.in(new DB(7));
		
		DB db = d.get();
		db.pr();
		}

}
