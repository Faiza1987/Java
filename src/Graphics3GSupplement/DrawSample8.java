package Graphics3GSupplement;

import java.awt.*;

public class DrawSample8 {
	public static void main(String[] args) {
		
		DrawingPanel panel = new DrawingPanel(200, 100);
		panel.setBackground(Color.CYAN);
		
		Graphics g = panel.getGraphics();
		for(int i = 0; i < 4; i++) {
			g.setColor(Color.WHITE);
			g.fillOval(i * 50, i * 25, 50, 25);
			g.setColor(Color.BLACK);
			g.drawRect(i * 50, i * 25, 50, 25);
		}
	}
}
