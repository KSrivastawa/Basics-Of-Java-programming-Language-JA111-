package com.Q2;

import java.util.Objects;

public class Song {

	private String movieName;
	private String songName;
	
	public Song() {
		// TODO Auto-generated constructor stub
	}

	public Song(String movieName, String songName) {
		super();
		this.movieName = movieName;
		this.songName = songName;
	}

	
	public final String getMovieName() {
		return movieName;
	}

	public final void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public final String getSongName() {
		return songName;
	}

	public final void setSongName(String songName) {
		this.songName = songName;
	}
	
	public void play() {
		System.out.println(songName+" of "+movieName+" is playing...!\n");
	}

	
	@Override
	public int hashCode() {
		Song s = this;
		return Objects.hash(s.getSongName(), s.getMovieName());
	}

	@Override
	public boolean equals(Object obj) {
		Song s = this;
		Song other = (Song)obj;
		
		if(s.movieName.equalsIgnoreCase(other.movieName) && s.songName.equalsIgnoreCase(other.songName) ){
			return true;
		}
		
		return false;
	}
	

	
	
}
