package InNout;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.OutputStreamWriter;

public class Day051807 {

	public static void main(String[] args) {
		OutputStreamWriter out = null;
		FileReader fr = null;
		
		int r=0;
		try {
			fr = new FileReader("sample.txt");
			while ((r=fr.read())!=-1) {
				System.out.print((char)r);
			}
			fr.close();
			out.close();
		} catch (Exception e) {
		}
	}

}
