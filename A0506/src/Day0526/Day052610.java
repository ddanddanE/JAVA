package Day0526;

class Tv1 {

	private int size;
	Tv1(int size) {
		this.size = size;
	}
	protected int getsize() {
		return size;
	}
}
class Tv2 extends Tv1 {
	String brand;
	int size;
	public Tv2(int size, String brand) {
		super(size);
		this.size = size;
		this.brand = brand;
	}
	void show() {
		System.out.println(brand + size + "인치 TV");
	}
}
class Shape{
	int x;
	int y;
	String z;
	Shape() {
		x=1;
		y=3;
	}
	Shape(int i, int j) {
		x=i;
		y=j;
	}
	void pr(String msg) {
		z=msg;
	}
	void show() {
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print(z);
			}
			System.out.println();
		}
	}
	
}

public class Day052610 {

	public static void main(String[] args) {
		Tv2 t = new Tv2(20, "삼성");
		t.show();
		Shape s = new Shape();
		Shape s1 = new Shape(2,5);
		s.pr("@"); 
		s1.pr("#");
		s.show();  //@@@-> 1행 3열로 출력
		s1.show();  //#####->2행 5열로 출력
		                 //#####
	}
}
