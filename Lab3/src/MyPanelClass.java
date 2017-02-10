
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

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
		
		g.setColor(Color.WHITE);
		g.fillRect(x1, y1, width + 1, height + 1);
		
		// Red Rectangles
		
		g.setColor(Color.RED);
		g.fillRect(x1, y1, width + 1, height/5 + 1);
		g.fillRect(x1, (height-(height/5 + 1))/2, width + 1, height/5 + 1);
		g.fillRect(x1, y2-(height/5), width + 1, height/5 + 1);
		
		//Draw a border
		
//		g.setColor(Color.CYAN);
//		g.drawRect(x1, y1, width, height);
//		
//		//Inner border
//		
//		g.setColor(Color.MAGENTA);
//		g.drawRect(x1 + 2, y1 + 2, width -3, height -3);
//		
		//Lines
		
		g.setColor(Color.CYAN);
		g.drawLine(x1, y1, x2/2, y2/2);
		
		g.setColor(Color.CYAN);
		g.drawLine(x2/2, height/2, x1, y2);
//		
//	    g.setColor(Color.LIGHT_GRAY);
//        g.fillOval((x2-55)/2, (y2-55)/2, 55, 55);	
//        
        //Polygons
        
//        Polygon p = new Polygon();
//        
//        p.addPoint(x1 + 5, y1 + 25);
//        p.addPoint(x1 + 20, y1 + 10);
//        p.addPoint(x1 + 35, y1 + 25);
//        p.addPoint(x1 + 25, y1 + 25);
//        p.addPoint(x1 + 25, y1 + 45);
//        p.addPoint(x1 + 15, y1 + 45);
//        p.addPoint(x1 + 15, y1 + 25);
//        
//        g.setColor(Color.YELLOW);
//        g.fillPolygon(p);
        
		  Polygon p1 = new Polygon();
	        
	        p1.addPoint(x1, y1);
	        p1.addPoint(width/2, height/2);
	        p1.addPoint(x1, y2);
	        
	        g.setColor(Color.CYAN);
	        g.fillPolygon(p1);
        
        Polygon p2 = new Polygon();
        
        p2.addPoint(width/10 + 5, height/2 - 7);
        p2.addPoint(width/10 + 21, height/2 - 7);
        p2.addPoint(width/10 + 27, height/2 - 22);
        p2.addPoint(width/10 + 33, height/2 - 7);
        p2.addPoint(width/10 + 49, height/2 - 7);
        p2.addPoint(width/10 + 36, height/2 + 3);
        p2.addPoint(width/10 + 41, height/2 + 18);
        p2.addPoint(width/10 + 27, height/2 + 8);
        p2.addPoint(width/10 + 14, height/2 + 18);
        p2.addPoint(width/10 + 18, height/2 + 3);
        
        g.setColor(Color.BLACK);
        g.drawPolygon(p2);
        
        g.setColor(Color.WHITE);
        g.fillPolygon(p2);
      
        
	}
	
}
