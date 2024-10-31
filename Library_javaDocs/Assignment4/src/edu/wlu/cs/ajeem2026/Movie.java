/**
 * 
 */
package edu.wlu.cs.ajeem2026;

/**
 * Movie class that inherits the MediaItem class
 * 
 * @author Abid Jeem
 */
public class Movie extends MediaItem {

	private String rating;
	private int bonus_time;

	/**
	 * Constructs a Movie with the specified title, availability, playing time,
	 * copyright year, rating, and length of time for bonus feature.
	 * 
	 * @param title        Title of the Movie
	 * @param present      Tells if Movie is present
	 * @param playing_time Duration of Movie in minutes
	 * @param cr_year      Copyright year of Movie
	 * 
	 * @param rating       Rating of the movie
	 * @param bonus_time   Length of time for the bonus features in minutes
	 */

	public Movie(String title, boolean present, int playing_time, int cr_year, String rating, int bonus_time) {
		super(title, present, playing_time, cr_year);

		this.rating = rating;
		this.bonus_time = bonus_time;
	}

	/**
	 * Overloaded constructor 

	 * @param title        Title of the Movie
	 * @param playing_time Duration of Movie in minutes
	 * @param cr_year      Copyright year of Movie
	 * 
	 * @param rating       Rating of the movie
	 * @param bonus_time   Length of time for the bonus features in minutes
	 */

	public Movie(String title, int playing_time, int cr_year, String rating, int bonus_time) {
		super(title, playing_time, cr_year);

		this.rating = rating;
		this.bonus_time = bonus_time;
	}

	/**
	 * Getter method to get the rating of the Movie
	 * 
	 * @return the rating of the Movie
	 */
	public String getRating() {
		return rating;
	}

	/**
	 * Getter method to get the length of bonus time in minutes
	 * 
	 * @return the length of bonus time in minutes
	 */
	public int getBonus_time() {
		return bonus_time;
	}

	/**
	 * Getter method for the total playing time of movie including bonus time
	 * 
	 * @return the total playing time of movie in minutes
	 * @see edu.wlu.cs.ajeem2026.MediaItem#getPlaying_time()
	 */
	@Override
	public int getPlaying_time() {
		int total_play_time = (super.playing_time + bonus_time);
		return total_play_time;
	}

	/**
	 * Getter method for the total playing time of movie including bonus time in
	 * HH:MM format
	 * 
	 * @return the total playing time of movie in HH:MM format
	 * @see edu.wlu.cs.ajeem2026.MediaItem#getPlaying_time()
	 */

	@Override
	public String getPlaying_time_hours() {

		int playing_time = getPlaying_time();
		int hours = playing_time / 60;
		int minutes = playing_time % 60;
		return String.format("%d:%02d", hours, minutes);
	}

	/**
	 * String representation of Movie items
	 * 
	 * @return string representation of a Movie item
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Movie Details:-\n Rating: " + rating + ", Bonus Feature Time: " + bonus_time + ", In-Stock: "
				+ isPresent() + ", Title: " + getTitle() + ", Playing Time (HH:MM): " + getPlaying_time_hours()
				+ ", Copyright Year: " + getCopyRight_year();
	}

}
