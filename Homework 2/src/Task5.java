
public class Task5 {
	public static void main(String[] args) {
		int[] arr1 = new int[]{1, 1, 3, 7, 7, 8, 9, 9, 9, 10};
		int current = arr1[0];
		boolean isDouble = false;

		for (int i = 0; i < arr1.length; i++) {
		    if (current == arr1[i] && !isDouble) {
		        isDouble = true;
		    } else if (current != arr1[i]) {
		        System.out.print(" " + current);
		        current = arr1[i];
		        isDouble = false;
		    }
		}
		System.out.print(" " + current);
	}
}
