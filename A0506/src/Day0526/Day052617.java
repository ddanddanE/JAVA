package Day0526;
class Animal{
	String dog;
	public Animal(String dog) {
		this.dog = dog;
	}
	String ani() {
		return ani();
	}
}
class Dog extends Animal{
	String type;
	public Dog(String type,String dog) {
		super(dog);
		this.type=type;
	}
	String ani() {
		return type+" "+dog;
	}
	
	
}
public class Day052617 {

	public static void main(String[] args) {
		Animal a1= new Dog("°­¾ÆÁö","Çªµé");
		System.out.println(a1.ani());
	}

}
