import java.awt.Graphics;

public class Triangle implements DrawableThing {
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

			int[] xPoints= {this.x, (this.x+size/2), (this.x+size)};
			int[] yPoints= {(this.y+size), (this.y), (this.y+size)}; 
			g.drawPolygon(xPoints, yPoints, 3);
		}
}
