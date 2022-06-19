package Day0530;

import java.util.ArrayList;

class Dog{
	private String name;
	private String type;
	
	public Dog(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String showDogInfo() {
		return name+" "+type;
	}
}

public class Day053005 {

	public static void main(String[] args) {
		Dog d1[] = new Dog[5];
		d1[0] = new Dog("호두", "말티즈");
		d1[1] = new Dog("솜이", "진돗개");
		d1[2] = new Dog("재롱이", "삽살개");
		d1[3] = new Dog("찹쌀", "샤모에드");
		d1[4] = new Dog("탄이", "시바견");
		for (int i = 0; i < d1.length; i++) {
			System.out.println(d1[i].showDogInfo());
		}
		
		ArrayList<Dog> d2 = new ArrayList<Dog>();
		d2.add(new Dog("강1","강타1"));
		d2.add(new Dog("강2","강타2"));
		d2.add(new Dog("강3","강타3"));
		d2.add(new Dog("강4","강타4"));
		d2.add(new Dog("강5","강타5"));
		
		for (int i = 0; i <d2.size(); i++) {
			Dog d3=d2.get(i);
			System.out.println(d3.showDogInfo());
		}
	}

}
