package InNout;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Day051803 {

	public static void main(String[] args) {
		byte[]in= {1,2,3,4,5};
		byte[]out=null;
		
		ByteArrayInputStream input=null;
		ByteArrayOutputStream output=null;
		
		output = new ByteArrayOutputStream();
		input = new ByteArrayInputStream(in);//in배열을 넣어
		
		int r=0;
		while ((r=input.read())!=-1) {
			output.write(r);
		}
		out=output.toByteArray();
		System.out.println(Arrays.toString(in));
		System.out.println(Arrays.toString(out));
		
	}

}
