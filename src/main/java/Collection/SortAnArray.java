package Collection;

public class SortAnArray {

	public static void main(String[] args) {

		int[] array = createAnArray();
		displayAnArray(array);
		array = sortAnArray(array,"ascending");
		displayAnArray(array);
		
		array = sortAnArray(array, "descending");
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

	public static void displayAnArray(int[] array) {

		for (int a : array) {
			System.out.print(a + " : ");
		}
		System.out.println();
	}

	/**
	 * 
	 * @param array
	 * 
	 *            Selection sort, minimum value is found in each loop and
	 *            swapped.
	 */
	public static int[] sortAnArray(int[] array, String order) {

		for (int i = 0; i < array.length; i++) {
			int minimum = array[i];
			int minPosition = i;
			for (int j = i + 1; j < array.length; j++) {

				if (order.equalsIgnoreCase("ascending")) {
					if (minimum > array[j]) {
						minimum = array[j];
						minPosition = j;
					}
				} else {
					if (minimum < array[j]) {
						minimum = array[j];
						minPosition = j;
					}
				}
			}
			array = swapAnArray(array, i, minPosition);
		}

		return array;
	}

	public static int[] swapAnArray(int[] array, int originalPosition, int minimumValuePosition) {
		int temp = array[originalPosition];
		array[originalPosition] = array[minimumValuePosition];
		array[minimumValuePosition] = temp;
		return array;
	}
}
