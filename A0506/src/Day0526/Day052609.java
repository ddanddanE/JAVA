package Day0526;
class Point{
	int a;
	int b;
	public Point(int i, int j) {
	a=i;
	b=j;
	}
	public String toString() {
		return a+"."+b;
		}
}

public class Day052609 {

	public static void main(String[] args) {
		Point p = new Point(3,4);
		System.out.println(p);
		
		String code = "841111-1234560";
		int c=Integer.parseInt(code.substring(code.indexOf("-")+1, code.indexOf("-")+2));
		switch (c) {
		case 1:
			System.out.println("남성");
			break;

		case 2 :
			System.out.println("여성");
			break;
		}
		
	}

}
