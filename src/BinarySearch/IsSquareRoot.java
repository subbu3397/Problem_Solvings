package BinarySearch;

public class IsSquareRoot {

	public static boolean isSquareRoot(int num) {

		int squareRootLimit = num / 2;
		return isSquareRootUsingBinarySearch(num, squareRootLimit);
	}

	public static boolean isSquareRootUsingBinarySearch(int num, int squareRootLimit) {
		int start = 1;
		while (start <= squareRootLimit) {
			int mid = (start + squareRootLimit) / 2;

			if (mid * mid == num)
				return true;
			else if ((mid * mid) < num) {
				start = mid + 1;
			} else
				squareRootLimit = mid - 1;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("Is Square Root"+isSquareRoot(25));
	}

}
