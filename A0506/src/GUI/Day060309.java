package GUI;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Day060309 extends JFrame{
	Day060309(){
		super("JAVA");//���� ����
		setSize(300,300);//������ ũ�� ����
		setVisible(true);//������ ��� �޼ҵ�
		JButton jb1 = new JButton("��ư1");
		JButton jb2 = new JButton("��ư2");
		JButton jb3 = new JButton("��ư3");
		
		Container c= getContentPane();
		c.add(jb1);
		c.add(jb2);
		c.add(jb3);
		c.setLayout(new FlowLayout());
		
		c.setLayout(new FlowLayout());
		JButton j1=new JButton("������");
		JButton j2=new JButton("����");
		c.add(j1);
		c.add(j2);
	}
	
	
	public static void main(String[] args) {
		new Day060309();
	}

}
