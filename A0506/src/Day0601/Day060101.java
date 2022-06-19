package Day0601;

import java.util.Scanner;

class Book {
	String name;
	int money;

	public Book(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public Book(String name) {
		this(name, 40000);
	}

	public void title() {
		System.out.println(name + "," + money);
	}
}

public class Day060101 {

	public static void main(String[] args) {
		Book b1 = new Book("ÀÚ¹Ù");
		b1.title();
		Book b2 = new Book("ÆÄÀÌ½ã", 30000);
		b2.title();


		int a2=(int)(Math.random()*100)+1;
		int t1=a2/10;
		int t2=a2%10;
		if(t1==0) {
		if(t2%3==0) {
		System.out.println(a2+" clap!");
		}
		}
		else if(t1%3==0) {
		if(t2%3==0) {
		System.out.println(a2+" clap!clap!");
		}
		else {
		System.out.println(a2+" clap");
		}
		}
		else {
		if(t2%3==0) {
		System.out.println(a2+" clap!");
		}
		else {
		System.out.println(a2);
		}
		}
	}

}
