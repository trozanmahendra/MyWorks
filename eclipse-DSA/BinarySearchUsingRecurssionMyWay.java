// package test;

public class BinarySearchUsingRecurssionMyWay {
	int start;
	int end;
	int mid;

	static int binarySearching(int[] arr, int start, int end, int x) {
		if (start > end)
			return -1;
		int mid = (start + end) / 2;
		if (arr[mid] == x)
			return mid;
		else if (x > arr[mid]) {
//			start = mid;
			return binarySearching(arr, mid + 1, end, x);

		} else {
//			end = mid;
			return binarySearching(arr, start, mid - 1, x);
		}

	}

	public static void main(String[] args) {
//		
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 56, 67, 78, 89, 89, 99 };
		System.out.println(binarySearching(arr, 0, arr.length - 1, 9));
		System.out.println();
	}
}
