package day1and2;

public class BookStore {
	Book[] books = new Book[10];

	public void sell(String bookTitle, int noOfCopies) {
		boolean flag = false;
		for (int i = 0; i < 10; i++) {
			if (books[i].getBook().equals(bookTitle)) {
				if (books[i].getNumOfCopies() > 0) {
					books[i].setNumOfCopies(books[i].getNumOfCopies() - 1);
					flag = true;
					break;
				} else
					break;
			}
		}
		if (flag == false)
			System.out.println("Book not found...");
	}

	public void order(String isbn, int nofOfCopies) {
		for (int i = 0; i < 10; i++) {
			if (books[i].getISBN().equals(isbn)) {
				books[i].setNumOfCopies(books[i].getNumOfCopies() + nofOfCopies);
				break;
			}
			else {
				//add new book;
			}
		}
		
	}

	public void display() {
		for (int i = 0; i < 10; i++) {
			books[i].display();
		}
	}
}
