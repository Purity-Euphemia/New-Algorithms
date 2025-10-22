public class CountOccurrences {
	public static int countOccurrences(int[] arr, int target) {
		int count = 0;
	for (int counter = 0; counter < arr.length; counter++) {
		if (arr[counter] == target) {
			count++;
}

} 
		return count;		

}

	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 4, 4, 3};

		int target = 4;

		int result = countOccurrences(arr, target);

		if (result == 0) {
			System.out.println("Target not found");

		}else {
			System.out.print("Target appears " + result + " time(s) ");
		}
			
		
	}

}