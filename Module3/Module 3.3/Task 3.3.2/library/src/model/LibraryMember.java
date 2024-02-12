package model;
import java.util.ArrayList;
import java.util.List;


public class LibraryMember {
    private String name;
    private int memberId;
    private List<String> borrowedBooks;

    public LibraryMember(String name, int memberId){
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }
    /*public void borrowBook(String title){
        borrowedBooks.add(title);
        System.out.println("Kirja lainattu: "+title);
    }
    public void returnBook(String title){
        borrowedBooks.remove(title);
        System.out.println("Kirja palautettu: "+title);
    }*/
}
