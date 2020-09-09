package udemyJavaMasterclassLinkedList.Challenge;

import java.util.ArrayList;
import java.util.LinkedList;

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
		return this.songs.add(new Song(title, duration));
	}	
	
	public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
		Song checkedSong = this.songs.findSong(trackNumber);
		if(checkedSong != null) {
			playlist.add(checkedSong);
			return true;
		}
		
		System.out.println("This album does not have a track: " + trackNumber);
		return false;
	}
	
	public boolean addToPlaylist(String title, LinkedList<Song> playlist) {
		Song song = songs.findSong(title);
		if(song != null) {
			playlist.add(song);
			return true;
		}
		System.out.println("This album does not have a track with title: " + title);
		return false;
	}
	
	private class SongList {
		private ArrayList<Song> songs;
		
		public SongList() {
			this.songs = new ArrayList<Song>();
		}
		
		private boolean addSong(Song song) {
			if(songs.contains(song)) {
				return false;
			}
			this.songs.add(song);
			return true;
		}
		
		
		private Song findSong(String title) {
			for(Song song : this.songs) {
				if(song.getTitle().equalsIgnoreCase(title)){
					return song;
				}
			}
			return null;
		}
		
		public Song findSong(int trackNumber) {
			int index = trackNumber - 1;
			if(index > 0 && index <= songs.size()) {
				return songs.get(index);
			}
			return null;
		}
	}
}
