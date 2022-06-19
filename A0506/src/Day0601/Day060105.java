package Day0601;

import java.util.Iterator;
import java.util.TreeSet;

class Pro implements Comparable<Pro>{
	String a;
	int b;
	public Pro() {	}
	public Pro(String a, int b) {
		this.a=a;
		this.b=b;
	}
	void show() {
		System.out.println(a+" "+b);
	}
	@Override
	public int compareTo(Pro o) {
		if(b>o.b)
		return 1;
		else if(b<o.b)
			return-1;
		else
			return 0;
	}
}

public class Day060105 {

	public static void main(String[] args) {
		TreeSet<Pro> t = new TreeSet<Pro>();
		t.add(new Pro("cc",128));
		t.add(new Pro("aa",123));
		t.add(new Pro("bb",125));
		
		Iterator<Pro> it = t.iterator();
		while (it.hasNext()) {
			it.next().show();
			
		}
	}

}
