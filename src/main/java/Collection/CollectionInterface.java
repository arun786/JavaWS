/**
 * 
 */
package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Adwiti
 *
 */
public class CollectionInterface {

	public static void main(String[] args) {
		Collection<String> list = new ArrayList<>();

		// add method of Collection Interface
		list.add("A");

		Collection<String> lst1 = new ArrayList<>();
		lst1 = Arrays.asList("B", "C", "D", "E");

		// addAll method of Collection Interface
		list.addAll(lst1);

		// size method of Collection Interface
		System.out.println("Size of the Collection Object : " + list.size());

		// isEmpty of Collection Interface
		System.out.println("Is Empty : " + list.isEmpty());

		// clear of Collection Interface
		list.clear();

		// isEmpty of Collection Interface
		System.out.println("Is Empty : " + list.isEmpty());

		// addAll method of collection Interface
		list.addAll(lst1);

		// containsAll of Collection Interface
		System.out.println(list.containsAll(lst1));

		// contains of Collection Interface
		System.out.println(list.contains("B"));

		// remove of Collection Interface, will return boolean if the object is
		// removed
		System.out.println(list.remove("B"));

		System.out.println(list);

		// removeAll of collection Interface, will return boolean of the Object
		// is removed
		System.out.println(list.removeAll(lst1));

		// this will return false as the list is empty
		System.out.println(list.removeAll(lst1));

		list.addAll(lst1);

		list.add("A");

		// it will contain A,B,C,D,E
		System.out.println(list);

		// retainAll will return boolean, it will retain all the elements of
		// lst1 and remove other elements
		list.retainAll(lst1);

		// o/p will be B,C,D,E
		System.out.println(list);

		// iterator method of Collection Interface
		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
