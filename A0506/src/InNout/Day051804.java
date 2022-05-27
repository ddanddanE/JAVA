package InNout;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Day051804 {

	public static void main(String[] args) throws IOException {
		DataOutputStream out = null;
		
		try {
			int a = 5;
			double b =1.5;
			boolean c= true;
			FileOutputStream fos = new FileOutputStream("h.txt");
			out = new DataOutputStream(fos);
			
			out.writeInt(a);
			out.writeDouble(b);
			out.writeBoolean(c);
		} catch (Exception e) {
			out.close();
		}
	}

}
