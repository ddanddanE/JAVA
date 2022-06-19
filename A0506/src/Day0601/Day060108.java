package Day0601;

import java.util.Scanner;

class Cal1{
	int calculate(int a) {
		int sum=0;
		for (int i = 1; i < a+1; i++) {
			if(i%2!=0) {
				sum+=i;
			}
		}
		return sum;
	}
}
public class Day060108 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("정수 입력(0: 종료");
			int a = sc.nextInt();
			if(a==0) {
				System.out.println("종료");
				break;
			}else if(a>10 || a<5) {
				System.out.println("다시 입력");
				continue;
			}else {
				Cal1 c = new Cal1();
				System.out.println(c.calculate(a));
			}
		}
		
		//2.
		int [][]ary=new int[3][3];
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
				ary[i][j]=sc.nextInt();
			}
		}
		high(ary,3,3);
	}
	static void high(int[][] ary, int i, int j) {
		int maxNum=0;
		for (int j2 = 0; j2 < ary.length; j2++) {
			for (int k = 0; k < ary.length; k++) {
				if(maxNum<ary[j2][k]) {
					maxNum = ary[j2][k];
				}
			}
		}
		System.out.println(maxNum);
	}

}
