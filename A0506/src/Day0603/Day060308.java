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
		list.add(new Person("��", 123));
		list.add(new Person("��", 456));
		list.add(new Person("ȯ", 789));
		list.add(new Person("����ȯ", 111));
	}
	void in() {
		while (true) {
			System.out.println("�̸�, id�Է�: ");
			String gName = sc.next();
			if (gName.equals("�׸�")) {
				break;
			}
			int gId = sc.nextInt();
			Person pp = new Person(gName, gId);

			if (list.contains(pp)) {
				System.out.println(pp.getName() + "�� �̹� �ִ�.");
			} else {
				list.add(pp);
			}
		}
	}
	void out() {
		while (true) {
			Random r = new Random();
			int n = r.nextInt(list.size());
			// 0~4 ���� ���� �߻� �ؼ� n�� ����
			Person p = list.get(n);
			String str = p.getName();
			System.out.println(str+"�� ���̵��?");
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			
			if (i == -1) {
				break;
			}
			if (i == p.getId()) {
				System.out.println("����");
			} else {
				System.out.println("���� �ƴ�");
			}
		}
	}

	void end() {
		System.out.println("����");
		System.exit(0);
	}
}

public class Day060308 {

	public static void main(String[] args) {
		Game g = new Game();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1,2,3");
			// 1.�Է�
			// 2. out �Լ�
			// 3.����

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
