package Day0527;
interface Po {
void pr(int a, String b);
void pr(String a);
}
class Point implements Po{
	public void pr(int a,String b) {
		System.out.println(b + "Ã¥Àº " + a + "¿ø");
	}
	public void pr(String a) {
		System.out.println(a);
		}
}
public class Day052714 {

	public static void main(String[] args) {
		
		 Po p=new Point();

         p.pr(30000,"java");   

         p.pr("python"); 
	}
}
