package Day0527;
class Book{
	String name;
	String title;
	public Book(String title, String name) {
		this.name = name;
		this.title = title;
		System.out.println(title+" "+name);
	}

	public Book(String title) {
		this.title = title;
		
		System.out.println(title+" �۰� �̻�");
	}

	public Book() {
		System.out.println("������ ȣ��!!");
	}
	
}
public class Day052709 {

	public static void main(String[] args) {
		Book b1=new Book("���� �ż���", "�ô��� �佽��");

		 Book b2=new Book("�� �غ�");

		 Book b3=new Book(); 
	}

}
