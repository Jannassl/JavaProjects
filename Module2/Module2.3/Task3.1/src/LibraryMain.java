public class LibraryMain {
    public static void main(String[] args) {
        Book book1 = new Book("Aku-Ankka","Matti Meikäläinen", 2010);
        Book book2 = new Book("Taru sormusten herrasta", "J.R.R. Tolkien", 2001);
        Book book3 = new Book("Fifty shades of grey", "E.L. James",2011);
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();

        library.findBooksByAuthor("Matti Meikäläinen");
    }
}
