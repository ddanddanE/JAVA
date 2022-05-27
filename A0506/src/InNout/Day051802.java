package InNout;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Day051802 {

	public static void main(String[] args) throws IOException {
	FileInputStream in =null;
	ByteArrayOutputStream out=null;
	try {
		in=new FileInputStream("g.dat");
		out = new ByteArrayOutputStream();
		
		int r =-1;
		while ((r=in.read())!=-1) {
			out.write(r);
		}
		byte[]b=out.toByteArray();
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	} catch (Exception e) {
		out.close();
		in.close();
	}
	}

}
