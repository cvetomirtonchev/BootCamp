
public class Task4 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 5, 4, 78, 7, 4, 5, 6, 2, 4 };
		int[] arr2 = { 1, 5, 3, 78, 74, 84, 5, 6, 2, 44 };
		printDoubles(arr1, arr2);

	}

	public static void printDoubles(int[] array1, int[] array2) {
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					System.out.print(array1[i] + " ");
					break;
				}
			}
		}

	}

}
