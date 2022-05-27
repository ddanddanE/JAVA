package InNout;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterTest0517 {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("b.txt");
			BufferedWriter out = new BufferedWriter(fw);
			
			out.write("æ»≥Á~");
			out.newLine();
			out.write("ø¿¥√¿∫ »≠ø‰¿œ");
			out.newLine();
			out.write("aaa@naver.com");
			out.newLine();
			out.close();	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
