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
		
		System.out.println(title+" 작가 미상");
	}

	public Book() {
		System.out.println("생성자 호출!!");
	}
	
}
public class Day052709 {

	public static void main(String[] args) {
		Book b1=new Book("멋진 신세계", "올더스 헉슬리");

		 Book b2=new Book("더 해빙");

		 Book b3=new Book(); 
	}

}
