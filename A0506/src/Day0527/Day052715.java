package Day0527;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Rec implements Serializable{
	int a;
	int b;
	public Rec(int a, int b) {
		this.a = a;
		this.b = b;
	}
	void show() {
		System.out.println(a+" "+b);
	}
}

public class Day052715 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		/*ObjectOutputStream os = null;
		os = new ObjectOutputStream(new FileOutputStream("obj.dat"));
		
		os.writeObject(new Rec(4, 7));
		os.writeObject(new Rec(8, 5));
		os.writeObject(new String("HIHI"));
		
		os.close();
	}*/
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("obj.dat"));
		Rec r1 = (Rec) in.readObject();
		Rec r2 = (Rec) in.readObject();
		String r3 = (String)in.readObject();
		r1.show();
		r2.show();
		System.out.println(r3);
		
		in.close();

}
}
