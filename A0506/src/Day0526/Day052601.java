package Day0526;
class Pizza implements Food{
	public String name() {
		return "����";
	}
}
class Steak implements Food{
	public String name() {
		return "������ũ";
	}
}

public class Day052601 {
	static void pr(Food f) {
		System.out.println(f.name());
	}
	
	public static void main(String[] args) {
		pr(new Pizza());
		pr(new Steak());
	}

}
