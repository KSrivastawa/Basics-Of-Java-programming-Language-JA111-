package com.Q2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		PlayList pl = new PlayList();
		
		int i=1;
		while(true) {
			
			System.out.println("Enter the song details "+i+" :");
			
			System.out.println("Enter the movie name:");
			String movieName = sc.next();
			
			System.out.println("Enter the song name:");
			String songName = sc.next();
			
			
			pl.addSong(new Song(movieName, songName));
			
			if(pl.songs.size()==4) {
				break;
			}
			
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
			
		
	}

}







