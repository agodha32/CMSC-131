package question4;

public class SevenCounter {

	public static int countSevens(int[] a) {
		
		int c = 0;
		
		return count_sevens_helper(a, 0,0);		
	}

	public static int count_sevens_helper(int [] array, int x, int c){

	 if(x==array.length){
	    
		 return c;
		 
	   }
	   
	   if (array[x]==7){
		   
	       c++;
	   
	   }
	   
	   x++;
	   
	   count_sevens_helper( array, x,  c);
	   
	   return c;
	}
	
}
