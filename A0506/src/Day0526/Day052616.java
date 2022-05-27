package Day0526;
class Num{
int i;
	public Num(int i) {
		this.i=i;
	}
	int get() {
		return i;
	}
	
}

public class Day052616 {

	public static void main(String[] args) {
		Num n = new Num(1);
		Num[] ary=new Num[] {
		new Num(1), new Num(2),new Num(3)
		};
		for (Num n1 : ary) {
			System.out.println(n1.get());
		}
	}

}
