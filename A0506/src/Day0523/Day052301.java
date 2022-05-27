package Day0523;
class Point{
	private int x,y;
	Point(){
		this.x = 0;
		this.y = 0;
	}
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	void pr() {
		System.out.println(x+" "+y);
	}
}
class Color extends Point{
	 String color;
	 Color(int x,int y,String c){
		 super(x, y);
		 color = c;
	 }
	 void show() {
		 System.out.println(color);
		 super.pr();
	 }
}
public class Day052301 {

	public static void main(String[] args) {
		Color c= new Color(3,6,"red");
		c.show();

	}

}
