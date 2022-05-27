package InNout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest0517 {
	public static void main(String[] args) {
		String r;
		
		try {
			BufferedReader in = new BufferedReader(new FileReader("b.txt"));
			while (true) {
			try {
				r = in.readLine();
				
				if(r == null) {
					break;
				}
				System.out.println(r);
			} catch (IOException e) {
				e.printStackTrace();
			}
			}
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
