/**
 * 
 */
package DequeExplained;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 * @author Adwiti
 *
 */
public class DequeExplained {

	/*
	 * Deque interface is a double ended queue. Which means you can add and
	 * retrieve and insert data from tail as well as head
	 */
	public static void main(String[] args) {

		Deque<String> dqS = new ArrayDeque<>();
		dqS.add("Element 1 using add, it adds at the tail");
		System.out.println(dqS);
		dqS.addFirst("Element 2 using add first at the head");
		System.out.println(dqS);
		dqS.addLast("Element 3 using add Last at tail");
		System.out.println(dqS);
		dqS.push("Element 4 using Push at head");
		System.out.println(dqS);
		dqS.offer("Element 5 using offer at tail");
		System.out.println(dqS);
		dqS.offerFirst("Element 6 using offer first at head");
		System.out.println(dqS);
		dqS.offerLast("Element 7 using offer last at tail");
		System.out.println(dqS);

		System.out.println("Iterating deque from back");

		Iterator<String> dIter = dqS.descendingIterator();
		while (dIter.hasNext()) {
			System.out.println(dIter.next());
		}

		System.out.println("Iterating deque from head");
		Iterator<String> aIter = dqS.iterator();
		while (aIter.hasNext()) {
			System.out.println(aIter.next());
		}

		System.out.println("--------using peek, retrived head without deleting---------------");
		System.out.println(dqS.peek());
		System.out.println(dqS);
		System.out.println("----------using pop retieves data fron the head and deletes-------------");
		System.out.println(dqS.pop());

		System.out.println(dqS);

		System.out.println("---------------using poll first, removes element from head--------");
		System.out.println(dqS.pollFirst());
		System.out.println(dqS);

		System.out.println("-------using poll last. removes the element from tail-----");
		System.out.println(dqS.pollLast());
		System.out.println(dqS);

	}
}

/*
 * o/p will be
 * 
 * [Element 1 using add, it adds at the tail]
 * 
 * [Element 2 using add first at the head, Element 1 using add, it adds at the
 * tail]
 * 
 * [Element 2 using add first at the head, Element 1 using add, it adds at the
 * tail, Element 3 using add Last at tail]
 * 
 * [Element 4 using Push at head, Element 2 using add first at the head, Element
 * 1 using add, it adds at the tail, Element 3 using add Last at tail]
 * 
 * [Element 4 using Push at head, Element 2 using add first at the head, Element
 * 1 using add, it adds at the tail, Element 3 using add Last at tail, Element 5
 * using offer at tail]
 * 
 * [Element 6 using offer first at head, Element 4 using Push at head, Element 2
 * using add first at the head, Element 1 using add, it adds at the tail,
 * Element 3 using add Last at tail, Element 5 using offer at tail]
 * 
 * [Element 6 using offer first at head, Element 4 using Push at head, Element 2
 * using add first at the head, Element 1 using add, it adds at the tail,
 * Element 3 using add Last at tail, Element 5 using offer at tail, Element 7
 * using offer last at tail] Iterating deque from back
 * 
 * Element 7 using offer last at tail
 * 
 * Element 5 using offer at tail
 * 
 * Element 3 using add Last at tail
 * 
 * Element 1 using add, it adds at the tail
 * 
 * Element 2 using add first at the head
 * 
 * Element 4 using Push at head
 * 
 * Element 6 using offer first at head
 * 
 * Iterating deque from head
 * 
 * Element 6 using offer first at head
 * 
 * Element 4 using Push at head
 * 
 * Element 2 using add first at the head
 * 
 * Element 1 using add, it adds at the tail
 * 
 * Element 3 using add Last at tail
 * 
 * Element 5 using offer at tail
 * 
 * Element 7 using offer last at tail
 * 
 * --------using peek, retrived head without deleting---------------
 * 
 * Element 6 using offer first at head
 * 
 * 
 * [Element 6 using offer first at head, Element 4 using Push at head, Element 2
 * using add first at the head, Element 1 using add, it adds at the tail,
 * Element 3 using add Last at tail, Element 5 using offer at tail, Element 7
 * using offer last at tail]
 * 
 * ----------using pop retieves data fron the head and deletes-------------
 * 
 * Element 6 using offer first at head
 * 
 * [Element 4 using Push at head, Element 2 using add first at the head, Element
 * 1 using add, it adds at the tail, Element 3 using add Last at tail, Element 5
 * using offer at tail, Element 7 using offer last at tail]
 * 
 * ---------------using poll first, removes element from head--------
 * 
 * Element 4 using Push at head [Element 2 using add first at the head, Element
 * 1 using add, it adds at the tail, Element 3 using add Last at tail, Element 5
 * using offer at tail, Element 7 using offer last at tail] -------using poll
 * last. removes the element from tail----- Element 7 using offer last at tail
 * 
 * [Element 2 using add first at the head, Element 1 using add, it adds at the
 * tail, Element 3 using add Last at tail, Element 5 using offer at tail]
 */