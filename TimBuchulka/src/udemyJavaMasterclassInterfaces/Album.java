package udemyJavaMasterclassInterfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
	private String name;
	private String artist;
	private ArrayList<Song> songs;
	
	public Album(String name, String artist) {
		this.name = name;
		this.artist = artist;
		this.songs = new ArrayList<Song>();
	}
	
	public boolean addSong(String title, double duration) {
		if(findSong(title) == null) {
			this.songs.add(new Song(title, duration));
			return true;
		}
		return false;
	}	
	
	private Song findSong(String title) {
		for(Song song : this.songs) {
			if(song.getTitle().equalsIgnoreCase(title)){
				return song;
			}
		}
		return null;
	}
	
	public boolean addToPlaylist(int trackNumber, List<Song> playlist) {
		int index = trackNumber - 1;
		if(index >= 0 && index <= this.songs.size()) {
			playlist.add(this.songs.get(index));
			return true;
		}
		System.out.println("This album does not have a track: " + trackNumber);
		return false;
	}
	
	public boolean addToPlaylist(String title, List<Song> playlist) {
		Song song = findSong(title);
		if(song != null) {
			playlist.add(song);
			return true;
		}
		System.out.println("This album does not have a track with title: " + title);
		return false;
	}
}
