package Day0609;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Day060906 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("aa",1);
		map.put("bb",2);
		map.put("cc",3);
		Set<String> key = map.keySet();
		Iterator<String> it = key.iterator();
		int maxNum = 0;
		String maxName=null;
		while (it.hasNext()) {
			String name = it.next();
			if(map.get(name)>maxNum) {
				maxNum=map.get(name);
				maxName=name;
			}
		}
		System.out.println(maxNum);
		System.out.println(maxName);
	}

}
