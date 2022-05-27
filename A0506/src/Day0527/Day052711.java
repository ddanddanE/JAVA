package Day0527;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Day052711 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			try {
				int j = sc.nextInt();
				System.out.println(j);
				sum += j;
			} catch (InputMismatchException e) {
				System.out.println("다시 입력해라. 정수아니다.");
				sc.next();
				i--;
			}
		}
		sc.close();
		System.out.println("총합: " + sum);
	}
}
