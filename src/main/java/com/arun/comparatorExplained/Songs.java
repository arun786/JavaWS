package com.arun.comparatorExplained;

public class Songs implements Comparable<Songs>{

	private String title;
	private String artist;
	private String rating;
	private String bpm;

	public Songs(String title, String artist, String rating, String bpm) {
		super();
		this.title = title;
		this.artist = artist;
		this.rating = rating;
		this.bpm = bpm;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public String getRating() {
		return rating;
	}

	public String getBpm() {
		return bpm;
	}

	@Override
	public String toString() {
		return "Songs [title=" + title + ", artist=" + artist + ", rating=" + rating + ", bpm=" + bpm + "]";
	}

	@Override
	public int compareTo(Songs o) {
		return this.artist.compareTo(o.artist);
	}

}
