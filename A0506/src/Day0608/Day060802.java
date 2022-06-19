package Day0608;

import java.util.StringTokenizer;

public class Day060802 {

	public static void main(String[] args) {
		String s = "1+2+3+4+5";
		StringTokenizer st = new StringTokenizer(s,"+");
		int sum =0;
		while (st.hasMoreTokens()) {
			String b = st.nextToken();
			String c = b.trim();
			sum+=Integer.parseInt(c);
		}
		System.out.println(sum);
	}

}
