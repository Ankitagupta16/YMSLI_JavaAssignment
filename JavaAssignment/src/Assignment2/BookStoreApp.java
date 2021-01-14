package Assignment2;

import java.util.*;

public class BookStoreApp {
public static void main(String[] args) {
		
		Book b1 = new Book("The Coalition Years","Pranab Mukherjee","1001",4);
		Book b2 = new Book("Two Lives","Vikram Seth","1002",2);
		Book b3 = new Book("Wings of Fire","APJ Abdul Kalam","1003",9);
		
		Vector<Book> books = new Vector<Book>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		
		BookStore store = new BookStore(books);
		
		Scanner sc = new Scanner(System.in);
		int choice = -1;
		String option = null;
		System.out.println("Menu");
		do {
			System.out.println("Enter “1”, to display the Books: Title – Author – ISBN - Quantity.");
			System.out.println("Enter “2”, to order new books");
			System.out.println("Enter “3”, to sell books");
			System.out.println("Enter “0”, to exit the system");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1: store.display(); break;
			case 2: {
				String anotherOrder  = null;
				do {
					String isbn = null;
					int copies = 0;
					System.out.println("Enter book isbn");
					isbn = sc.next();
					System.out.println("Enter number of copies");
					copies = sc.nextInt();
					store.order(isbn, copies);
					System.out.println("Do you want to order another book? (yes/no)");
					anotherOrder  = sc.next();
				   }  while(anotherOrder=="YES"||anotherOrder=="yes"||anotherOrder=="Yes");
				break;
			}	
			case 3:{String anotherOrder  = null;
					do {
						String bookTitle = null;
						int copies = 0;
						System.out.println("Enter book Title");
						bookTitle = sc.next();
						System.out.println("Enter number of copies");
						copies = sc.nextInt();
						store.sell(bookTitle, copies);
						System.out.println("Do you want to sell another book? (yes/no)");
						anotherOrder  = sc.next();
					}while(anotherOrder.equals("YES")||anotherOrder.equals("yes")||anotherOrder.equals("Yes"));
					break;
					}
			
			case 0 : System.exit(0) ;
			
			default: System.out.println("Invalid input!!!!");
			}
			
			System.out.println("Wnat to continue ? (Yes/No)");
			option = sc.next();
		}while(option.equals("YES")||option.equals("yes"));
		sc.close();
		
	}
}
