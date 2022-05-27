import java.util.Scanner;

public class Day0511 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int dan = 5; dan < 10; dan++) {
			for (int dan1 = 1; dan1 < 10; dan1++) {
				System.out.println(dan + "x" + dan1 + "=" + (dan * dan1));
			}
		}

		int num = 0;
		int sum = 0;
		while (num < 101) {
			if (num % 5 == 0) {
				sum += num;
			} else {

			}
			num++;
		}
		System.out.println(sum);
	}

}
