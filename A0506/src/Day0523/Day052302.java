package Day0523;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
//4.
class Rectangle{
	int width;
	int height;
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	double area() {
		return width*height;
		
	}
}
class Song{
	String title;
	public Song(String title) {
		this.title = title;
	}
	public String getsong() {
		return title;
	}
	
}
public class Day052302 {

	public static void main(String[] args) throws IOException {
		//1.
		Scanner sc =new Scanner(System.in);
		int sum =1;
		double count=-1;
		int i=0;
		while(i!=-1) {
			i=sc.nextInt();
			sum+=i;
			count++;
		}
		System.out.println(sum/count);
		
		//2.
		FileWriter fw = new FileWriter("test01.txt");
		BufferedWriter in1 = new BufferedWriter(new FileWriter("test01.txt"));
		in1.write("Hi");
		in1.newLine();
		in1.write("저는 자바를 좋아하고 잘합니다.");
		in1.newLine();
		in1.write("앞으로 더 열심히 공부할 것입니다.");
		in1.newLine();
		in1.close();
		System.out.println("2끝");
		
		//3-1.
		BufferedWriter in = new BufferedWriter(new FileWriter("test02.txt"));
		String name ="test";
		String id = null;
		
		while(name != null) {
			System.out.println("enter name: ");
			name = sc.next();
			sc.nextLine();
			in.write(name);
			if(name.equals("그만")) {
				break;
			}else {
				System.out.println("enter id: ");
				id = sc.next();
				sc.nextLine();
				in.write(id);
				in.newLine();
			}
			
		}
		in.close();
		
		System.out.println("3-1.끝");
		
		//3-2.
		char arr[] = new char [50];
		int r;
		try {
			FileReader fr = new FileReader("test02.txt");
			try {
				r=fr.read(arr, 0, arr.length);
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[j]);
				}
				fr.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
		//4.
		Rectangle rec = new Rectangle();
		rec.width=5;
		rec.height=6;
		System.out.println();
		System.out.println("사각형 면적"+rec.area());
		
		//5.
		Song s1=new Song("On");
		Song s2=new Song("Butter");
		System.out.println("좋아하는 노래 "+s1.getsong());
		System.out.println("내 노래 "+s2.getsong());
	}
	}
		


