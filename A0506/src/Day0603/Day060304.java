package Day0603;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Day060304 {

	public static void main(String[] args) {
HashMap<String, String> h = new HashMap<String, String>();
		
		h.put("computer", "��ǻ��");
		h.put("coffee", "Ŀ��");
		h.put("cream", "ũ��");
		
		Set<String> key = h.keySet();
		
		Iterator<String> it = key.iterator();
		
		while (it.hasNext()) {
			String a = it.next();
			String b = h.get(a);
			System.out.println(a+"��" +b+"�Դϴ�.");
		}
		Scanner sc = new Scanner(System.in);

	}

}
