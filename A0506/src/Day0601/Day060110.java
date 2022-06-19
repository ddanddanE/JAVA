package Day0601;

import java.util.Scanner;

class Rectangle{
	private int width;
	private int height;
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	double show() {
		return width*height;
	}
}
public class Day060110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x =0;
		int y = 0;
		while (true) {
			try {
				System.out.println("���̰� �Է�: ");
				x = sc.nextInt();
				System.out.println("���̰� �Է�: ");
				y = sc.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("������ �Է��ϼ���.");
				sc.next();
				continue;
			}
		}
		
		Rectangle rec = new Rectangle();
		rec.setWidth(x);
		rec.setHeight(y);
		System.out.println(rec.show());
	}
}
