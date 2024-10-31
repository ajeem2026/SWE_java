/**
 * 
 */
package edu.wlu.cs.ajeem2026;

/**
 * This is the abstract MediaItem class that all other Media Items inherit and
 * share common traits and functionality with
 * 
 * @author Abid Jeem
 */
public abstract class MediaItem implements Comparable<MediaItem> {

	private String title;
	private boolean present;
	protected int playing_time;
	private int cr_year;

	/**
	 * Constructor-1: Takes all fields as parameters
	 * 
	 * @param title        Title of the Media Item
	 * @param present      Tells if Media Item is present
	 * @param playing_time Duration of Media Item in minutes
	 * @param cr_year      Copyright year of Media Item
	 */

	public MediaItem(String title, boolean present, int playing_time, int cr_year) {
		super();
		this.title = title;
		this.present = present;
		this.playing_time = playing_time;
		this.cr_year = cr_year;
	}

	/**
	 * Constructor-2: Takes all parameters except the present parameter, meaning if
	 * the item is present, it defaults to true
	 * 
	 * @param title        Title of the Media Item
	 * @param playing_time Duration of Media Item in minutes
	 * @param cr_year      Copyright year of Media Item
	 */

	public MediaItem(String title, int playing_time, int cr_year) {
		this(title, true, playing_time, cr_year);
	}

	/**
	 * Getter method to get Title name
	 * 
	 * @return title of Media Item
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Checks if Media Item is present in collection
	 * 
	 * @return true if In-stock, false if Out-of-Stock
	 */
	public boolean isPresent() {
		return present;
	}

	/**
	 * Setter method for checking-in and out
	 * 
	 * @param present as True or False
	 */
	public void setPresent(boolean present) {
		this.present = present;
	}

	/**
	 * Getter method for playing time in minutes
	 * 
	 * @return playing time in minutes
	 */

	public int getPlaying_time() {
		return playing_time;
	}

	// Returns playing time as a String in Hours and minutes

	/**
	 * A conversion method from minutes to hours in HH:MM format
	 * 
	 * @return playing time as a String in Hours and Minutes (HH:MM)
	 */

	public String getPlaying_time_hours() {

		int hours = playing_time / 60;
		int minutes = playing_time % 60;
		return String.format("%d:%02d", hours, minutes);
	}

	/**
	 * Getter method for the copyright year of Media Item
	 * 
	 * @return the copyright year
	 */

	public int getCopyRight_year() {
		return cr_year;
	}

	/**
	 * Implementation of Compare Method based on availability As a library student
	 * staff, I would prefer to have my available items to be seen first before
	 * making executing any necessary actions on my library items, so I would have
	 * my items ordered from present--> not present
	 * 
	 * @param o the Media Item to compare against
	 * @return -1(available before unavailable), 0 (same presence status) or 1 (not
	 *         available) based on comparison analysis in terms of availability
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(MediaItem o) {
		return Boolean.compare(o.isPresent(), this.isPresent());
	}

	/**
	 * String Representation of Media Items
	 * 
	 * @return String representation of Media Items
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Media Item Details:-\n Title: " + title + ", In-Stock: " + present + ", Playing Time (HH:MM): "
				+ getPlaying_time_hours() + ", Copyright Year: " + cr_year;
	}

}
