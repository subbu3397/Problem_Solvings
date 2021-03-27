package BinarySearch;

public class CountOccurenceOfElement {

	public static int occurenceOfElement(int arr[], int ele) {

		int firstOccurence = firstOccurenceOfElement(arr, ele);
		int lastOccurence = lastOccurenceOfElement(arr, ele);
		return lastOccurence-firstOccurence+1;
	}

	public static int firstOccurenceOfElement(int arr[], int ele) {
		int start = 0, end = arr.length - 1, ans = 0;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == ele && (mid==0 || arr[mid-1]<ele)) {
				return mid;
			} else if (ele < arr[mid]) {
				end = mid-1;
			}
			else
			{
				start = mid+1;
			}
		}
		return 0;
	}
	
	public static int lastOccurenceOfElement(int arr[], int ele) {
		int start = 0, end = arr.length - 1, ans = 0;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == ele && (mid==arr.length-1 || arr[mid+1]>ele)) {
				return mid;
			} else if (ele < arr[mid]) {
				end = mid-1;
			}
			else
			{
				start = mid+1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 2, 4, 4, 5, 6, 6 };
		int ele = 2;
		System.out.println(occurenceOfElement(arr, ele));
	}

}
