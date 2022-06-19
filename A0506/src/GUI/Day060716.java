package GUI;

public class Day060716 {

	public static void main(String[] args) {
		 int ary[];

		 ary=make();

		 for(int i=0;i<ary.length;i++){

		   System.out.print(ary[i]+" "); }

	}

	 static int[] make() {
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		return arr;
	}

}
