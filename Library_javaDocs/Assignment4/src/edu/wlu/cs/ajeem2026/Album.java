/**
 * 
 */
package edu.wlu.cs.ajeem2026;

/**
 * This is the Album class which inherits MediaItem class
 * 
 * @author Abid Jeem
 */
public class Album extends MediaItem {

	private String artist;
	private int num_track;

	/**
	 * Constructs an Album with the specified title, availability, playing time,
	 * copyright year, artist, and number of tracks.
	 * 
	 * @param title        Title of the Album
	 * @param present      Tells if Album is present
	 * @param playing_time Duration of Album in minutes
	 * @param cr_year      Copyright year of Album
	 * 
	 * @param artist       Name of artist
	 * @param num_track    Keep count of tracks
	 */
	public Album(String title, boolean present, int playing_time, int cr_year, String artist, int num_track) {
		super(title, present, playing_time, cr_year);

		this.artist = artist;
		this.num_track = num_track;

	}

	/**
	 * Overloaded constructor
	 * 
	 * @param title        Title of the Album
	 * @param playing_time Duration of Album in minutes
	 * @param cr_year      Copyright year of Album
	 * 
	 * @param artist       Name of artist
	 * @param num_track    Keep count of tracks
	 */
	public Album(String title, int playing_time, int cr_year, String artist, int num_track) {
		super(title, playing_time, cr_year);

		this.artist = artist;
		this.num_track = num_track;
	}

	/**
	 * Getter method for Artist's name
	 * 
	 * @return the artist's name
	 */
	public String getArtist() {
		return artist;
	}

	/**
	 * Getter method for the number of tracks in Album
	 * 
	 * @return number of tracks in Album
	 */
	public int getNum_track() {
		return num_track;
	}

	/**
	 * String representation of Album by overriding the default Media Item
	 * toString() method
	 * 
	 * @return String representation of Album
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Album Details:-\n Artist: " + artist + ", Number of Tracks: " + num_track + ", In-Stock: " + isPresent()
				+ ", Title: " + getTitle() + ", Playing Time (HH:MM): " + getPlaying_time_hours() + ", Copyright Year: "
				+ getCopyRight_year();
	}

}
