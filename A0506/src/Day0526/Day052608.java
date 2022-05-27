package Day0526;

public class Day052608 {

	public static void main(String[] args) {
		Integer i = new Integer(10);
		int i1=i.intValue();
		
		Character c= new Character('a');
		char c1 = c.charValue();
		
		Boolean b= new Boolean(true);
		boolean b1=b.booleanValue();
		
		//문자열을 기본타입으로 변환!!
		int i2 =Integer.parseInt("123");
		boolean b2= Boolean.parseBoolean("true");
		double d2 = Double.parseDouble("3.14");
		
		int i4 = Integer.valueOf("10")+Integer.valueOf("20");
		int i5 = Integer.parseInt("10")+Integer.parseInt("20");
		System.out.println(i4);
		System.out.println("**********");
		System.out.println(i5);
	}

}
