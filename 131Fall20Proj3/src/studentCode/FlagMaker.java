package studentCode;
import java.awt.Color;
import GridTools.MyGrid;

public class FlagMaker {

	public static void drawFlag(MyGrid grid, int countryCode) {
		
		int height = grid.getHt();
		int width = grid.getWd();
		
		if (countryCode == 1 && height % 2 == 0) {

			drawRectangle(grid, 0, (height / 2), Color.RED);
			drawRectangle(grid, (height / 2), height, Color.WHITE);
			
		} else if (countryCode == 2 && height % 3 == 0) { 
		
			drawRectangle(grid, 0, (height / 3), Color.YELLOW);
			drawRectangle(grid, (height / 3), 2 * (height / 3), Color.GREEN);
			drawRectangle(grid, 2 * (height / 3), height, Color.RED);
		
		} else if (countryCode == 3 && height % 4 == 0) {

			drawRectangle(grid, 0, (height / 2), Color.BLUE);
			drawRectangle(grid, (height / 2), 3 * (height / 4), Color.YELLOW);
			drawRectangle(grid, 3 * (height / 4), height, Color.GREEN);
				
		} else if (countryCode == 4) {

			for(int col = 0; col < height; col++) { 
				
				for(int row = 0; row < (width / 2); row++) {
					
					grid.setColor(col, row, Color.WHITE);
					
				}
			
			}
			
			for(int col = 0; col < height; col++) { 
				
				for(int row = (width / 2); row < width; row++) {
					
					grid.setColor(col, row, Color.RED);
					
				}
			
			}
			
		} else if (countryCode == 5 && height % 3 == 0) {

			for(int col = 0; col < height; col++) { 
				
				for(int row = 0; row < (width / 3); row++) {
					
					grid.setColor(col, row, Color.BLACK);
					
				}
			
			}
			for(int col = 0; col < height; col++) { 
				
				for(int row = (width / 3); row < 2 *  (width / 3); row++) {
					
					grid.setColor(col, row, Color.RED);
					
				}
			
			}

			for(int col = 0; col < height; col++) { 
				
				for(int row = 2 *  (width / 3); row < width; row++) {
					
					grid.setColor(col, row, Color.GREEN);
					
				}
			
			}
			
		} else if (countryCode == 6) {

			drawRectangle(grid, 0, (height / 2), Color.GREEN);
			drawRectangle(grid, (height / 2) + 1, height, Color.BLUE);
			
			for(int col = 0; col < (height / 2); col++){
				
				for(int row = 0; row < 4*(col + 1); row++){
						
					grid.setColor(col, row, Color.RED);
					grid.setColor((height - 1) - col, row, Color.RED);
						
				}
			}
			
			if (height % 2 == 1) {
				
				drawRectangle(grid, (height / 2), (height / 2) + 1, Color.RED);
				
			}
			
			
			
		} else if (countryCode == 7 && height >= 8 && height % 2 == 0) {

			for(int col = height; col < width; col++) {
				
				drawRow(grid, width - col - 1 , Color.RED);
			}
			
			for (int col = 0; col < height; col++) {
				
				for (int row = 2 * col; row < (2 * col) + 2; row++) {
					
					grid.setColor(col, row, Color.ORANGE);
					grid.setColor((height - 1) - col, row, Color.ORANGE);
					
				}
					
				
			}
			
			drawRectangle(grid, (height / 2)- 1, (height / 2)+ 1, Color.ORANGE);
			
			for(int col = 0; col < height; col++) { 
				
				for(int row = (width / 2) - 1; row < (width / 2) + 1; row++) {
					
					grid.setColor(col, row, Color.ORANGE);
					
				}
			
			}
			
			for (int col = (height / 2) - 2; col < (height / 2) + 2; col++) {
				
				for (int row = (width / 2) - 4; row < (width / 2) + 3; row++) {
					
					grid.setColor(col, row, Color.ORANGE);
					
				}
				
			}
			
		} else if (countryCode == 8 && height % 3 == 0 && height % 2 == 1) {

			drawRectangle(grid, 0, (height / 3), Color.BLUE);
			drawRectangle(grid, (height / 3), 2 * (height / 3), Color.YELLOW);
			drawRectangle(grid, 2 * (height / 3), height, Color.BLUE);
			drawTriangle(grid, Color.BLACK);
			
			for (int col = (height / 2); col < (height / 2) + 1; col++) {
				
				for (int row = 0; row < (height / 2) + 1; row++) {
					
					grid.setColor(col, row, Color.BLACK);
					
				}
				
			}
			
		} else if (countryCode == 9 && height % 7 == 0) { 

			drawRectangle(grid, 0, (height / 7), Color.GREEN);
			drawRectangle(grid, (height / 7), 2 * (height / 7), Color.YELLOW);
			drawRectangle(grid, 2 * (height / 7), 3 * (height / 7), Color.RED);
			drawRectangle(grid, 3 * (height / 7), 4 * (height / 7),
					Color.BLACK);
			drawRectangle(grid, 4 * (height / 7), 5 * (height / 7), Color.RED);
			drawRectangle(grid, 5 * (height / 7), 6 * (height / 7),
					Color.YELLOW);
			drawRectangle(grid, 6 * (height / 7), height, Color.GREEN);
			drawTriangle(grid, Color.WHITE);
			
			if (height % 2 == 1) {
				
				for (int row = (height / 2); row < (height / 2) + 1; row++) {
					
					for (int col = 0; col < (height / 2) + 1; col++) {
						
						grid.setColor(row, col, Color.WHITE);
						
					}
					
				}
			}		
			
		} else {
			
			for(int col = height; col < width; col++) {
				
				drawRow(grid, width - col - 1 , Color.WHITE);
			}
				
			grid.setColor(0, 0, Color.RED);
			grid.setColor(0, width - 1, Color.YELLOW);
			grid.setColor(height - 1, width - 1, Color.GREEN);
			grid.setColor(height - 1, 0, Color.BLUE);
			
		}
		
		
	}
	
	public static void drawRow(MyGrid grid, int rowNum, Color color) {
		
		int width = grid.getWd();
		
		for (int col = 0; col < width; col++) {
			
			grid.setColor(rowNum, col, color);
			
		}
		
	}
		
	public static void drawRectangle(MyGrid grid, int start, int end,
			Color color) {
			
			int width = grid.getWd();
		
		for (int col = start; col < end; col++) {
			
			for (int row = 0; row < width; row++) {
				
				grid.setColor(col, row, color);
				
			}
			
		}
		
	}
	
	public static void drawTriangle(MyGrid grid, Color color) {
		
		int height = grid.getHt();
				
		for(int col = 0; col < (height / 2); col++){
				
			for(int row = 0; row < (col + 1); row++){
					
				grid.setColor(col, row, color);
				grid.setColor((height - 1) - col, row, color);
					
			}
		}
			
	}	

}