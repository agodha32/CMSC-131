
public class rightTriangle {

	public static void main(String[] args) {
		int width = 10;
		
        for (int col = 0; col <= width / 2; col++) {
            for (int row = 0; row <= col; row++) 
            { 
            System.out.print("*"+ " "); 
            } 
            System.out.println(""); 
            } 
            for (int col = width - 1; col >= 0; col--)
        {
            for(int row = 0; row <= col - 1; row++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println("");
        }
	}

}
