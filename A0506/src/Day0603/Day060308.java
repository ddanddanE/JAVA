package Day0603;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Person {
	private String name;
	private int id;

	public Person(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		Person p = (Person)obj;
		if(p.getId()==this.id && p.getName().equals(this.name)) {
			return true;
		}
		return false;
	}
}

class Game {
	Scanner sc = new Scanner(System.in);
	ArrayList<Person> list = new ArrayList<Person>(5);

	Game() {
		list.add(new Person("윤", 123));
		list.add(new Person("진", 456));
		list.add(new Person("환", 789));
		list.add(new Person("윤진환", 111));
	}
	void in() {
		while (true) {
			System.out.println("이름, id입력: ");
			String gName = sc.next();
			if (gName.equals("그만")) {
				break;
			}
			int gId = sc.nextInt();
			Person pp = new Person(gName, gId);

			if (list.contains(pp)) {
				System.out.println(pp.getName() + "은 이미 있다.");
			} else {
				list.add(pp);
			}
		}
	}
	void out() {
		while (true) {
			Random r = new Random();
			int n = r.nextInt(list.size());
			// 0~4 사이 난수 발생 해서 n에 저장
			Person p = list.get(n);
			String str = p.getName();
			System.out.println(str+"의 아이디는?");
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			
			if (i == -1) {
				break;
			}
			if (i == p.getId()) {
				System.out.println("정답");
			} else {
				System.out.println("정답 아님");
			}
		}
	}

	void end() {
		System.out.println("종료");
		System.exit(0);
	}
}

public class Day060308 {

	public static void main(String[] args) {
		Game g = new Game();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1,2,3");
			// 1.입력
			// 2. out 함수
			// 3.종료

			int select = sc.nextInt();
			switch (select) {
			case 1:
				g.in();
				break;
			case 2:
				g.out();
				break;
			case 3:
				g.end();
				break;
			}
		}
	}

}
