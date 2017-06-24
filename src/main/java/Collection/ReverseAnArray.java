package Collection;

public class ReverseAnArray {

	public static void main(String[] args) {
		int[] array = createAnArray();
		displayAnArray(array);
		array = reverseAnArray(array);
		displayAnArray(array);
	}

	/**
	 * 
	 * @return
	 * 
	 * 		It will create an array of size 10
	 */
	public static int[] createAnArray() {

		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
		}

		return array;
	}

	/**
	 * 
	 * @param array
	 * @return
	 * 
	 * 		it will reverse the array
	 */
	public static int[] reverseAnArray(int[] array) {
		int temporary[] = new int[array.length];
		for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
			temporary[j] = array[i];
		}
		return temporary;
	}

	public static void displayAnArray(int[] array) {

		for (int a : array) {
			System.out.print(a + " : ");
		}
		System.out.println();
	}
}
