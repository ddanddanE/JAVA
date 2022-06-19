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
		
		Iterator<String> it = list.iterator();//list�� ���� ������
		
		while (it.hasNext()) {//list�� ����� ���� ������ true �������� false
			String string = it.next(); //list�� ����� ��
			if(string.compareTo("three")==0) { //list����Ȱ��� ��ȣ ���� �� �ΰ� �� ������ 0
				it.remove();//����� ���� ����
			}//list�� ����� ���� "one"�� "two"
		}
		it = list.iterator();//list�� ������
		while (it.hasNext()) {//list�� ����� ���� ������ true �������� false
			System.out.println(it.next());//list�� ����� �� ���
			
		}
		
		
		//2.
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		
		Set<Integer> key = map.keySet();//hashmap�� Ű���� ����
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
