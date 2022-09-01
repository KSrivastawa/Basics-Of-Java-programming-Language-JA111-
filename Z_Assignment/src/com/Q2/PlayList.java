package com.Q2;

import java.util.ArrayList;
import java.util.List;


public class PlayList {

	List<Song> songs = new ArrayList<>();
	
	public void addSong(Song song) {
		
		//song already exist in list
		if(songs.contains(song)) {
			System.out.println("Song already exist");
		}
		else {
			System.out.println("Song added to the playlist successfully.\n");
			this.songs.add(song);
		}
		
	}
	
	public static void main(String[] args) {
		

		 

		PlayList p=new PlayList();
		
		p.addSong(new Song("m1","s1"));
		p.addSong(new Song("m1","s2"));
		p.addSong(new Song("m1","s1"));
		
	
		
		
		
	}
}
