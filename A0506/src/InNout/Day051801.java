package InNout;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Day051801 {

	public static void main(String[] args) throws IOException {
		ByteArrayInputStream in =null;
		FileOutputStream out =null;
		
		try {
			byte[]b=new byte[] {1,2,3};
			in =new ByteArrayInputStream(b);
			out =new FileOutputStream("g.dat");
			int r =-1;
			while ((r=in.read())!=-1) {
				out.write(r);
			}
			}
		
		 catch (Exception e) {
			out.close();
			in.close();
		}
	}

}
