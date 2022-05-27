package Day0525;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Stu implements Serializable {
	private String name;
	private String id;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class Day052501 {

	public static void main(String[] args) throws IOException {
		ObjectOutputStream os = null;
		try {
			os = new ObjectOutputStream(new FileOutputStream("ob.dat"));
			Stu s = new Stu();
			s.setName("ÁøÈ¯");
			s.setId("yun");
			s.setAge(27);

			os.writeObject(s);
		} catch (Exception e) {
		}
		os.close();
	

	
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("ob.dat"));

			Stu s = (Stu) in.readObject();

			System.out.println(s.getName());
			System.out.println(s.getId());
			System.out.println(s.getAge());

		} catch (Exception e) {
			e.printStackTrace();
		}
		in.close();
	}

}
