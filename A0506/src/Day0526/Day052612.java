package Day0526;
interface Re{
	default void show(){
		System.out.println("�簢��!!");
	}
	abstract int area();
}
class Rec implements Re{
	int x;
	int y;
	Rec(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public int area() {
		return x*y;
	}
}
public class Day052612 {

	public static void main(String[] args) {
		Re r=new Rec(10,20);

		   r.show();         //"�簢��!!" ���

		   System.out.println("����"+r.area());

	}

}
