package Day0525;

import java.util.Scanner;

class Circle1 {

	private double r;

	Circle1(double r){
		this.r=r;
	}

	double area() {

		return 3.14 * r * r;
	}

}

public class Day052506 {

	public static void main(String[] args) {
		Circle1 c1[] = new Circle1[5];
		Scanner sc = new Scanner(System.in);
		double sum=0;
		for (int i = 0; i < c1.length; i++) {
			double r = sc.nextDouble();
			c1[i]=new Circle1(r);
		}
		for (int i = 0; i < c1.length; i++) {
			sum+=c1[i].area();
		}
		System.out.println(sum);
	}
}
