import java.util.Scanner;

public class Day0518 {
	
	public static void main(String[] args) {
		int score[]= new int[] {58,60,86,90,84};
		pr(score,5);
		System.out.println(show('$',10));
		
		//9.
		String str = "공부는 어렵지만, 재밌네요";
		System.out.println();
		String spl[] = str.split(",");
		for (int i=0;i<spl.length;i++) {
			System.out.println(spl[i]);
		}
		System.out.println(str.substring(6,7));
		System.out.println(str.substring(0, 4));
		}
	//7.
	static void pr(int[] a,int b) {
		int x = 0;
		for(int i=0; i<a.length;i++) {
			x = a[i]/5;
			for(int j=0; j<x;j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
	//8.
	static String show(char a, int b) {
		String sum ="";
		for(int i =0; i<b; i++) {
			sum+=a;
		}
		return sum;
	}
	
	

}
