package Day0603;

import java.util.HashMap;
import java.util.Scanner;

public class Day060303 {

	public static void main(String[] args) {
		HashMap h = new HashMap();
		h.put("����", "123");
		h.put("����", "456");
		h.put("���", "789");
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("���̵� �Է�: ");
			String id = sc.next();
			System.out.println("PW �Է�: ");
			String pw = sc.next();
			
			if(!h.containsKey(id)) {
				System.out.println("���̵� �ٸ��ϴ�");
				continue;
			}else {
				if(!h.get(id).equals(pw)) {
					System.out.println("��й�ȣ�� �ٸ��ϴ�.");
					continue;
				}else {
					System.out.println("�α���");
					break;
				}
			}
		}
	}

}
