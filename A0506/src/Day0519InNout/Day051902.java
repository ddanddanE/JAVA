package Day0519InNout;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Day051902 {

	public static void main(String[] args) throws IOException {
		//1-1.
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream("test.txt");
			byte b[] = { 4, 6, 7, 8, -1, 24 };
			fos.write(b);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			fos.close();
		}
		//1-2.
		FileInputStream fis = null;
		int r;
		byte[] by = new byte[6];
		try {
			fis = new FileInputStream("test.txt");
			while ((r = fis.read(by, 0, by.length)) != -1) {
				for (int i = 0; i < by.length; i++) {
					System.out.print(by[i]+" ");
				}
			}
		} catch (Exception e) {
		}
		//2.
		int lotto[] = {4,10,25,30,45,47};
		int my[] = {1,4,7,26,45,48};
		int r1=0;
		r1=same(lotto,my);
		System.out.printf("\n일치하는 번호의 개수:%d\n",r1);
		//4.
		int ary[] = {6,2,8,4,9};
		show(ary);
		//5.
		int[][]ary1 = {{43,97},{34,77,87},{100,95,38,89}};
		int total = 0;
		double count=0;
		for (int i = 0; i < ary1.length; i++) {
			for (int j = 0; j < ary1[i].length; j++) {
				total+=ary1[i][j];
				count++;
			}
		}
		double avg = total/count;
		System.out.printf("합: %d / 평균: %.1f\n",total,avg);
		
		System.out.println("666666666666666666666666");
		Scanner sc = new Scanner(System.in);
		int ary2[] = new int[5];
		int minNum =10;
		int maxNum =-1;
		int sum =0;
		double countStu = 0;
		
		for (int i = 0; i < ary2.length; i++) {
			int score = sc.nextInt();
			ary2[i]=score;
			if(ary[i]>maxNum) {
				maxNum = score;
			}
			if(ary[i]<minNum) {
				minNum = score;
			}
		}
		System.out.println(minNum+"%%%"+maxNum);
		for (int i = 0; i < ary2.length; i++) {
			if(ary2[i]!=minNum && ary2[i]!=maxNum) {
				sum+=ary2[i];
				countStu++;
				System.out.println(ary2[i]);
			}
		}
		System.out.println("평균:"+(sum/countStu));
		//7.
		BufferedWriter b= new BufferedWriter(new FileWriter("Sample.txt"));
		String a ="123123123123";
		b.write(a);
		b.close();
		
		BufferedReader in =new BufferedReader(new FileReader("Sample.txt"));
		String c[] = new String[1];
		for (int i = 0; i < c.length; i++) {
			c[i]=in.readLine();
			System.out.println(c[i]);
		}
		}
	//2.
	static int same(int[] a, int[]b) {
		int r1 =0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i] == b[j]) {
					r1+=1;
				}
			}
		}
		return r1;
	}
	//4.
	static void show(int[] ary) {
		for (int i = 4; i >= 0; i--) {
			System.out.println(ary[i]);
		}
	}
}
