import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private Map<User, ArrayList<Book>> borrowedBooks;
    public Library() {
        this.books = new ArrayList<>();
        this.borrowedBooks = new HashMap<>();
    }
    public void addUser(User user) {
        borrowedBooks.put(user, new ArrayList<>());
    }
    public void addBook(Book book){
        books.add(book);
    }
    void displayBooks(){
        System.out.println("Library catalog: ");
        int i = 1;
        for(Book book : books){
            System.out.println(i+". "+ " Title: "+ book.getTitle()+", Author: "+book.getAuthor()+", Year: "+ book.getPublicationYear());
            i ++;
        }
    }
    public void findBooksByAuthor(String author){
        System.out.println("");
        System.out.println("Books by Author"+ author+": ");
        for(Book book:books){
            if(book.getAuthor() == author){
                System.out.println("Title: "+ book.getTitle()+ ", Year: "+ book.getPublicationYear());
            }
        }
    }
    public void borrowBook(User user, Book book) {
        if (books.contains(book)) {
            borrowedBooks.get(user).add(book);
            books.remove(book);
            System.out.println(user.getName() + " borrowed book: " + book.getTitle());
        } else {
            System.out.println("Book not available for borrowing: " + book.getTitle());
        }
    }
    public void returnBook(User user, Book book) {
        if (borrowedBooks.get(user).contains(book)) {
            borrowedBooks.get(user).remove(book);
            books.add(book);
            System.out.println(user.getName() + " returned book: " + book.getTitle());
        } else {
            System.out.println("This book was not borrowed by " + user.getName());
        }
    }
    public double getAverageBookRating(){
        double sum = 0;
        for(Book book : books){
            sum += book.getRating();
        }
        double avg = sum / books.toArray().length;
        return avg;
    }
    public String getMostViewedBook() {
        if (books.isEmpty()) {
            return "No books available";
        }

        Book mostReviewedBook = books.get(0); // Initialize with the first book
        for (Book book : books) {
            if (book.getReviews() > mostReviewedBook.getReviews()) {
                mostReviewedBook = book;
            }
        }
        return mostReviewedBook.getTitle();
    }

}
