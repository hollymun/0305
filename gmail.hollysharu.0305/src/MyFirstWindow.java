import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class MyFirstWindow extends Frame {
	String [] title = {"___", "__-", "_--", "---", "--_", "-__"};
	Color [] colors = {Color.DARK_GRAY, Color.LIGHT_GRAY}; 
	
	int i = 0; 
	int j = 0; 
	
	public MyFirstWindow(){
		//타이틀과 크기 및 좌표 설정 
		this.setTitle("나의 첫 윈도우");
		this.setSize(300,200);
		this.setLocation(100,100);
		
		final Panel p = new Panel();
		//p.setBackground(Color.CYAN);
		p.setBackground(new Color(227,196,255));
		
		//Anonymous Class에서는 포함하고 있는 메소드의 지역변수를 사용할 수 없음 
		//Panel p를 직접 사용할 수 없음 
		new Thread(){
			public void run() {
				try {
					while(true) {
						Thread.sleep(500);
						j = j + 1; 
						p.setBackground(colors[j%2]);
					}
				}catch(Exception e) {}
			}
		}.start();
		
		
		add(p);
		
		//보기모드 설정 
		this.setVisible(true);
		
		new Thread() {
			public void run() {
				try {
					//무한반복해서 프레임의 타이틀을 title 배열의 값으로 설정 
					while(true) {
						i = i + 1; 
						Thread.sleep(500);
						setTitle(title[i%6]);
					}
				}catch(Exception e) {}
			}
		}.start();
		
			
	}
}
