package Day0603;

import java.util.HashMap;
import java.util.Scanner;

public class Day060303 {

	public static void main(String[] args) {
		HashMap h = new HashMap();
		h.put("현민", "123");
		h.put("서영", "456");
		h.put("상우", "789");
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("아이디 입력: ");
			String id = sc.next();
			System.out.println("PW 입력: ");
			String pw = sc.next();
			
			if(!h.containsKey(id)) {
				System.out.println("아이디가 다릅니다");
				continue;
			}else {
				if(!h.get(id).equals(pw)) {
					System.out.println("비밀번호가 다릅니다.");
					continue;
				}else {
					System.out.println("로그인");
					break;
				}
			}
		}
	}

}
