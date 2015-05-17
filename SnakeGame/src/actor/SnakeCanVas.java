package actor;

import java.awt.Graphics;
import java.awt.Point;
import java.util.LinkedList;

public class SnakeCanVas {
	private final int BOX_HEIGHT = 5; // do dai 1 don vi
	private final int BOX_WIDTH = 5; // do rong 1 don vi
	private final int GRID_WIDTH = 30; // do rong luoi 30 don vi
	private final int GRID_HEIGHT = 30; // do dai luoi 30 don vi
	private LinkedList<Point> snake;

	public void draw(Graphics g) {

	}

	public void drawGrid(Graphics g) {
		// ve hinh co toa do (0,0) va (150,150)
		g.drawRect(0, 0, GRID_WIDTH * BOX_WIDTH, GRID_HEIGHT * BOX_HEIGHT);
		
		//ve duong thang tu (x,0) toi (x,BH*GH)
		for (int x = BOX_WIDTH; x < GRID_WIDTH * BOX_WIDTH; x += BOX_WIDTH) {
			g.drawLine(x, 0, x, BOX_HEIGHT*GRID_HEIGHT);
		}
		
		//ve duong thang tu (0,y) toi (GW*BW)
		for (int y = BOX_HEIGHT;y<GRID_HEIGHT*BOX_HEIGHT;y +=BOX_HEIGHT) {
			g.drawLine(0, y, BOX_WIDTH*GRID_WIDTH, y);
		}
	}
}
