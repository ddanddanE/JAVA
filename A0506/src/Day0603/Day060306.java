package Day0603;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Day060306 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			int random = (int)(Math.random()*100);
			list.add(random);
		}
		Iterator<Integer> it =list.iterator();
		while (it.hasNext()) {
			Integer integer = (Integer)it.next();
			System.out.println(integer);
		}
		System.out.println("222222222222222222");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("윤", 20);
		map.put("진", 21);
		map.put("환", 25);
		
		Set<String> key = map.keySet();
		//map의 키를 string으로 만듬
		
		Iterator<String> it1 = key.iterator();
		//키값을 가지고 iterator를  돌려
		//it.next는 키값
		while (it1.hasNext()) {//it1의 값이 즉 키값이 남아있는 동안 true 다 읽으면 false라 종료
			String a = it1.next(); //키값
			int b = map.get(a);//맵에 키값을 넣으면 나오는건 value
			System.out.println(b);//value값 출력
			
		}
		
	}

}
