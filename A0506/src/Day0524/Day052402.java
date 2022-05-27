package Day0524;

import java.util.Scanner;

public class Day052402 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		for (int i = 1; i < 5; i++) {
			for (int j = 0; j < 4-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j < i*2; j++) {
				System.out.print(j-1);
			}
			System.out.println();
		}
		
		int [][]grade = {{55,60,65},{85,90,95}};
		int high;
		high = get(grade);
		System.out.println(high);
		
		String eng[] = {"student","book","future","note"};
		String kor[] = {"학생","책","미래","노트"};
		String eName = null;
		
		while (true) {
			System.out.println("입력하세요.");
			eName = sc.next();
			for (int i = 0; i < eng.length; i++) {
				if(eName.equals(eng[i])) {
					System.out.println(kor[i]);
				}else if(eName.equals("그만")){
					System.out.println("종료");
					break;
				}else {
					System.out.println("잘못입력");
				}
			}
			
		}
	}

	 static int get(int[][] grade) {
		 int maxNum =0;
		for (int i = 0; i < grade.length; i++) {
			for (int j = 0; j < grade[i].length; j++) {
				if(grade[i][j]>maxNum) {
					maxNum = grade[i][j];
				}
			}
		}
		 return maxNum;
	}
}
