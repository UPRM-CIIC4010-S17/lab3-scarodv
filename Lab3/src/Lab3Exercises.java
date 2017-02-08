import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame ricardoReyes = new JFrame("Hello, world!");
		ricardoReyes.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ricardoReyes.setLocation(900, 400);
		ricardoReyes.setSize(200, 200);
		
		MyPanelClass myPanel = new MyPanelClass();
		ricardoReyes.getContentPane().add(myPanel);
		
		ricardoReyes.setVisible(true);
	}
}