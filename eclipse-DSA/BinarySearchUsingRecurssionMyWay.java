package test;

public class BinarySearchUsingRecurssionMyWay {
	int start;
	int end;
	int mid;

	static int binarySearching(int[] arr, int start, int end, int x) {
		int mid = (start + end) / 2;
		if (start == end)
			return -1;
		else if (arr[mid] == x)
			return mid;
		else if (arr[mid] > x) {
			end = mid;
			return binarySearching(arr, start, end - 1, x);
		} else {
			start = mid;
			return binarySearching(arr, start + 1, end, x);
		}

	}

	public static void main(String[] args) {
//		
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 56, 67, 78, 89, 89, 99 };
		System.out.println(binarySearching(arr, 0, arr.length - 1, 9));
		System.out.println();
	}
}
