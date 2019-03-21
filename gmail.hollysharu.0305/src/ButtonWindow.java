import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.List;

public class ButtonWindow extends Frame {
	//화면에 배치될 컴포넌트 변수 - 조작할 가능성이 높기 때문에 멤버 변수로 생성하는 것이 좋음 
	String [] title = {"___", "__-", "_--", "---", "--_", "-__"};
	Color [] colors = {Color.DARK_GRAY, Color.LIGHT_GRAY}; 

	private Button btn1, btn2, btn3;
	private Panel panel;
	
	boolean flag = true;
	int i = 0; 
	int j = 0; 
	
	//체크박스 3개
	Checkbox check1, check2, check3;
	//라디오버튼 3개
	Checkbox radio1, radio2, radio3;
	//Choice 1개
	Choice choice;
	//list 2개
	List list1;
	List list2;
	
	public ButtonWindow() {
		setTitle("버튼 윈도우");
		setSize(500, 300);
		setLocation(100, 100);
		setVisible(true);
		
		panel = new Panel();
		btn1 = new Button("캡슐화");
		btn2 = new Button("상속성");
		btn3 = new Button("다형성");
		btn3.setForeground(Color.GREEN);
		
		//setVisible 속성을 이용해서 btn1을 보이고 안 보이게 하는 동작 반복
		//지역변수를 사용하면 에러 멤버변수로 자리 옮겨야 함 
		//boolean flag = true;
		new Thread(){
			public void run() {
				try {
					while(true) {
						Thread.sleep(500);
						flag = !flag;
						btn1.setVisible(flag);
						btn3.setForeground(colors[j%2]);
	
						j = j + 1; 
						btn2.setBackground(colors[j%2]);
						btn2.setForeground(colors[j%2]);
						
						i = i + 1; 
						setTitle(title[i%6]);
					}
				}catch(Exception e) {}
			}
		}.start();
		

		//버튼을 패널에 추가 
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		
		check1 = new Checkbox("하루");
		check2 = new Checkbox("박시");
		check3 = new Checkbox("후추");
		
		panel.add(check1);
		panel.add(check2);
		panel.add(check3);
		
		//라디오 버튼을 CheckboxGroup으로 묶어서 생성
		CheckboxGroup job = new CheckboxGroup();
		radio1 = new Checkbox("Archer", job, false);
		radio2 = new Checkbox("Fighter", job, true);
		radio3 = new Checkbox("knight", job, false);
		//라디오는 필수 선택을 하도록 하는 컴포먼트이므로 기본적으로 하나는 true로 체크 
		panel.add(radio1);
		panel.add(radio2);
		panel.add(radio3);
		
		//Choice = ComboBox 
		choice = new Choice();
		choice.add("커크");
		choice.add("본즈");
		choice.add("스팍");
		
		panel.add(choice);

		list1 = new List(3, true);
		list1.add("Oracle");
		list1.add("MySQL");
		list1.add("MongoDB");
		list1.add("MS-SQL");
		
		list2 = new List(3, true);
		list2.add("IOS");
		list2.add("Android");
		list2.add("Tizen");
		list2.add("WebOS");
		
		panel.add(list1);
		panel.add(list2);
		
		//패널을 프레임에 추가 
		add(panel);
		
		setVisible(true);
		
	
		
	}

}
