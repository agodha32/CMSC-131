
public class WhatDoesItDo {

	public static void main(String[] args) {

		int x = 4;

		
		// Very poor style -- leads to confusion!  (Don't do this!)
		if (x < 3) {
			if (x == 4) 
				System.out.println("X");
		else 
			System.out.println("Y");	
		}
	}
}
