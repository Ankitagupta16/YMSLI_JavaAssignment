package day1and2;

import java.util.*;

public class BookStore {
	private Vector<Book> books = new Vector<Book>(); 

	public void sell(String bookTitle, int noOfCopies) {
		boolean flag = false;
		for (int i = 0; i < 10; i++) {
			if (books.get(i).getBook().equals(bookTitle)) {
				if (books.get(i).getNumOfCopies() > 0) {
					books.get(i).setNumOfCopies(books.get(i).getNumOfCopies() - 1);
					flag = true;
					break;
				} else
					break;
			}
		}
		if (flag == false)
			System.out.println("Book not found...");
	}

	public void order(String isbn, int noOfCopies) {
		for (int i = 0; i < 10; i++) {
			if (books.get(i).getISBN().equals(isbn)) {
				books.get(i).setNumOfCopies(books.get(i).getNumOfCopies() + noOfCopies);
				System.out.println("Number Of Copies added to the Book");
				break;
			}
			else {
				System.out.println("Book not found...");
				addBook(isbn,noOfCopies);
				
			}
		}
		
	}
	

	public void addBook(String isbn, int noOfCopies) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book Title: ");
		String bookTitle = sc.next();
		System.out.println("Enter Book Author: ");
		String bookAuthor = sc.next();
		Book newBook = new Book(bookTitle,bookAuthor,isbn,noOfCopies);
		books.add(newBook);
		System.out.println("Book is added");
	}

	public void display() {
		for (int i = 0; i < 10; i++) {
			books.get(i).display();
		}
	}
}
