package Day0601;

import java.util.Scanner;

interface Cal{
	int cal(int a,int b);
}
class Show implements Cal{

	@Override
	public int cal(int a, int b) {
		int sum=0;
		for (int i = a; i <= b; i++) {
			sum+=i;
		}
		return sum;
	}
}
public class Day060102 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Cal c= new Show();
		
		System.out.println(c.cal(a,b));
		
		
	}

}
