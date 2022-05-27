package InNout;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Day051806 {

	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		
		FileWriter fw = null;
		
		int r;
		try {
			fw = new FileWriter("sample.txt");
			while ((r=in.read())!=-1) {
				fw.write(r);
			}
			fw.close();
			in.close();
		} catch (Exception e) {
		}
		
		
	}
	}


