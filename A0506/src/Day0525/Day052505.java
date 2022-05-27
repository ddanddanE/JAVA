package Day0525;

import java.util.Scanner;

class Tv{
	String brand;
	int year;
	int inch;
	public Tv(String brand,int year,int inch) {
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	void show() {
		System.out.println(year+"년에 "+brand+"에서 나온 "+inch+"인치 TV");
	}
}
class Score{
	int m;
	int e;
	int c;
	public Score(int m, int e,int c) {
	this.m=m;
	this.e=e;
	this.c=c;
	}
	double avg() {
		return (m+e+c)/3;
	}
}
public class Day052505 {

	public static void main(String[] args) {
		Tv t = new Tv("삼성",2022,20);
		t.show();
		
		Scanner sc = new Scanner(System.in);
		int math = sc.nextInt();
		int eng = sc.nextInt();
		int com = sc.nextInt();
		Score s=new Score(math,eng,com);
		System.out.println("평균은"+s.avg());
	}

}
