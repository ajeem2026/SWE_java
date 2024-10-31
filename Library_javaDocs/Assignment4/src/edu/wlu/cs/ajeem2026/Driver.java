/**
 * 
 */
package edu.wlu.cs.ajeem2026;

import java.util.Arrays;

/**
 * Driver class for my library which is home to 3 different types of Media
 * Items: Albums, Movies and AudioBooks Here, items are sorted based on
 * availability status. You can use accessor and mutator methods to modify
 * availability as my items are stored in an array
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

		MediaItem album1 = new Album("After Hours", false, 80, 2012, "Weekend", 12);
		MediaItem album2 = new Album("Nemesis", true, 55, 2025, "Zohan", 12);

		MediaItem movie1 = new Movie("Tenet", true, 120, 2012, "PG-13", 20);
		MediaItem movie2 = new Movie("Planet of the Apes", true, 120, 2012, "NC-17", 200);

		MediaItem book1 = new AudioBook("1984", true, 1000, 1974, "George Orwell", "Abid Jeem");
		MediaItem book2 = new AudioBook("Kafka on the Shore", false, 1500, 2012, "Haruka Murakami", "Abid Jeem");

		MediaItem[] library = { album1, album2, movie1, movie2, book1, book2 };

		System.out.println("============== 📚 Welcome to Abid's Library! 📚 ==============");
		System.out.println("...where books, movies, and albums come alive (but thankfully don't walk around)!");
		System.out.println(
				"Pull up a virtual chair, grab a cup of imaginary coffee, and let's dive into the world of words and wonders!");
		System.out.println("===================================================================================\n");

		for (MediaItem item : library) {
			System.out.println(item);
		}

		System.out.println("============== 📚 Thanks for checking-in & checking-out! 📚 ==============\n");

		// Exercising the accessor and mutator methods of MediaItem objects
		album1.setPresent(true);
		album2.setPresent(false);

		movie1.setPresent(false);
		movie2.setPresent(false);

		book1.setPresent(false);
		book2.setPresent(true);

		// Print final status of Library
		for (MediaItem item : library) {
			System.out.println(item);
		}

		System.out.println("============== 📚 Let's sort things out based on what's in stock! 📚 ==============\n");

		// Sort and display the elements in the array
		Arrays.sort(library);
		for (MediaItem item : library) {
			System.out.println(item);
		}

	}
}
