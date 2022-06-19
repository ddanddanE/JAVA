package GUI;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
class Check implements ItemListener{
	
	JRadioButton j1;
	JRadioButton j2;
	JRadioButton j3;
	
	Check(JRadioButton j1,JRadioButton j2,JRadioButton j3){
		this.j1=j1;
		this.j2=j2;
		this.j3=j3;
	}
	public void  itemStateChanged(ItemEvent e) {
		if(e.getStateChange()==ItemEvent.SELECTED) {
			//체크박스 선택 햇을때 라디오버튼을 활성화
			j1.setEnabled(true);
			j2.setEnabled(true);
			j3.setEnabled(true);
		}
		else {   //체크박스 선택 안했을 시
			j1.setEnabled(false);
			j2.setEnabled(false);
			j3.setEnabled(false);
		}
	}
}
public class Day060711 extends JFrame{

	public static void main(String[] args) {
		
		JFrame j=new JFrame();
		j.setLayout(new GridLayout(0,1));
		
		JCheckBox jc=new JCheckBox("공부 선택");
		
		JRadioButton b1=new JRadioButton("Java");
		JRadioButton b2=new JRadioButton("Python");
		JRadioButton b3=new JRadioButton("C#");
		
		ButtonGroup g1=new ButtonGroup();
		g1.add(b1);
		g1.add(b2);
		g1.add(b3);
		
		j.add(jc);
		j.add(b1);
		j.add(b2);
		j.add(b3);
		
		//라디오버튼 비활성화
		b1.setEnabled(false);
		b2.setEnabled(false);
		b3.setEnabled(false);
		
		//체크박스 선택시
		jc.addItemListener(new Check(b1,b2,b3));
		
		//라디오버튼 이벤트 처리
		b1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					System.out.println("자바!!");
				}
			}
		});
		b2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					System.out.println("파이썬!!");
				}
			}
		});
		b3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					System.out.println("C#!!");
				}
			}
		});
		
		
		
		
		j.setVisible(true);
	 
	
	}

}
