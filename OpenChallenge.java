import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OpenChallenge extends JFrame{
	OpenChallenge(){
		setTitle("Open Challenge"); // 프레임의 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 프레임 윈도우를 닫으면 프로그램 종료
		Container c = getContentPane();
		c.setLayout(new BorderLayout()); 
		// 디폴트 값으로  이 배치관리자를 가지고 있기 때문에 따로 배치관리자 지정안해도 됨
		c.add(new NorthPanel(),BorderLayout.NORTH); // North 패널 추가
		c.add(new CenterPanel(),BorderLayout.CENTER); // Center 패널 추가
		setSize(300,300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OpenChallenge();
	}
	
}
class NorthPanel extends JPanel{ // NORTH에 붙일 패널
	NorthPanel(){
		setBackground(Color.LIGHT_GRAY);
		this.add(new JButton("Open"));
		this.add(new JButton("Read"));
		this.add(new JButton("Close"));
	}
}
class CenterPanel extends JPanel{ // CENTER에 붙일 패널
	CenterPanel(){
		this.setLayout(null);
		String text[] = {"Hello", "Java", "Love"};
		int x;
		int y;
		JLabel label;
		for(int i=0;i<3;i++) {
			x = (int)(Math.random()*250); // 글자 짤림 방지를 위해 50의 여유를 남김
			y = (int)(Math.random()*250);
			label = new JLabel(text[i]);
			label.setLocation(x, y); // 랜덤위치에 label 붙이기
			label.setSize(50,10); // label 크기 설정
			this.add(label);
		}
	}
}