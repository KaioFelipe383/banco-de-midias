package bancoDeMidias.application;
import java.util.InputMismatchException;
import java.util.Scanner;

import bancoDeMidias.model.entities.Book;
import bancoDeMidias.model.entities.Music;
import bancoDeMidias.model.entities.Podcast;
import bancoDeMidias.model.exceptions.MidiaNaoEncontradaException;
import bancoDeMidias.service.BancoDeMidias;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BancoDeMidias mid = new BancoDeMidias();
		
		int escolha;
		do{
			//Menu
			System.out.println("=== BANCO DE MIDIAS ===");
			System.out.println("1. Add media");
			System.out.println("2. List All");
			System.out.println("3. Search by title");
			System.out.println("4. Mark as read");
			System.out.println("5. Mark as unread");
			System.out.println("0. Exit");
			escolha = sc.nextInt();
			sc.nextLine();
			System.out.println();
			switch(escolha) {
			
			case 1:
				try {
				//add media
				System.out.println("Which type of media do you want to add?");
				System.out.println("1. Book");
				System.out.println("2. Music");
				System.out.println("3. Podcast");
				int option = sc.nextInt();
				sc.nextLine();
				System.out.println();
				switch(option){
				//second menu for add medias
				case 1:
					
					System.out.println("Title: ");
					String title = sc.nextLine();
					System.out.println("Author: ");
					String author = sc.nextLine();
					System.out.println("Year: ");
					int year = sc.nextInt();
					sc.nextLine();
					System.out.println("Number of pages: ");
					int numberOfPages = sc.nextInt();
					System.out.println();
					Book livroObj = new Book(title, author, year, numberOfPages);
					mid.add(livroObj);
					break;
				case 2:
					System.out.println("Title: ");
					String titleOfMusic = sc.nextLine();
					System.out.println("Author: ");
					String authorOfMusic = sc.nextLine();
					System.out.println("Year: ");
					int yearOfMusic = sc.nextInt();
					sc.nextLine();
					System.out.println("Song duration: ");
					int duration = sc.nextInt();
					System.out.println();
					Music musicObj = new Music(titleOfMusic, authorOfMusic, yearOfMusic, duration);
					mid.add(musicObj);
					break;
				case 3:
					System.out.println("Title: ");
					String titleOfPodcast = sc.nextLine();
					System.out.println("Author: ");
					String authorOfPodcast = sc.nextLine();
					System.out.println("Year: ");
					int yearOfPodcast = sc.nextInt();
					sc.nextLine();
					System.out.println("Podcast duration: ");
					int duratioOfPodcast = sc.nextInt();
					sc.nextLine();
					System.out.println("Theme: ");
					String theme = sc.nextLine();
					System.out.println();
					Podcast podcastObj = new Podcast(titleOfPodcast, authorOfPodcast, yearOfPodcast, duratioOfPodcast, theme);
					mid.add(podcastObj);
					break;
				default:
					System.out.println("Invalid option! Try again.");
					break;
					//Finished the second menu
				}
				}
				catch(InputMismatchException e) {
					System.out.println("Error: expected a number, but received invalid input");
					 sc.nextLine();
				}
				break;
			
			case 2:
				//List all the media
				try {
				mid.listAll();
				}
				catch(MidiaNaoEncontradaException e) {
					System.out.println("Error: " + e.getMessage());
				}
				System.out.println();
				
				break;
			case 3:
				//Search media for the title
				System.out.println("Enter the title: ");
				String searchTitle = sc.nextLine();
				try{
				mid.searchByTitle(searchTitle);
				}
				catch(MidiaNaoEncontradaException e) {
					System.out.println("Error: " + e.getMessage());
				}
				System.out.println();
				
				break;
			case 4:
				//Mark as read
				System.out.println("Enter the title: ");
				String searchTitle_1 = sc.nextLine();
				try {
				mid.markAsRead(searchTitle_1);
				}
				catch(MidiaNaoEncontradaException e){
					System.out.println("Error: " + e.getMessage());
				}
				System.out.println();
				break;
			case 5:
				//Mark as unread
				System.out.println("Enter the title: ");
				String searchBytitle = sc.nextLine();
				try{
				mid.markAsUnread(searchBytitle);
				}
				catch(MidiaNaoEncontradaException e) {
					System.out.println("Error: " + e.getMessage());
				}
				System.out.println();
				break;
			case 0:
				//Exit
				System.out.println("GoodBye!!");
				break;
			default:
				System.out.println("Invalid option! Try again.");
				break;
				
			}
		}while(escolha != 0);
		sc.close();
	}
}
