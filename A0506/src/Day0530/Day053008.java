package Day0530;

interface Cal {
	int total(int a, int b);

	int big(int a, int b);
}

class Calcu implements Cal {
	@Override
	public int total(int a, int b) {
		int sum = 0;
		for (int i = a; i < b + 1; i++) {
			sum += i;
		}
		return sum;
	}

	@Override
	public int big(int a, int b) {
		return a > b ? a : b;
	}

}

class Th implements Runnable {
	String s;

	public Th(String string) {
		s = string;
	}

	@Override
	public void run() {
		System.out.println(s);

	}

}

class Timer implements Runnable {

	public void start() {
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {

	}

}

class Total {
	int sum;

	Total() {
		sum = 0;
	}

	void total(int n) {
		sum += n;
	}

	int get() {
		return sum;
	}
}

class Athread extends Thread {
	int a;
	int b;

	public Athread(Total t, int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	int sum = 0;

	@Override
	public synchronized void start() {
		super.start();
		for (int i = a - 1; i < b + 1; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}

interface Figure {
	void circle_area();

	void rec_area();
}

class Circle implements Figure {
	int x;
	int y;

	public Circle(int x) {
		this.x = x;
	}

	public Circle(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void circle_area() {
		double pi = 3.14;
		double ca = x * pi * pi;
		System.out.println(ca);

	}

	@Override
	public void rec_area() {
		double ra = x * y;
		System.out.println(ra);

	}

}

public class Day053008 {

	public static void main(String[] args) {
		Calcu c = new Calcu();
		System.out.println(c.total(1, 4));
		System.out.println(c.big(1, 5));

		Th t = new Th("Thread1");
		Thread th = new Thread(t);
		th.start();

		Timer t1 = new Timer();
		t1.start();

		Total t2 = new Total();
		Athread a = new Athread(t2, 1, 50);
		Athread b = new Athread(t2, 51, 100);
		try {
			a.join();
			b.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		a.start();
		b.start();

		Figure f1 = new Circle(5);
		Figure f2 = new Circle(2, 5);

		f1.circle_area();
		f2.rec_area();

	}

}
