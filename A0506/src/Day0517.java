import java.util.Scanner;

public class Day0517 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in); int arr[] =new int[10];
		  
		 /* for(int i=0; i<arr.length; i++) { arr[i] = sc.nextInt(); } for(int j=0;
		 * j<arr.length; j++) { if(arr[j]%4 == 0) { System.out.println(arr[j]); }else {
		 * 
		 * } } int a = 50; int b = 150; System.out.println((a>b)? a*b:a%b);
		 */
		int i=1;
		while(i<101) {
			if(i%2==0 && i%7==0) {
				System.out.println(i);
			}
			else {
				
			}
			i++;
		}
		int prob;
		
		try {
			while(true) {
				prob = sc.nextInt();
				if(prob%2==0) {
					System.out.println("Â¦¼ö");
				}else if (prob%2==1) {
					System.out.println("È¦¼ö");
				}else {
				}
			}
			
		} catch (Exception e) {
			System.out.println("½Ã½ºÅÛ Á¾·á");
		}
	}

}
