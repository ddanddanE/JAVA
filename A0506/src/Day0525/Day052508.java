package Day0525;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Day052508 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		/*
		 * for (int i = 0; i < arr.length-1; i++) { for (int j = i+1; j < arr.length;
		 * j++) { if(arr[i]>arr[j]) { int a = arr[i]; arr[i]=arr[j]; arr[j]=a; } } }
		 */
		for (int i = 0; i < arr.length; i++) {
			Arrays.sort(arr);
			System.out.println(arr[i]);
		}
	}

}
