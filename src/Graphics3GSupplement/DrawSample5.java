package Graphics3GSupplement;

import java.awt.*;

public class DrawSample5 {
	public static void main(String[] args) {
		
		DrawingPanel panel = new DrawingPanel(400, 500);
		panel.setBackground(Color.BLACK);
		
		Graphics g = panel.getGraphics();
		g.setColor(Color.BLUE);
		g.fillRect(150, 10, 40, 20);
		g.fillOval(50, 25, 20, 20);
		g.setColor(Color.RED);
		g.fillOval(150, 50, 40, 20);
		g.fillRect(25, 50, 20, 20);
	}
}
