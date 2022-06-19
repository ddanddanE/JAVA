package Day0603;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class DAy060307 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		for (int i = 0; i < 3; i++) {
			System.out.println("아름: ");
			String name = sc.next();
			System.out.println("나이: ");
			int age = sc.nextInt();
			map.put(age, name);
		}
		
		
		Set<Integer> ages = map.keySet();
		Iterator<Integer> it =ages.iterator();
		int maxNum=0;
		while (it.hasNext()) {
			Integer a = it.next();
			if(maxNum<a) {
				maxNum=a;
			}
		}
		String b = map.get(maxNum);
		System.out.println(b);
	}

}
