package Day0601;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Day060109 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("fi.txt");
		byte b[]= {1,2,3,4,5};
		fos.write(b);
		fos.close();
		
		FileInputStream fis = new FileInputStream("fi.txt");
		int i;
		while ((i=fis.read())!=-1) {
			System.out.println(i);
		}
		fis.close();
		int[] arr = {1,2,3,4,5};
		int [] r;
		r=add(arr,5);
		System.out.println(r[0]);
	}

	static int[] add(int[] arr, int i) {
		int[] sumarr = new int[1];
		int sum=0;
		for (int j = 0; j < arr.length; j++) {
			sum+=arr[j];
		}
		sumarr[0]=sum;
		System.out.println(sum);
		return sumarr;
	}

}
