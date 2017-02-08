
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JPanel;

public class MyPanelClass extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	
	//Compute interior Coordinates
		
		Insets myInsets = this.getInsets();
		
		int x1 = myInsets.left;
		int y1 = myInsets.top;
		int x2 = getWidth()- myInsets.right - 1;
		int y2 = getHeight() - myInsets.bottom - 1;
		
		int width = x2 - x1;
		int height = y2 - y1;
		
		//Paint the background 
		
		g.setColor(Color.DARK_GRAY);
		g.fillRect(x1, y1, width + 1, height + 1);
		
		//Draw a border
//		
//		g.setColor(Color.CYAN);
//		g.drawRect(x1, y1, width, height);
//		
//		//Inner border
//		
//		g.setColor(Color.MAGENTA);
//		g.drawRect(x1 + 2, y1 + 2, width -3, height -3);
//		
//		//Lines
//		
//		g.setColor(Color.WHITE);
//		g.drawLine(x1, y1, x2, y2);
//		
//		g.setColor(Color.ORANGE);
//		g.drawLine(x2, y1, x1, y2);
		
	     g.setColor(Color.LIGHT_GRAY);
         g.fillOval((x2-55)/2, (y2-55)/2, 55, 55);
//		
	}
	
}
