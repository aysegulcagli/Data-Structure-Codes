class LinkedList {
	Node head;

	void alphabeticalInsert(Node insertNode) {
		Node current;
		if (head != null && !searchMovie(insertNode.data.getMovieName())) {
			System.out.println("This movie already exits.");
			return;
		}
		if (head == null || head.data.getMovieName().toUpperCase()
				.compareTo(insertNode.data.getMovieName().toUpperCase()) >= 0) {
																				
			insertNode.next = head;
			head = insertNode;
		} else {
			current = head;
			while (current.next != null && current.next.data.getMovieName().toUpperCase()
					.compareTo(insertNode.data.getMovieName().toUpperCase()) < 0)
																					
				current = current.next;
			insertNode.next = current.next;
											
			current.next = insertNode;
			
		}

	}

	boolean searchMovie(String movieName) {
		Node temp = head; 
		while (temp != null) {
			if (temp.data.getMovieName().equalsIgnoreCase(movieName)) {
				return false;
			}
		
			temp = temp.next;
		}
		return true; 

	}

	void printLinkedList() {
		System.out.printf("%-3s %-30s %-45s %-30s %-8s", "Id", "Name", "Director", "Category", "IMDB");
																										
		System.out.println();
		Node temp = head;
		while (temp != null) {
			Movie movie = temp.data;
			System.out.printf("%-3s %-30s %-45s %-30s %-8s", movie.getMovieId(), movie.getMovieName(),
					movie.getMovieDirector(), movie.getMovieCategory(), movie.getMovieIMDBBrate());
			System.out.println();
			temp = temp.next;
		}

	}

	void deleteNode(String movieName) {
		Node temp = head, prev = null;

		if (temp != null && temp.data.getMovieName().equals(movieName)) {
			head = temp.next;
			return;
		}

		while (temp != null && !temp.data.getMovieName().equals(movieName)) {
			prev = temp;
			temp = temp.next;
		}

		if (temp == null) {
			System.out.println("This movie can't be deleted because it doesn't exist");
			return;
		}

		prev.next = temp.next;
	}

}