# DSA_Questions
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i = 0;i<n;i++){
				arr[i] = sc.nextInt();
			}			
			int result = binarySearch(arr,1);			
				System.out.println(result + 1);
			t--;
		}		
		// System.out.println(binarySearch(arr) + 1);
	}
	private static int binarySearch(int arr[], int x) {
		int l = 0;
		int h = arr.length -1;
        int firstValue = -1;
		
		while(l<=h) {
            int mid = l + (h-l)/2;
			// System.out.println("middle value is " + mid);
			if(arr[mid]>=x) {
				firstValue = mid;
                l = mid + 1;
			}
			// else if(arr[mid]>x) {
			// 	l = mid +1;
			// }
			else {
				h = mid -1;
			}
		}
		return firstValue;
	}
}
