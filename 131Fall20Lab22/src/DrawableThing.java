import java.awt.Graphics;

public interface DrawableThing {
	
	public int getX();
	
	public int getY();
	
	public void setX(int x);
	
	public void setY(int y);
	
	public void setSize(int size);
	
	public void drawSelf(Graphics g);
	
}
