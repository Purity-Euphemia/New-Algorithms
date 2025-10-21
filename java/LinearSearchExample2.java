public class LinearSearchExample2 {
	public static int linearSearch(int[] arr, int target) {
		for (int count = 0; count < arr.length; count++) {
			if (arr[count] == target) {
				return count;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {};
		int target = 4;
		int result = linearSearch(arr, target);

		if (result != -1) {
			System.out.println("The target found index: " + result);
		} else {
			System.out.println("The target not found");
		}
	}
}