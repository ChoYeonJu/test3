
public class Sort {
	
	public static void main(String[] args) {
		
		int[] a = {33,245,423,34,56,47,53,23};
		
		int b;
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0;j < a.length -i -1;j++) {
				if(a[j] > a[j+1]) {
					b = a[j];
					a[j] = a[j+1];
					a[j+1] = b;
				}
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}