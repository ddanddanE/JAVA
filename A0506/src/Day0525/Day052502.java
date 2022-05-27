package Day0525;

import java.util.Scanner;

abstract class Circle{
	protected double r;
	
	Circle(double r) {
		this.r = r;
	}
	abstract double get();
	
}
class Cir extends Circle{
	
	Cir(double r) {
		super(r);
	}

	@Override
	double get() {
		return r;
	}
	
}

public class Day052502 {

	public static void main(String[] args) {
		Circle c[] =new Circle[5];
		//��ü 5�� �迭 ����
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < c.length; i++) {
			double r = sc.nextDouble();
			c[i]=new Cir(r);//��ü����
			System.out.println(c[i].get());
		}
	}

}
