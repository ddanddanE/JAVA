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
		map.put("��", 20);
		map.put("��", 21);
		map.put("ȯ", 25);
		
		Set<String> key = map.keySet();
		//map�� Ű�� string���� ����
		
		Iterator<String> it1 = key.iterator();
		//Ű���� ������ iterator��  ����
		//it.next�� Ű��
		while (it1.hasNext()) {//it1�� ���� �� Ű���� �����ִ� ���� true �� ������ false�� ����
			String a = it1.next(); //Ű��
			int b = map.get(a);//�ʿ� Ű���� ������ �����°� value
			System.out.println(b);//value�� ���
			
		}
		
	}

}
