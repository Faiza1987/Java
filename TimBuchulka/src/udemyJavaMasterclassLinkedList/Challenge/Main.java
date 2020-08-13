package udemyJavaMasterclassLinkedList.Challenge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	private static ArrayList<Album> albums = new ArrayList<>();
	
	public static void main(String[] args) {

		Album album = new Album("Stormbringer", "Deep Purple");
		album.addSong("Stormbringer", 4.16);
		album.addSong("Love don't mean a thing", 4.22);
		album.addSong("Holy Man", 5.6);
		album.addSong("Hold on", 4.3);
		album.addSong("Lady double dealer", 3.23);
		album.addSong("You can't do it right", 6.23);
		album.addSong("High ball shooter", 4.27);
		album.addSong("They gypsy", 4.2);
		album.addSong("Soldier of Fortune", 3.13);
		albums.add(album);
		
		Album album2 = new Album("For Those About To Rock", "AC/DC");
		album2.addSong("For Those About To Rock", 5.44);
		album2.addSong("I put the finger on you", 3.25);
		album2.addSong("Let's go", 3.45);
		album2.addSong("Inject the venom", 3.33);
		album2.addSong("Lady double dealer", 3.23);
		album2.addSong("Snowballed", 6.23);
		album2.addSong("Evil walks", 4.27);
		album2.addSong("C.O.D", 4.2);
		album2.addSong("Breaking the rules", 3.13);
		album2.addSong("Right of the long knives", 3.13);
		albums.add(album2);
		
		LinkedList<Song> playlist = new LinkedList<>();
		albums.get(0).addToPlaylist("You can't do it right", playlist);
		albums.get(0).addToPlaylist("Holy Man", playlist);
		albums.get(0).addToPlaylist("Speed King", playlist); // Does not exist
		albums.get(0).addToPlaylist(9, playlist);
		
		albums.get(1).addToPlaylist(8, playlist);
		albums.get(1).addToPlaylist(3, playlist);
		albums.get(1).addToPlaylist(2, playlist);
		albums.get(1).addToPlaylist(24, playlist); // There is no track 24
		
		play(playlist);
	}
	
	private static void play(LinkedList<Song> playlist) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;
		
		ListIterator<Song> listIterator = playlist.listIterator();
		if(playlist.size() == 0) {
			System.out.println("No songs in playlist");
			return;
		} else {
			System.out.println("Now playing " + listIterator.next().toString());
			printMenu();
		}
		
		while(!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();
			
			switch(action) {
				case 0:
					System.out.println("Playlist complete");
					quit = true;
					break;
				case 1:
					if(!forward) {
						if(listIterator.hasNext()) {
							listIterator.next();
						}
						forward = true;
					}
					if(listIterator.hasNext()) {
						System.out.println("Now playing " + listIterator.next().toString());
					} else {
						System.out.println("You have reached the end of the playlist.");
						forward = false;
					}
					break;
				case 2:
					if(forward) {
						if(listIterator.hasPrevious()) {
							listIterator.previous();
						}
						forward = false;
					}
					if(listIterator.hasPrevious()) {
						System.out.println("Now playing " + listIterator.previous().toString());
					} else {
						System.out.println("You are at the start of the playlist");
						forward = true;
					}
					break;
				case 3: 
					if(forward) {
						if(listIterator.hasPrevious()) {
							System.out.println("Now re-playing " + listIterator.previous().toString());
							forward = false;
						} else {
							System.out.println("We are the the start of the list.");
						}
					} else {
						if(listIterator.hasNext()) {
							System.out.println("Now playing " + listIterator.next().toString());
							forward = true;
						} else {
							System.out.println("We have reached the end of the list.");
						}
					}
					break;
				case 4: printList(playlist); break;
				case 5: printMenu(); break;
				case 6:
					if(playlist.size() > 0) {
						listIterator.remove();
						
						if(listIterator.hasNext()) {
							System.out.println("Now playling " + listIterator.next());
						} else if(listIterator.hasPrevious()) {
							System.out.println("Now re-playing " + listIterator.previous());
						}
					}
					break;
			}
		}
	}
	
	private static void printMenu() {
		System.out.println("Available actions:\npress");
		System.out.println("0 - to quit\n"
				+ "1 - to play next song\n"
				+ "2 - to play previous song\n"
				+ "3 - to replay the current song\n"
				+ "4 - list songs in the playlist\n"
				+ "5 - print available actions\n"
				+ "6 - delete current song from playlist");
	} 
	
	private static void printList(LinkedList<Song> playlist) {
		Iterator<Song> iterator = playlist.iterator();
		System.out.println("============================");
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
		System.out.println("============================");
	}
	
	

}
