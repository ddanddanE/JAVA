package Day0526;

import java.util.StringTokenizer;

public class Day052614 {

	public static void main(String[] args) {
		String str="id=123#name=gildong#addr=seoul";
		
		/*StringTokenizer s = new StringTokenizer(str,"#");
		int n=s.countTokens();
		
		while (s.hasMoreTokens()) {
			String a= s.nextToken();
			System.out.println(a);
			
		}*/
		/*String arr[] = str.split("#");
		for (int i = 0; i < arr.length; i++) {
			String arr2[]=arr[i].split("=");
			for (int j = 0; j < arr2.length; j++) {
				System.out.print(arr2[j]);
			}System.out.println();
		}*/
		StringBuffer sb=new StringBuffer("JAVA");
		sb.append("AA");
		System.out.println(sb);
		sb.insert(0, "B");
		System.out.println(sb);
		sb.replace(2, 6, "HTML");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}

}
