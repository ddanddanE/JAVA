package Day0526;
class In{
	private int num;
	
	In(int num){
		this.num =num;
	}
	public String toString() {
		return num+" ";
	}
}
public class Day052605 {

	public static void main(String[] args) {
		In i = new In(4);
		System.out.println(i);
	}

}
