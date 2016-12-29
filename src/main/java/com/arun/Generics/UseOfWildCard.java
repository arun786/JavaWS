package com.arun.Generics;

import java.util.ArrayList;
import java.util.List;

public class UseOfWildCard {

	public static void main(String[] args) {

		List<Animal> lst = new ArrayList<>();
		List<Rat> lst1 = new ArrayList<>();

		/*
		 * lst = lst1; //This won't work.
		 */

		List<? extends Animal> lst2 = new ArrayList<>();
		lst2 = lst;

		/* lst = lst2; This will not work */

		/* ? extends E */
		/* We can get data out of it but cannot put data into it */

		List<Integer> lst3 = new ArrayList<>();
		lst3.add(10);
		lst3.add(20);

		List<? extends Number> lst4 = new ArrayList<>();
		lst4 = lst3; // this is allowed.

		/*
		 * lst4.add(30); //This is not allowed
		 */ }

}

class Animal {

}

class Rat extends Animal {

}

class Cat extends Animal {

}
