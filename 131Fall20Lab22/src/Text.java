
import java.awt.Graphics;

public class Text implements DrawableThing {
	
	private int x, y, size;
	private String text;

	public Text (String x) {
		
		text = x;
		
	}
	
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
		
		
		
		g.drawString(this.text, this.x, this.y);
		
	}
	
	
}
