package EXAM;

import java.util.Scanner;

public class Day0527a3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int score[] = new int[a];
		for (int i = 0; i < score.length; i++) {
			score[i] = (int)(Math.random()*101);
		}
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
	}

}
