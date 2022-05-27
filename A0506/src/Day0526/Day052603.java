package Day0526;
class Tv{
	public void on() {
		System.out.println("tv on");
	}
}

interface Com{
	public void m();
}

class Comp{
	public void m() {
		System.out.println("comp on");
	}
}
class Ipad extends Tv implements Com{
	Comp c = new Comp();
	public void m() {
		c.m();
	}
	public void ip() {
		m();
		on();
	}
}
public class Day052603 {

	public static void main(String[] args) {
		Ipad i = new Ipad();
		Tv t = i;
	}

}

