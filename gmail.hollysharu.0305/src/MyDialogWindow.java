import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Panel;

public class MyDialogWindow extends Frame {
	
	public MyDialogWindow() {
		setTitle("대화상자 윈도우");
		setSize(400, 400);
		setLocation(100,100);
		setVisible(true);
	
		
		//대화상자 생성 
		//대화상자는 부모 윈도우가 존재해야 함 
		//프레임이나 다른 대화상자의 참조를 가지고 생성 
		//두 번째 매개변수에 true를 대입하면 모달로 생성 
		//모달은 화면에 출력되면 사라지기 전까지 제어권을 절대로 뺏기지 않는 대화상자
		Dialog d = new Dialog(this, false);
		d.setSize(200, 200);
		d.setVisible(true);
		
		
	}

}
