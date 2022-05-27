package InNout;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		BufferedReader br= null;
		PrintWriter pr = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			FileWriter fw = new FileWriter("d.txt");
			pr = new PrintWriter(fw);
			String str = null;
			while ((str= br.readLine())!=null) {
				pr.println(str);
				
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			pr.close();
		}
		
	}

}
