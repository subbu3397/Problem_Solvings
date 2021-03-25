package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckPairWithGivenSumExistInArray {

	//T.C : O(n) and S.C:O(n)
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
		System.out.println("Pair Exists "+pairExists(arr,n,sum));
	}

}
