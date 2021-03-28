package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CheckPairWithGivenSumExistInArray {

	// T.C : O(n) and S.C:O(n)
	public static boolean pairExists(int arr[], int n, int sum) {
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int arrEle = sum - arr[i];
			if (al.contains(arrEle)) {
				return true;
			} else {
				al.add(arr[i]);
			}
		}
		return false;
	}

	public static boolean pairExistsUsingBinarySearch(int arr[], int n, int sum) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			int eleToSearch = sum - arr[i];
			int start = i + 1, end = arr.length - 1;
			while (start <= end) {
				int mid = (start + end) / 2;
				if (eleToSearch == arr[mid])
					return true;
				else if (eleToSearch < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return false;
	}

	public static int binarySearch(int arr[], int start, int end, int elementToSearch) {

		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == elementToSearch) {
				return mid;
			} else if (elementToSearch < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Please enter array elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Please enter sum value");
		int sum = sc.nextInt();
		System.out.println("Pair Exists " + pairExistsUsingBinarySearch(arr, n, sum));
	}

}
