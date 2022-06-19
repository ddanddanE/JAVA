package Day0530;

import java.util.Vector;

public class Day053007 {

	public static void main(String[] args) {

		Vector<Integer> v= new Vector<Integer>();
		v.add(5);
		v.add(6);
		v.add(76);
		v.add(26);
		v.add(0,64);
		
		System.out.println(v.size());
		for (int i = 0; i < v.size(); i++) {
			int j = v.get(i);
			System.out.println(j);
		}
	}

}
