package Graphics3GSupplement;

import java.awt.Graphics;

public class DrawSample3 {
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(400, 500);
		
		Graphics g = panel.getGraphics();
		g.fillRect(25, 50, 20, 20);
		g.drawRect(150, 10, 40, 20);
		g.drawOval(50, 25, 20, 20);
		g.fillOval(150, 50, 40, 20);
	}
}
