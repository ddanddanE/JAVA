package Day0527;

class Fruit {
	void fruit() {
		System.out.println("과일");
	}
}

class Apple extends Fruit {
	void apple() {
		System.out.println("사과");
	}
}

class PineApple extends Apple {
	void pineapple() {
		System.out.println("파인애플");
	}
}

public class Day052701 {
	static void pr(Fruit f) {
		if (f instanceof PineApple) {
			((PineApple) f).pineapple();
		} // 다운캐스팅할때 클래스 명칭 적어야함
		else if (f instanceof Apple) {
			((Apple) f).apple();
		} else {
			f.fruit();
		}
	}
	// Fruit f=new Fruit();
	// Fruit f=new Apple();
	// Fruit f=new PineApple();

	public static void main(String[] args) {
		Fruit f = new Fruit();
		Apple a = new Apple();
		PineApple p = new PineApple();

		pr(f);
		pr(a);
		pr(p);

	}

}
