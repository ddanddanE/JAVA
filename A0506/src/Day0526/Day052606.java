package Day0526;
class Po{
	int a, b;
	Po(int a,int b){
		this.a=a;
		this.b=b;
	}
	public boolean equals(Po p) {
		if(this.a==p.a && this.b==p.b) {
			return true;
		}
		else
			return false;
	}
}
public class Day052606 {

	public static void main(String[] args) {
		Po p=new Po(3,4);
		Po p1=new Po(2,3);
		Po p2=new Po(3,4);
		
		if(p==p1) {
			System.out.println("p==p1");
		}
		if(p.equals(p1)) {
			System.out.println("p는 p1과 같다");
		}
		if(p.equals(p2)) {
			System.out.println("p는 p2과 같다");
		}

	}

}

