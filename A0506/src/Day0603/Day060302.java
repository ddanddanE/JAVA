package Day0603;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Day060302 {

	public static void main(String[] args) {
		HashMap<String, String> h = new HashMap<String, String>();
		
		h.put("��", "water");
		h.put("Ŀ��", "coffee");
		h.put("��", "tea");
		
		Set<String> keys = h.keySet();
		
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String a = it.next();
			String b = h.get(a);
			System.out.println(a+" "+b);
		}
	}

}
