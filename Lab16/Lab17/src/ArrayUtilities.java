
public class ArrayUtilities {

	public static void main(String[] args) {
		int[] ans = primeGenerator(7);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}

	}
	
	public static void blueToRed(String[] a) {
		for (int i=0; i<a.length;i++) {
			if(a[i].equals("blue")) {
				a[i]="red";
			}
		}
	}
	
	public static int[] intArrayFactory(int n) {
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
		}
		return arr;
	}
	
	public static double[] duplicator(double[] a) {
		double[] ans = new double[a.length*2];
		for(int i=0;i<a.length;i++) {
			ans[i]=a[i];
			ans[i+a.length]=a[i];
		}
		return ans;
	}
	
	public static int[] sevenRemover(int[] a) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==7) {
				count++;
			}
		}
		int[] ans = new int[a.length-count];
		for(int i=0, j=0;i<a.length;i++) {
			if(a[i]!=7) {
				ans[j]=a[i];
				j++;
			}
		}
		return ans;
	}
	
	public static int[] primeGenerator(int count) {
		int[] ans = new int[count];
		for(int i=0;i<ans.length;i++) {
			ans[i]=-1;
		}
		int flag=0, i=0;
		while(ans[count-1]==-1) {
			for(int n=2;n>1;n++) {
				flag=0;
				for(int f=2;f<n;f++) {
					if(n%f==0) {
						flag=1;
						break;
					}
				}
				if(flag==0) {
					ans[i]=n;
					i++;
				}
				if(i==count) {
					break;
				}
			}
		}
		return ans;
	}

}
