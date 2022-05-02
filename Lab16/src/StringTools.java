import java.util.Scanner;
public class StringTools {
	
	public static void main(String Args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String1: ");
		String s1 = sc.nextLine();
		System.out.println(linkExtractor(s1));
		sc.close();
	}
	
	public static int count(String a, char c) {
		int count=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==c) {
				count++;
			}
		}
		return count;
	}
	
	public static int countSubString(String a, String b) {
		int count=0;
		while(true) {
			if(a.indexOf(b)!=-1) {
				count++;
				if(a.indexOf(b)+1>a.length()-1) {
					break;
				} else {
					a=a.substring(a.indexOf(b)+1);
				}
			} else {
				break;
			}
		}
		return count;
	}
	
	public static String reverse(String a) {
		String b ="";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
		return b;
	}
	
	public static String expand(String a) {
		String b = "";
		for(int i=0;i<a.length();i++) {
			for(int j=0; j<=i;j++) {
				b = b+a.charAt(i);
			}
		}
		return b;
	}
	
	public static String alternating(String a, String b) {
		String c = "";
		int i;
		for(i=0; i<a.length(); i++) {
			if(i<=b.length()-1) {
				c = c+a.charAt(i)+b.charAt(i);
			} else {
				return (c+a.substring(i)); 
			}
		}
		if(!(i>=b.length())) {
			return (c+b.substring(i));
		} else {
			return c;
		}
	}
	
	public static String linkExtractor(String a) {
		String c="";
		while(true) {
			if(a.indexOf("href")!=-1) {
				c="href";
				if((a.substring(a.indexOf("href")+4)).indexOf("href")!=-1) {
					a=a.substring(a.indexOf("href")+4);
					continue;
				}
				if((a.substring(a.indexOf("href")+4)).indexOf("=")!=-1) {
					if((a.substring(a.indexOf("=")+1)).indexOf("href")!=-1) {
						a=a.substring(a.indexOf("=")+1);
						continue;
					}
					for(int i=a.indexOf("href")+4; 
							i<a.indexOf("=");
							i++) {
						c=c+a.charAt(i);
						if(a.charAt(i)!=' ') {
							return null;
						}
					}
					c=c+"=";
					if((a.substring(a.indexOf("=")+1)).indexOf("\"")!=-1) {
						if((a.substring(a.indexOf("\"")+1)).indexOf("href")!=-1) 
						{
							a=a.substring(a.indexOf("\"")+1);
							continue;
						}
						for(int i=a.indexOf("=")+1; 
								i<a.indexOf("\"");
								i++) {
							c=c+a.charAt(i);
							if(a.charAt(i)!=' ') {
								return null;
							}
						}
						c=c+"\"";
						if((a.substring(a.indexOf("\"")+1)).indexOf("\"")!=-1){
							for(int i=a.indexOf("\"")+1; 
									i<((a.substring(a.indexOf("\"")+1)).
									indexOf("\"")+a.indexOf("\"")+1);i++) {
								c = c+a.charAt(i);
							}
							c=c+"\"";
							return c;
						} else {
							return null;
						}
					} else {
						return null;
					}
				} else {
					return null;
				}
			} else {
				return null;
			}
			
		}
	}
}
