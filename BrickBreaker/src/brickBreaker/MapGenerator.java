package brickBreaker;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class MapGenerator {
	public int map[][];
	public int brickWidth;
	public int brickHeight;
	
	public MapGenerator(int row, int column) {
		// 
		
		map = new int[row][column];
		
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[0].length; j++) {
			// 1 -> the brick on that particular index of the 2D array has not intersected with the ball and should continue to show on screen
			// 0 -> the brick on that particular index of the 2D array has intersected with the ball and should be removed from the screen
				map[i][j] = 1;
			}
		}
		
		brickWidth = 540 / column;
		brickHeight = 150 / row;
		
	}
	
	public void draw(Graphics2D g) {
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[0].length; j++) {
				if(map[i][j] > 0) {
					g.setColor(Color.white);
					g.fillRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);
					
					g.setStroke(new BasicStroke(3));
					g.setColor(Color.black);
					g.drawRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);
				}
			}
		}
	}
	
	public void setBrickValue(int value, int row, int column) {
		map[row][column] = value;
	}
}
