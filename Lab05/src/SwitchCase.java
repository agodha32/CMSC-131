
public class SwitchCase {

	public static void main(String[] args) {
		int x = 0;
		char y = 'A';
		
		switch(y) {
		case 'B':
		case 'C':
		case 'G':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'S':
		case 'U':
		case 'V':
		case 'W':
		case 'Z':
			x = 1;
			break;
		case 'D':
		case 'J':
		case 'K':
		case 'P':
		case 'Q':
		case 'R':
		case 'T':
		case 'X':
		case 'Y':
			x = 2;
			break;
		case 'A':
		case 'F':
		case 'H':
		case 'I':
			x = 3;
			break;
		case 'E':
			x = 4;
			break;
		default:
			x = 0;
			break;
		}
		
	}
	
	
	public int NumMonths() {
		
		int numDaysInMonth = 0, year = 2020, month = 2;
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			numDaysInMonth = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numDaysInMonth = 31;
			break;
		case 2:
			numDaysInMonth = (year % 4 == 0) ? 29:28;
		default:
			System.out.println("You dumabss put in the correct Month/Year");
		}
		
		return numDaysInMonth;
	}
	
	public String ternaryOpertor() {
		
		int x = 0;
		String y = null;
		
		y = (x == 1) ? "There is one 1 cookie in the jar" : "There are" + x +" cookies in the jar";
		
		return y;
		
	}

	public void caseFour() {
	
		int x = 5, y = 10;
		int min, max, absVal;
		
		min = (x > y) ? y : x;
		max = (x > y) ? x : y;
		
		absVal = max - min;
		
	}
	
	
	
}
