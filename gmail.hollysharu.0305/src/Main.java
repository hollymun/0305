import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//인스턴스 생성 
		//new MyFirstWindow();
		
		//new MyDialogWindow();
/*		
		new ButtonWindow();

		List <String> languageList = new ArrayList<String>();
		languageList.add("JAVA");
		languageList.add("C&C++");
		languageList.add("Python");
		languageList.add("VC#");
		languageList.add("SQL");
		languageList.add("Scala");
		languageList.add("Javascript");		
		
		//삭제할 목록의 인덱스 배열 
		int [] ar = {1, 3, 5}; 
		//List에서 삭제는 remove 
		//반복문으로 삭제하면 1을 지우면 2번째 있던 게 1이 되므로 삭제 안 됨 
		//뒤에서부터 삭제해야 인덱스가 변하지 않음 
		int i = 0;
		int size = ar.length;
		for(i=0; i<size; i=i+1) {
			languageList.remove(ar[size-1-i]);
		}
		System.out.printf("%s\t", languageList);
*/
		
		//new EtcWindow();
	
		//new FileDialogWindow();

		new LayoutWindow();
	}

}
