package Day0526;
class Mydog{
	String name;
	String type;
	public Mydog(String string, String string2) {
		type = string;
		name = string2;
	}
	public String toString() {
		return name+" "+type;
		
	}
	
}
public class Day052607 {

	public static void main(String[] args) {
		Mydog dog = new Mydog("∏€∏€¿Ã","¡¯µæ∞≥");
		System.out.println(dog);
	}

}
