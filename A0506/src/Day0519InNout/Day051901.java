package Day0519InNout;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Day051901 {
	public static void main(String[] args) throws IOException{
		FileWriter fw;
		BufferedWriter b = null;
		try {
			fw = new FileWriter("system.dat");
			 b = new BufferedWriter(fw);
			
			char a[]=new char[] {'∏Ò','ø‰','¿œ'};
			b.write(a);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			b.close();
		}
		
		
		
	}
	

}
