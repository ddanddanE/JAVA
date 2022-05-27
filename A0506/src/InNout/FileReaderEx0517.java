package InNout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx0517 {

	public static void main(String[] args) {
		String r;
		try {
			BufferedReader out = new BufferedReader(new FileReader("writer.txt"));
			while (true) {
				r = out.readLine();
				if(r == null) {
					break;
				}
				System.out.println(r);
			}
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("-----------------------------------------------------------");
		char arr[] = new char [50];
		int t;
		try {
			FileReader fr = new FileReader("writer1.txt");
			try {
				t=fr.read(arr, 0, arr.length);
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i]);
				}
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
