package Day0526;
class XY{

	 private int x,y;

	 XY(int x, int y){

	    this.x=x; this.y=y; }

	 int getx(){

	     return x; }

	 int gety(){

	     return y;}

	 protected void move(int x, int y){

	   this.x=x;

	   this.y=y;

	}}
class XYZ extends XY{
	int x;
	int y;
	String color;
	XYZ(int x, int y,String color) {
		super(x, y);
		this.color = color;
	}
	void setxy(int x, int y) {
		move(x,y);
	}
	void setcolor(String color) {
		this.color=color;
	}
	void show() {
		System.out.println(getx()+""+gety()+"¿Œ"+color);
	}
}

public class Day052611 {

	public static void main(String[] args) {
		XYZ xyz= new XYZ(10,10, "red");

		xyz.setxy(20,30);

		xyz.setcolor("blue"); 

		xyz.show();

	}

}
