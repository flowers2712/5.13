package nwk02.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 UI (User Interface) 는 화면을 구성하는 개념으로
 사용자가 처음 마주하는 부분이라는 의미이다.
 */
public class LottoUI extends JFrame implements ActionListener{
	LottoVO lotto; // lotto 변수에 있는 값을 아래 메소드들이 공유하기 위해
					// 필드에 인스턴스 변수를 선언하였다.
	JButton btn;
	JPanel panelNorth, panelSouth;
	ImageIcon icon; // import 단축키 : Ctrl + Shift + o
	List<JButton> btns; // List 는 java.util.List 를 선택
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
