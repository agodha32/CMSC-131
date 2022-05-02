package question1;

public class TwoDArrayMaker {

	 public static int [][] makeArray(int size){
		   
		   int[][] x = new int [size][];
		   
		   int y = 1;
		   
		   for(int z = 1; z <= size; z++){
			   
			  x[z-1] = new int [z];
		   
		   }
		   
		   for (int i=0; i<size; i++){
		       
		       for (int j=0; j<=i; j++){
		           
		           x[i][j] = y;
		       }
		       
		       y++;
		       
		   }
		   return x;
		}
}
