/**
 * 
 */
package edu.wlu.cs.ajeem2026;

/**
 * AudioBook class that inherits the MediaItem class
 * 
 * @author Abid Jeem
 */
public class AudioBook extends MediaItem {

	private String author;
	private String narrator;

	/**
	 * Constructs an AudioBook with the specified title, availability, playing time,
	 * copyright year, author, and narrator.
	 * 
	 * @param title        Title of the AudioBook
	 * @param present      Tells if AudioBook is present
	 * @param playing_time Duration of AudioBook in minutes
	 * @param cr_year      Copyright year of Album
	 * 
	 * @param author       Author of the AudioBook
	 * @param narrator     Narrator of the AudioBook
	 */

	public AudioBook(String title, boolean present, int playing_time, int cr_year, String author, String narrator) {
		super(title, present, playing_time, cr_year);
		// TODO Auto-generated constructor stub
		this.author = author;
		this.narrator = narrator;
	}

	/**
	 * Overloaded constructor
	 * 
	 * @param title        Title of the AudioBook
	 * @param playing_time Duration of AudioBook in minutes
	 * @param cr_year      Copyright year of Album
	 * 
	 * @param author       Author of the AudioBook
	 * @param narrator     Narrator of the AudioBook
	 */

	public AudioBook(String title, int playing_time, int cr_year, String author, String narrator) {
		super(title, playing_time, cr_year);
		// TODO Auto-generated constructor stub
		this.author = author;
		this.narrator = narrator;
	}

	/**
	 * Getter method for the name of the author
	 * 
	 * @return the name of the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Getter method for the name of the narrator
	 * 
	 * @return the name of the narrator
	 */
	public String getNarrator() {
		return narrator;
	}

	/**
	 * String representation of each audio book
	 * 
	 * @return string representation of an audio book
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		return "AudioBook Details:-\n Author: " + author + ", Narrator: " + narrator + ", In-Stock: " + isPresent()
				+ ", Title: " + getTitle() + ", Playing Time (HH:MM): " + getPlaying_time_hours() + ", Copyright Year: "
				+ getCopyRight_year();
	}

}
