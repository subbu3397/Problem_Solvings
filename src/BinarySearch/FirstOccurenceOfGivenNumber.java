package BinarySearch;

import java.util.Arrays;

public class FirstOccurenceOfGivenNumber {

	//T.C : O(log n) and S.C:O(1) - Assuming that Arrays are sorted
	//T.C: O(n log n) and S.C:O(1) - If arrays are not sorted.
	
	public static int findFirstOccureneOfN(int arr[],int n)
	{
		int start =0;
		int end = arr.length-1;
		Arrays.sort(arr);
		int ans = -1;
		while(start<=end)
		{
			int mid = (start+end)/2;
			if(arr[mid]==n && (mid==0 || arr[mid-1]<n))
				return mid;
			else if(arr[mid]<n)
				start = mid+1;
			else
				{
					ans = mid;
					end = mid -1;
				}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 4, 4, 6, 6, 7 };
		int n = 4;
		System.out.println(findFirstOccureneOfN(arr, n));
	}

}
