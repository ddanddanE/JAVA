package Day0603;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class Day060910 {

	public static void main(String[] args) {
		//1.
		LinkedList<String> list = new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		
		Iterator<String> it = list.iterator();//list의 값을 가져옴
		
		while (it.hasNext()) {//list에 저장된 값이 있으면 true 다읽으면 false
			String string = it.next(); //list에 저장된 값
			if(string.compareTo("three")==0) { //list저장된값과 괄호 안을 비교 두개 가 같으면 0
				it.remove();//저장된 값을 삭제
			}//list에 저장된 값은 "one"과 "two"
		}
		it = list.iterator();//list값 가져옴
		while (it.hasNext()) {//list에 저장된 값이 있으면 true 다읽으면 false
			System.out.println(it.next());//list에 저장된 값 출력
			
		}
		
		
		//2.
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		
		Set<Integer> key = map.keySet();//hashmap의 키값을 저장
		Iterator<Integer> it1 = key.iterator();
		
		while (it1.hasNext()) {
			Integer a = it1.next();
			
			int b = sc.nextInt();
			if (a==b) {
				System.out.println(map.get(a));
			}
		}
	}

}
