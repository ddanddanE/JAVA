package Day0601;

import java.util.HashSet;
import java.util.Iterator;
class Num{
	int i;
	public Num(int i) {
		this.i=i;
	}
	@Override
	public String toString() {
		return i+" ";
	}
	
}
public class Day060104 {

	public static void main(String[] args) {
		HashSet<Num> h = new HashSet<Num>();
		h.add(new Num(30));
		h.add(new Num(40));
		h.add(new Num(60));

		Iterator<Num> i  =h.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
