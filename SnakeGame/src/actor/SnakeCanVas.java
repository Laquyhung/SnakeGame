package actor;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.LinkedList;

public class SnakeCanVas implements Runnable {
	private final int BOX_HEIGHT = 5; // do dai 1 don vi
	private final int BOX_WIDTH = 5; // do rong 1 don vi
	private final int GRID_WIDTH = 30; // do rong luoi 30 don vi
	private final int GRID_HEIGHT = 30; // do dai luoi 30 don vi
	private LinkedList<Point> snake;
	private Point fruit;

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
	public void drawSnake(Graphics g){
		g.setColor(Color.GREEN);
		for (Point p:snake) {
			//ve hinh ran la cac khoi vuong
			g.fillRect(p.x, p.y, BOX_WIDTH, BOX_HEIGHT);  
		}
		g.setColor(Color.BLACK);
	}
	
	public void drawFruit(Graphics g) {
		g.setColor(Color.RED);
		//ve moi hinh tron
		g.fillOval(fruit.x, fruit.y, BOX_WIDTH, BOX_HEIGHT);
	}
	
	public void draw(Graphics g) {
		drawGrid(g);
		drawSnake(g);
		drawFruit(g);
	}
	
	public void move(){
		
	}
	
	@Override
	public void run() {
		
		
	}
}
