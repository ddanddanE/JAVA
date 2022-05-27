package Day0527;

class Circle {
	int r;

	Circle(int r) {
		this.r = r;
	}

	public boolean equals(Circle c) {
		if (this.r == c.r) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return r + "";
	}
}

public class Day052713 {

	public static void main(String[] args) {

		Circle a = new Circle(30);

		Circle b = new Circle(30);

		System.out.println("반지름" + a);

		System.out.println("반지름" + b);

		if (a.equals(b)) {

			System.out.println("같은 원");
		}

		else {

			System.out.println("다른 원");
		}

	}

}
