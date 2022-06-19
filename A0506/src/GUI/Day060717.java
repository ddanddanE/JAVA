package GUI;

import java.awt.Color;
import java.awt.Frame;

public class Day060717 {

	public static void main(String[] args) {
		Frame frame = new Frame("첫 프레임");//프레임 제목
		frame.setBounds(800, 100, 400, 300);//( x좌표, y좌표, 너비, 높이 )
		
		System.out.println(frame.getBounds().getWidth());//double형식으로 반환
		System.out.println(frame.getBounds().height);//int형 속성
		
		frame.setBackground(Color.BLUE);//배경색 지정
		frame.setVisible(true);//true가 없으면 화면에 보이지 않음

	}

}
