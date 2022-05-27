package InNout;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Day051805 {

	public static void main(String[] args) throws IOException {
		DataInputStream in = null;
		
		try {
			FileInputStream fi = new FileInputStream("h.txt");
			
			in = new DataInputStream(fi);
			
			int a = in.readInt();
			double b = in.readDouble();
			boolean c = in.readBoolean();
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		} catch (Exception e) {
			in.close();
		}
		
		
	}

}
