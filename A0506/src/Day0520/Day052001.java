package Day0520;
//»ó¼Ó
class XY{
	private int x,y;
	void set(int x,int y) {
		this.x=x;
		this.y=y;
	}
	void show() {
		System.out.println(x+""+y);
	}
}
class XYZ extends XY{
	private String name;
	void setname(String z) {
		name =z;
	}
	void pr() {
		show();
		System.out.println(name);
	}
}

public class Day052001 {
	public static void main(String[] args) {
		XY x=new XY();
		x.set(4,8);
		x.show();
		
		XYZ y=new XYZ();
		y.set(6,8);
		y.setname("xyz");
		y.show();
		y.pr();
	}
}
