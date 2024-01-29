public class LibraryMain {
    public static void main(String[] args) {
        Book book1 = new Book("Aku-Ankka","Matti Meikäläinen", 2010);
        Book book2 = new Book("Taru sormusten herrasta", "J.R.R. Tolkien", 2001);
        Book book3 = new Book("Fifty shades of grey", "E.L. James",2011);
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);


        book1.setRating(4.0);
        book2.setRating(3.5);
        book3.setRating(2.0);

        book1.addReview("Mahtava");
        book1.addReview("Loistava");
        book2.addReview("Kohtalainen");
        book3.addReview("Loistava");
        //book3.addReview("Pelottava");
        //book3.addReview("Liian hyvä!!");
        library.displayBooks();
        System.out.printf("Review average: %6.2f\n",library.getAverageBookRating());

        System.out.println(library.getMostViewedBook());


    }
}
