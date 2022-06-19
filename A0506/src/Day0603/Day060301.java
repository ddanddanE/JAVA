package Day0603;

import java.util.HashMap;

public class Day060301 {

	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		
		h.put(1, "신우");
		h.put(2,"인성");
		
		System.out.println(h.get(1));
		System.out.println(h.get(2));
	}

}
