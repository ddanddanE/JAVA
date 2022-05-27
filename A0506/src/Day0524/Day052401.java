package Day0524;
class Music{
	String title;
	String singer ="πÊ≈∫";
	public Music(String title,String singer) {
		this.title =title;
		this.singer = singer;
	}
	public Music(String title) {
		this.title = title;
	}

}

class Cal{
	public static int add(int i, int j) {
		return i+j;
	}

	public static int div(int i, int j) {
		return i/j;
	}
}
public class Day052401{

	public static void main(String[] args) {
		Music m = new Music("On","BTS");
		System.out.println(m.title+" "+m.singer);
		Music m1 =new Music("Butter");
		System.out.println(m1.title+" "+m1.singer);
		
		int a = Cal.add(10,5);
		int b = Cal.div(10,5);
		System.out.println(a+" "+b);

	}

}
