// package test;

public class BinarySearchMyWay {
	public static int binarySearch(int[] arr, int x) {
		// Your code goes here
		int start = 0;
		int end = arr.length - 1;
		int mid = (start + end) / 2;
		System.out.println("begin");
		int i=0;
		while(mid>0) {
			System.out.println(start);
			System.out.println(mid);
			System.out.println(end);
			if(arr[start] == x ) {
				return start;
			}
			if(arr[end] == x) {
				return end;
			}
			if(arr[mid] == x) {
				return mid;
			}else {
				if(arr[mid] < x) {
					System.out.println("inside1");
					start = mid + 1;
					mid = (start + end)/2;
					if(mid >arr.length-1)
						return -1;
				}
				if(arr[mid] > x) {
					System.out.println("inside2------");
					end = mid;
					mid = (start + end)/2;
				}
			}
			System.out.println("-----------------");
			System.out.println(start);
			System.out.println(mid);
			System.out.println(end);
			
			if(mid <=0 || start >arr.length-1 || end <0)
				break;
			
			
			
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int x = 7;
		int ans = binarySearch(arr, x);
		System.out.println("***************************************");
		System.out.println(ans);
	}
}
