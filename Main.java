package Final_Project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner input = new Scanner(System.in);
        int choice = 0;
        Book book1 = new Book();
        book1.title= "Harry Potter";
        book1.numOfPages=500;
        book1.author="Rolling";

        Book book2 = new Book();
        book2.title= "Tom Soyer";
        book2.numOfPages=750;
        book2.author="Mark Twain";

        while (choice != 6){
            System.out.println ("Press 1 for adding a book ");
            System.out.println ("Press 2 for deleting a book ");
            System.out.println ("Press 3 for registering a new reader ");
            System.out.println ("Press 4 for removing a reader ");
            System.out.println ("Press 5 for searching books by author ");
            System.out.println ("Press 6 for exit ");
            choice= input.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Please add all new book data");
                    Book book3 = new Book();
                    book3.title= input.nextLine();
                    book3.numOfPages= input.nextInt();
                    book3.author= input.nextLine();
                    library.addNewBook(book3);
                    break;

                case 2:
                    System.out.println("Please add book title");
                    String bookTitle = input.nextLine();
                    library.deleteBook(bookTitle);
                    break;

                case 3:
                    System.out.println("Please add new reader name and ID");
                    String newName = input.nextLine();
                    String newID = input.nextLine();
                    library.registerReader(newName,newID);
                    break;

                case 4:
                    System.out.println("Please add name of reader to remove");
                    String newName1 = input.nextLine();
                    library.removeReader(newName1);
                    break;

                case 5:
                    System.out.println("Please add author name");
                    String authorName = input.nextLine();
                    library.serchByAuthor(authorName);
                    break;

                case 6:
                    break;

                default:
                    System.out.println("Wrong Number");







            }

        }

    }
}
