package Day0525;
class Arr{
	static int[] con(int[] a,int[] b) {
		int[]arr=new int[a.length+b.length];
		for (int i = 0; i < a.length; i++) {
			arr[i]=a[i]; //a의 배열{1,2,3,4}를 arr의0,1,2,3에 넣겠다
			
		}
		for (int j = a.length; j < arr.length; j++) {
			arr[j]=b[j-a.length];
		}
		return arr;
	}

	 static void pr(int[] ary3) {
		for (int i = 0; i < ary3.length; i++) {
			System.out.println(ary3[i]);
		}
	}
	
	
}
public class Day052503 {

	public static void main(String[] args) {
		
		int ary1[]= {1,2,3,4};
		int ary2[]= {5,6,7,8};
		int ary3[]=Arr.con(ary1,ary2);
		Arr.pr(ary3);
	}

	
}
