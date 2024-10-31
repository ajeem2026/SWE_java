/**
 * 
 */
package edu.wlu.cs.ajeem2026.collections;

import edu.wlu.cs.ajeem2026.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.wlu.cs.ajeem2026.MediaItem;

/**
 * Driver class for my library which is home to 3 different types of Media
 * Items: Albums, Movies and AudioBooks Here, items are sorted based on
 * availability status. You can use accessor and mutator methods to modify
 * availability as my items are stored in array-based implementation of list
 * 
 * @author Abid Jeem
 */
public class Driver {
	
	/**
	 * This main function creates two instances of each item, stores instances in an
	 * array, and prints out initial status of library. After exercising the
	 * accessor and mutator methods to check-in and check-out, it prints out the
	 * changed status of library and also sorts everything based on the order of
	 * availability.
	 */

	public static void main(String[] args) {

		// List implementation of my library

		List<MediaItem> library = new ArrayList<>();

		library.add(new Album("After Hours", false, 80, 2012, "Weekend", 12));
		library.add(new Album("Nemesis", true, 55, 2025, "Zohan", 12));

		library.add(new Movie("Tenet", true, 120, 2012, "PG-13", 20));
		library.add(new Movie("Planet of the Apes", true, 120, 2012, "NC-17", 200));

		library.add(new AudioBook("1984", true, 1000, 1974, "George Orwell", "Abid Jeem"));
		library.add(new AudioBook("Kafka on the Shore", false, 1500, 2012, "Haruka Murakami", "Abid Jeem"));

		System.out.println("============== 📚 Welcome to Abid's Library! 📚 ==============");
		System.out.println("...where books, movies, and albums come alive (but thankfully don't walk around)!");
		System.out.println(
				"Pull up a virtual chair, grab a cup of imaginary coffee, and let's dive into the world of words and wonders!");
		System.out.println("===================================================================================\n");

		// Print initial status of Library
		for (MediaItem item : library) {
			System.out.println(item);
		}

		System.out.println("============== 📚 Thanks for checking-in & checking-out! 📚 ==============\n");

		// Exercising the accessor and mutator methods of MediaItem objects
		library.get(0).setPresent(true);
		library.get(1).setPresent(false);

		library.get(2).setPresent(false);
		library.get(3).setPresent(false);

		library.get(4).setPresent(false);
		library.get(5).setPresent(true);

		// Print final status of Library
		for (MediaItem item : library) {
			System.out.println(item);
		}

		System.out.println("============== 📚 Let's sort things out based on what's in stock! 📚 ==============\n");

		// Sort and display the elements in the array
		Collections.sort(library);
		for (MediaItem item : library) {
			System.out.println(item);
		}

	}
}
