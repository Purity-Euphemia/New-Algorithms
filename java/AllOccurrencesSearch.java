import java.util.ArrayList;

public class AllOccurrencesSearch {
	public static ArrayList<Integer> findAllOccurrence(int[] arr, int target) {
		ArrayList<Integer> indices = new ArrayList<>();

		for (int count = 0; count < arr.length; count++) {
			if (arr[count] == target) {
				indices.add(count);
			}
		}
			return indices;
	}

	public static void main(String[] args) {
		int[] arr = {4, 2, 7, 4, 9, 4};
		int target = 4;

		ArrayList<Integer> result = findAllOccurrence(arr, target);

		if (result.isEmpty()) {
			System.out.println("Target not found");

		}else {
			System.out.print("Found at indices: ");
			for (int index : result) {
				System.out.print(index + " ");
			}
		}

	}
}