package Day0519InNout;

import java.util.Scanner;

public class Day051903 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String arr1[][] = new String[100][6];
		
		int count1 = 1;
		int count2 = 1;
		
		if(count2==1) {
			System.out.println("�ֹ���ȣ:");
			String orderNum = sc.next();
			arr1[count1][count2] = orderNum;
			count2++;
		}
		if(count2==2) {
			System.out.println("�ֹ��� ���̵�:");
			String userId = sc.next();
			arr1[count1][count2] = userId;
			count2++;
		}if(count2==3) {
			System.out.println("�ֹ� ��¥: ");
			String date = sc.next();
			arr1[count1][count2] = date;
			count2++;
		}if(count2==4) {
			System.out.println("�ֹ��� �̸�: ");
			String name = sc.next();
			arr1[count1][count2] = name;
			count2++;
		}if(count2==5) {
			System.out.println("�ֹ� ��ǰ ��ȣ: ");
			String prodNum = sc.next();
			arr1[count1][count2] = prodNum;
			count2++;
		}if(count2==6) {
			System.out.println("��� �ּ�: ");
			String address = sc.next();
			arr1[count1][count2] = address;
			count2++;
		}
		if(count2==7) {
			System.out.println("!!!!!!!!");
			count1++;
			count2=1;
			for (int i = 0; i < arr1[0].length; i++) {
				System.out.println(arr1[0][i]);
			}
	}
		
		
		
	}
}

class order {

}
