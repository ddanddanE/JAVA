package Day0601;

import java.util.Iterator;
import java.util.TreeSet;

public class Day060107 {

	public static void main(String[] args) {
		TreeSet<Integer> grade = new TreeSet<Integer>();
		
		grade.add(30);
		grade.add(50);
		grade.add(100);
		
		Iterator<Integer> it = grade.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		Integer i;
		i=grade.first();
		System.out.println(i);
		
		i=grade.last();
		System.out.println(i);
		
		i=grade.lower(new Integer(80));
		System.out.println(i);
	}

}
