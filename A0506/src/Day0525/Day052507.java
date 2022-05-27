package Day0525;

import java.util.Scanner;

class XY {
	int a;
	int b;

	public XY() {
	}

	void set(int i, int j) {
		a = i;
		b = j;
	}

	void show() {
		System.out.println(a + " " + b);
	}

}

class XYZ extends XY {
	String color;

	public void color(String string) {
		color = string;
	}

	void show() {
		System.out.println(a + " " + b + " " + color);
	}

}

public class Day052507 {

	public static void main(String[] args) {
		XY x = new XY();
		x.set(1, 2);
		x.show(); // 1,2 ���

		XYZ xy = new XYZ();
		xy.set(4, 5);
		xy.color("blue");
		xy.show(); // 4,5,blue ���

		Scanner sc = new Scanner(System.in);
		System.out.println("����: ");
		String me = sc.next();
		System.out.println("ö��: ");
		String you = sc.next();

		if (me.equals("����")) {
			if (you.equals(me)) {
				System.out.println("����.");
			} else if (you.equals("����")) {
				System.out.println("ö���� �̰��.");
			} else if (you.equals("��")) {
				System.out.println("������ �̰��.");
			}
		} else if (me.equals("����")) {
			if (you.equals(me)) {
				System.out.println("����.");
			} else if (you.equals("��")) {
				System.out.println("ö���� �̰��.");
			} else if (you.equals("����")) {
				System.out.println("������ �̰��.");
			}
		} else if (me.equals("��")) {
			if (you.equals(me)) {
				System.out.println("����.");
			} else if (you.equals("����")) {
				System.out.println("ö���� �̰��.");
			} else if (you.equals("����")) {
				System.out.println("������ �̰��.");
			}
		}

	}
}
