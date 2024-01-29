import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private double rating;

    private ArrayList<String> reviews;

    public Book(String title, String author, int publicationYear){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.rating = 0.0;
        this.reviews = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    void addReview(String review){
        reviews.add(review);
    }
    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }
    public int getReviews(){
        int qty = reviews.toArray().length;
        return qty;
    }
}
