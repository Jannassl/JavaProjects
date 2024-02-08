package system;
import model.Book;
import model.LibraryMember;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Library {
    private List<Book> books;
    private List<LibraryMember> members;
    private HashMap<Integer,String> reserved;
    public Library(){
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        this.reserved = new HashMap<>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void addMembers(LibraryMember member){
        members.add(member);
    }
    public void borrowBook(LibraryMember member, Book book){
        books.add(book);
    }
    public void returnBook(LibraryMember member, Book book) {
        books.remove(book);
    }
    public void reserveBook(LibraryMember member, Book book){
        reserved.put(member.getMemberId(), book.getTitle());
    }
    public void cancelReservation(LibraryMember member){
        reserved.remove(member.getMemberId());
    }
    public void displayReserved(LibraryMember member){
        String reservedBook = reserved.get(member.getMemberId());
        System.out.println("Lainatut kirjat: "+ reservedBook);
    }
}

