import model.Book;
import model.LibraryMember;
import system.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        LibraryMember libraryMember1 = new LibraryMember("Matti",1);
        Book book1 = new Book("Aku ankka", "Pekka Haavisto", "123");
        Book book2 = new Book("Ronja Ryövärin tytär", "Stubb", "321");

        library.addBook(book1);
        library.addBook(book2);
        library.addMembers(libraryMember1);

        library.borrowBook(libraryMember1,book1);

        library.returnBook(libraryMember1,book1);
        library.reserveBook(libraryMember1, book2);
        library.displayReserved(libraryMember1);
        library.cancelReservation(libraryMember1);
        library.displayReserved(libraryMember1);


    }
}
