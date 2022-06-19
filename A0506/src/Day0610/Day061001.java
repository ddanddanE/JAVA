package Day0610;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Day061001 {

	public static void main(String[] args) {
		BufferedWriter out =null;
		BufferedReader in =null;
		ServerSocket ser =null;
		Socket so =null;
		Scanner sc = new Scanner(System.in);
		
		try {
			so=ser.accept();
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			out=new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
			
			in= new BufferedReader(new InputStreamReader(so.getInputStream()));
			
			while (true) {
				String msg = in.readLine();
				if(msg.equals("stop")) {
					System.out.println("종료");
					break;
				}
				System.out.println("보내기");
				String outmsg = sc.nextLine();
				out.write(outmsg+"\n");
				out.flush();
			}
		} catch (Exception e) {
		}finally {
			try {
				sc.close();
				so.close();
				ser.close();
			} catch (Exception e2) {
				System.out.println("오류 발생");
			}
		}
	}

}
