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
			in.write("�ȳ��ϼ���. �� �����׿�");
			in.newLine();
			in.write(buf, 1, 2);
			in.newLine();
			in.write("65");
			in.newLine();
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");

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
		System.out.println("�ι�° ��µ� �Ϸ�Ǿ����ϴ�.");
		
		try {
			FileWriter fw = new FileWriter("hi.txt");
			fw.write("�ȳ��ϼ���");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
