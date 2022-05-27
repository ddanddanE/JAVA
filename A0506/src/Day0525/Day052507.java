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
		x.show(); // 1,2 출력

		XYZ xy = new XYZ();
		xy.set(4, 5);
		xy.color("blue");
		xy.show(); // 4,5,blue 출력

		Scanner sc = new Scanner(System.in);
		System.out.println("영수: ");
		String me = sc.next();
		System.out.println("철수: ");
		String you = sc.next();

		if (me.equals("가위")) {
			if (you.equals(me)) {
				System.out.println("비겼다.");
			} else if (you.equals("바위")) {
				System.out.println("철수가 이겼다.");
			} else if (you.equals("보")) {
				System.out.println("영수가 이겼다.");
			}
		} else if (me.equals("바위")) {
			if (you.equals(me)) {
				System.out.println("비겼다.");
			} else if (you.equals("보")) {
				System.out.println("철수가 이겼다.");
			} else if (you.equals("가위")) {
				System.out.println("영수가 이겼다.");
			}
		} else if (me.equals("보")) {
			if (you.equals(me)) {
				System.out.println("비겼다.");
			} else if (you.equals("가위")) {
				System.out.println("철수가 이겼다.");
			} else if (you.equals("바위")) {
				System.out.println("영수가 이겼다.");
			}
		}

	}
}
