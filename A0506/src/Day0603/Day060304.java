package Day0603;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Day060304 {

	public static void main(String[] args) {
HashMap<String, String> h = new HashMap<String, String>();
		
		h.put("computer", "컴퓨터");
		h.put("coffee", "커피");
		h.put("cream", "크림");
		
		Set<String> key = h.keySet();
		
		Iterator<String> it = key.iterator();
		
		while (it.hasNext()) {
			String a = it.next();
			String b = h.get(a);
			System.out.println(a+"는" +b+"입니다.");
		}
		Scanner sc = new Scanner(System.in);

	}

}
