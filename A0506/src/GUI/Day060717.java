package GUI;

import java.awt.Color;
import java.awt.Frame;

public class Day060717 {

	public static void main(String[] args) {
		Frame frame = new Frame("ù ������");//������ ����
		frame.setBounds(800, 100, 400, 300);//( x��ǥ, y��ǥ, �ʺ�, ���� )
		
		System.out.println(frame.getBounds().getWidth());//double�������� ��ȯ
		System.out.println(frame.getBounds().height);//int�� �Ӽ�
		
		frame.setBackground(Color.BLUE);//���� ����
		frame.setVisible(true);//true�� ������ ȭ�鿡 ������ ����

	}

}
