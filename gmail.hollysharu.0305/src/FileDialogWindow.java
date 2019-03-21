import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class FileDialogWindow extends Frame {
	public FileDialogWindow() {
		this.setTitle("파일 대화상자");
		setSize(300,300);
		setLocation(20,20);
		
		//파일 대화상자 만들기 
		FileDialog fd = new FileDialog(this, "열기 대화상자", FileDialog.LOAD);
		fd.setVisible(true);

		String directory = fd.getDirectory();
		String filename = fd.getFile();
		
		Panel p = new Panel();
		//레이블에 디렉토리 경로와 파일이름을 출력 
		Label label = new Label(directory + "\\" + filename);
		p.add(label);
		add(p);
		
		
		setVisible(true);
		
		
	}
}
