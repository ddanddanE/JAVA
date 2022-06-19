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
		d1[0] = new Dog("ȣ��", "��Ƽ��");
		d1[1] = new Dog("����", "������");
		d1[2] = new Dog("�����", "��찳");
		d1[3] = new Dog("����", "���𿡵�");
		d1[4] = new Dog("ź��", "�ùٰ�");
		for (int i = 0; i < d1.length; i++) {
			System.out.println(d1[i].showDogInfo());
		}
		
		ArrayList<Dog> d2 = new ArrayList<Dog>();
		d2.add(new Dog("��1","��Ÿ1"));
		d2.add(new Dog("��2","��Ÿ2"));
		d2.add(new Dog("��3","��Ÿ3"));
		d2.add(new Dog("��4","��Ÿ4"));
		d2.add(new Dog("��5","��Ÿ5"));
		
		for (int i = 0; i <d2.size(); i++) {
			Dog d3=d2.get(i);
			System.out.println(d3.showDogInfo());
		}
	}

}
