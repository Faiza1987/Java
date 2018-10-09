package Graphics3GSupplement;

import java.awt.Graphics;
import java.awt.*;

public class DrawSample1 {
	public static void main(String[] args) {
		//create the drawing panel
		DrawingPanel panel = new DrawingPanel(500, 500);
		
		//draw a line on the panel using the Graphics paint brush
//		Graphics g = panel.getGraphics();
//		g.drawLine(25, 75, 175, 25);
		
		//draw a triangle on the panel
//		Graphics t = panel.getGraphics();
//		t.drawLine(25, 75, 100, 25);
//		t.drawLine(100, 25, 175, 75);
//		t.drawLine(25, 75, 175, 75);
		
		//draw a rectangle
//		Graphics r = panel.getGraphics();
//		r.drawRect(50, 25, 400, 200);
		
		//draw oval
		Graphics o = panel.getGraphics();
		o.drawOval(50, 25, 400, 300);


	}
	
}
