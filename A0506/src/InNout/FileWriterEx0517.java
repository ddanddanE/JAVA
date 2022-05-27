package InNout;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx0517 {

	public static void main(String[] args) {
		try {
			BufferedWriter in = new BufferedWriter(new FileWriter("writer.txt"));
			in.write('A');
			char buf[] = { 'B', 'C', 'D', 'E', 'F', 'G' };
			in.newLine();
			in.write(buf);
			in.newLine();
			in.write("안녕하세요. 잘 써지네요");
			in.newLine();
			in.write(buf, 1, 2);
			in.newLine();
			in.write("65");
			in.newLine();
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");

		try {
			FileWriter fw1 = new FileWriter("writer1.txt");
			fw1.write('A');
			char buf1[] = { 'B', 'C', 'D', 'E', 'F', 'G' };
			fw1.write(buf1);
			fw1.write("Hi, Enter the keyword");
			fw1.write(buf1, 1, 4);
			fw1.write("68");
			fw1.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("두번째 출력도 완료되었습니다.");
		
		try {
			FileWriter fw = new FileWriter("hi.txt");
			fw.write("안녕하세요");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
