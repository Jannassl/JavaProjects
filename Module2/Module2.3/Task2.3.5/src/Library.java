import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

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
    void borrowBook(String title){
        for(Book book: books){
            if(book.getTitle()==title){
                System.out.println("Borrowed book: "+ title);
                borrowedBooks.add(book);
                books.remove(book);
            }
        }
    }
    void returnBook(){
        for(Book book :borrowedBooks){
            books.add(book);
            borrowedBooks.remove(book);
        }
    }
    boolean isBookAvailable(String title){
        boolean status = true;
        for(Book book : borrowedBooks){
            if(book.getTitle() == title){
                status = false;
            }
        }
        System.out.println(status);
        return status;
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
