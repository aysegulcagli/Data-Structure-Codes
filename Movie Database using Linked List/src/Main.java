import java.util.Scanner;

public class Main {
	static int movieId = 1;
	static Scanner scanner = new Scanner(System.in);
	static LinkedList movieList = new LinkedList();

	public static void main(String[] args) {
	
		addInitialData(movieList);
	
		int i;
		while (true) { 
			printMainMenu();
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a choice");
			i = input.nextInt();

			if (i == 1) {
				addMovie();
			} else if (i == 2) {
				deleteMovie();
			} else if (i == 3) {
				printMovielist();
			}

			if (i == 4)
				exit();
		}
	}
	      
	public static void addMovie() {
		
		System.out.println("Movie Name: ");
		String movieName = scanner.nextLine();

		System.out.println("Director: ");
		String director = scanner.nextLine();

		System.out.println("Category: ");
		String category = scanner.nextLine();

		System.out.println("IMDB: ");
		String imdb = scanner.nextLine();
		double imdbPoint = Double.parseDouble(imdb.replaceAll(",", "."));
																			
		
			
				Movie newMovie = new Movie(movieId, movieName, director, category, imdbPoint);

			 Node newNode = new Node(newMovie);
				
				movieList.alphabeticalInsert(newNode);
				
				movieId++;
		 
		
																						
		

	}

	public static void deleteMovie() {
		System.out.println("Movie name to be deleted: ");
		String movieName = scanner.nextLine();
		movieList.deleteNode(movieName);

	}

	public static void printMovielist() {
		movieList.printLinkedList();

	}

	public static void exit() {
		System.exit(0);
	}

	public static void printMainMenu() {
		System.out.println("Main Menu");
		System.out.println("1- Add Movie");
		System.out.println("2- Remove Movie");
		System.out.println("3- List Movies");
		System.out.println("4- Exit");
	}

	public static void addInitialData(LinkedList movieList) {
		
		Movie movie = new Movie(0, "The Godfather", "Francis Ford Coppola", "Drama", 9.2);
		Movie movie2 = new Movie(1, "Leon: The Professional", "Thierry Arbogast", "Drama", 8.5);
		Movie movie3 = new Movie(2, "The Pianist", "Thierry Roman Polanski", "Drama", 8.5);
		Movie movie4 = new Movie(3, "Back To The Future", "Robert Zemeckis", "Science Fiction", 8.5);
		Movie movie5 = new Movie(4, "Star Wars", "George Lucas", "Science Fiction", 8.6);
		Movie movie6 = new Movie(5, "hababam sınıfı", "George Lucas", "Science Fiction", 8.6);

		Node node1 = new Node(movie);
		Node node2 = new Node(movie2);
		Node node3 = new Node(movie3);
		Node node4 = new Node(movie4);
		Node node5 = new Node(movie5);
		Node node6 = new Node(movie6);

		movieList.alphabeticalInsert(node1);
		movieList.alphabeticalInsert(node2);
		movieList.alphabeticalInsert(node3);
		movieList.alphabeticalInsert(node4);
		movieList.alphabeticalInsert(node5);
		movieList.alphabeticalInsert(node6);
	}
}