	
public class NumberList {

	public int[] values;  
	
	public NumberList() {
		
		values = new int[0];
		
	}
	
	public NumberList(int[] a) {
		
		values = new int[a.length];
		
		for (int num = 0; num < a.length; num++) {
			
			values[num] = a[num];
			
		}
		
	}
	
	public int getSize() {
		
		return values.length;
		
	}
	
	public int getAt(int index) {
		
		if (index < 0 || index >= getSize()) {
			
			throw new IndexOutOfBoundsException ();
			
		} else {
		
			return values[index];
		
		}
		
	}
	
	public long getTotal() {
		
		long sum = 0;
		
		for (int num = 0; num < values.length; num++) {
			
			sum = sum + values[num];
			
		}
		
		return sum;
		
	}
	
	public boolean contains(int number) {
		
		boolean parameter = true;
		
		for (int num = 0; num < values.length; num ++) {
			
			if (values[num] == number) {
				
				parameter =  true;
				break;
				
			} else {
				
				parameter = false;
				
			}
			
		}
		
		return parameter;
		
	}
	
	public void add(int number) {

		int temp[] = new int[values.length + 1];
		
		for(int num = 0; num < values.length; num++) {
			
			temp[num] = values[num];
			
		}
		
		temp[temp.length - 1] = number;
		
		values = temp;
		
	}
	
}
