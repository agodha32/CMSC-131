
import java.awt.Graphics;

public class Circle implements DrawableThing {
	
	private int x, y, size;

	public int getX(){
		
		return this.x;
		
	}
	
	public int getY(){
		
		return this.y;
		
	}
	
	public void setX(int xIn){
		
		this.x = xIn;
		
	}
	
	public void setY(int yIn){
		
		this.y = yIn;
	}
	
	public void setSize(int sizeIn){
		
		this.size = sizeIn;
		
	}
	
	public void drawSelf(Graphics g){
		
		g.drawOval(this.x, this.y, this.size, this.size);
		
	}
	
	
}
