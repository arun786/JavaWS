package Collection;

public class ArrayConcept {

	public static void main(String[] args) {

		String arrays[] = getArray();
		for (String array : arrays) {
			System.out.println(array);
		}
		
		/*o/p will be as belows
		
		Sachin
		Rahul
		Sourav
		null
		null*/
	}

	/**
	 * 
	 * @return
	 * 
	 * 		1. Array size is fixed
	 * 
	 *         2. It normally contains homogeneous objects
	 * 
	 *         3. Standard data structure is not there.
	 */
	public static String[] getArray() {
		String[] name = new String[5];
		name[0] = "Sachin";
		name[1] = "Rahul";
		name[2] = "Sourav";

		return name;
	}

}
