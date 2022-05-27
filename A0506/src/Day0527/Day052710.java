package Day0527;

class Friend {

	private String name;

	private String phone;

	Friend(String name, String phone) {

		this.name = name;
		this.phone = phone;
	}

	String get() {

		return name + " " + phone;
	}
}
class ITFriend extends Friend{
	String major;
	ITFriend(String name, String phone,String major) {
		super(name, phone);
		this.major=major;
	}
	void show() {
		System.out.println(major+" "+super.get());
	}
	
}
public class Day052710 {

	public static void main(String[] args) {
		ITFriend it = new ITFriend("홍길동", "010-111-1111", "컴퓨터");

		it.show();

	}

}
