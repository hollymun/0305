import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.util.Random;

public class LayoutWindow extends Frame {

	public LayoutWindow() {
		setTitle("레이아웃 연습");
		setSize(200, 200);
		setLocation(10, 10);
		
		Panel panel = new Panel();
		//5개의 영역으로 분할해서 배치 
		//각 영역에 컴포넌트를 배치하기보다는 Panel을 배치하는 경우가 많음 
/*
		panel.setLayout(new BorderLayout());
		Button btn1 = new Button("버튼1");
		//BorderLayout에서는 위치를 설정하지 않으면 중앙에 위치 
		panel.add(btn1);
		
		Button btn2 = new Button("버튼2");
		panel.add("West", btn2);
		
		Button btn3 = new Button("버튼3");
		panel.add("East", btn3);
		
		Button btn4 = new Button("버튼4");
		panel.add("North", btn4);
		
		panel.setLayout(new FlowLayout());
		//위치 지정 없이 버튼만 추가하면 됨 
		Button btn1 = new Button("버튼1");
		panel.add(btn1);
		Button btn2 = new Button("버튼2");
		panel.add(btn2);
		Button btn3 = new Button("버튼3");
		panel.add(btn3);
		Button btn4 = new Button("버튼4");
		panel.add(btn4);
		Button btn5 = new Button("버튼5");
		panel.add(btn5);
		Button btn6 = new Button("버튼6");
		panel.add(btn6);

		
		//행과 열을 이용해서 배치하는 레이아웃 
		panel.setLayout(new GridLayout(5, 3));
		for(int i=0; i<10; i=i+1) {
			Button btn = new Button("버튼" + i);
			panel.add(btn);
		}
*/
		
		//레이블에 null을 설정한 경우는 위치를 직접 설정해주어야 함 
		panel.setLayout(null);
		Label label = new Label("@");
		label.setSize(20, 20);
		label.setLocation(30, 30);
		panel.add(label);
		
		new Thread(){
			int n = 10;
			Random r = new Random();
			public void run() {
				try {
					while(true) {
						Thread.sleep(500);
						int x = label.getX();
						if(x > 170) {
							n = - 10;
						}else if(x < 30) {
							n = + 10;
						}
						//label.setLocation(x+n, 30);
												//10부터 170까지 
						label.setLocation(r.nextInt(160)+10, r.nextInt(160)+10);
					}
				}catch(Exception e) {}
			}
		}.start();
		
		add(panel);
		setVisible(true);
	}

}
