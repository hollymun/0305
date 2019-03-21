import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;

public class EtcWindow extends Frame {
	
	Panel panel;
	TextArea ta;
	TextField tf; 
	Scrollbar sb;
	
	public EtcWindow() {
		
		setSize(500, 500);
		setLocation(10, 10);
		setTitle("기타 컴포넌트");
		
		panel = new Panel();
		
		//열 개수만 가지고 생성
		tf = new TextField(20);
		tf.setEchoChar('*');
		panel.add(tf);
		
		//행 수와 열 수를 가지고 생성 
		ta = new TextArea(10, 30);
		panel.add(ta);
		
		sb = new Scrollbar();
		panel.add(sb);
		
		
		for(int i=0; i<20; i=i+1) {
			Button btn = new Button("버튼" + i );
			panel.add(btn);
		}
		
		//add(panel);
		//패널을 ScrollPane 위에 부착하고 ScrollPane을 프레임에 부착 
		ScrollPane sp = new ScrollPane();
		sp.add(panel);
		add(sp);
		setVisible(true);
		
		
		
	}

}
