package com.Q2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		//List<Song> songs = new ArrayList<>();
		
		Song song1=new Song("m1","s1");
		Song song2=new Song("m2","s2");
		Song song3=new Song("m1","s1");
		
		
		Set<Song> songList=new HashSet<>();
		
		songList.add(song1);
		songList.add(song2);
		songList.add(song3);
		
		System.out.println(song3==song1);//false
		System.out.println(song3.equals(song1));//true
		
		System.out.println(songList.size());// 2
		
		System.out.println(song1.hashCode());
		System.out.println(song3.hashCode());
		
		
		
/*		
		
		Scanner sc = new Scanner(System.in);

		PlayList pl = new PlayList();
		
		int i=1;
		while(i<=4) {
			
			System.out.println("Enter the song details of "+ i +":");
			
			System.out.println("Enter the movie name:");
			String movieName = sc.next();
			
			System.out.println("Enter the song name:");
			String songName = sc.next();
			
			
			pl.addSong(new Song(movieName, songName));
			
			i++;
		}
		
		
		int count = 1;
		for(int j=0; j<pl.songs.size(); j++) {
					
			System.out.println(count++ +" Song detail"+"\n------------");
			System.out.println("Song Name: "+pl.songs.get(j).getSongName());
			System.out.println("Movie Name: "+pl.songs.get(j).getMovieName());
				
			Song s = new Song(pl.songs.get(j).getMovieName(), pl.songs.get(j).getSongName());
			s.play();
		}
	*/		
		
	}

}







