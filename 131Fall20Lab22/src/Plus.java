import java.awt.Graphics;

public class Plus implements DrawableThing{
    private int size, x, y;
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int xIn) {
		this.x=xIn;
	}
	
	public void setY(int yIn) {
		this.y=yIn;
	}
	
	public void setSize(int sizeIn) {
		this.size=sizeIn;
	}
	
	public void drawSelf(Graphics g) {

		g.drawRect(this.x, (this.y+(size/2)), this.size, 0);
		g.drawRect((this.x+(size/2)), this.y, 0, this.size);
		
	}
}
