package com.ian.bookcollection;


//from the util package
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;



//this class is for hiding the data or what we call encapsulation
class Book
{
    private String bookID;
    private String bookName;
    private String bookAuthor;
    private float bookRating;
    
    //constructor for the private attributes
    public Book(String bookID, String bookName, String bookAuthor, float bookRating)
    {
        this.bookID = bookID;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookRating = bookRating;
    } 
    
    //public setters 
    public void setID(String bookID) {
        this.bookID = bookID;
    }
    
    public void setName(String bookName) {
        this.bookName = bookName;
    }
    
    public void setAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    
    public void setRating(float bookRating) {
        this.bookRating = bookRating;
    }
    
    
    //public getters
    public String getID() {
        return bookID;
    }
    
    public String getName() {
        return bookName;
    }
    
    public String getAuthor() {
        return bookAuthor;
    }
    
    public float getRating() {
        return bookRating;
    }
            
    
    //method overriding -> override the default toString() method
    @Override
    public String toString()
    {
        return "";
    }
    
}



//this class is for the functionality of the book collections
class BookFunction
{
    private Scanner scanner = new Scanner(System.in);
    private List<Book> bookStorage = new ArrayList<Book>();
    
    
}






public class BookCollection 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        boolean isMainProgramRunning = true;
        
        
        System.out.println("Welcome to ILibrary, the collections of ibooks");
        
        while(isMainProgramRunning)
        {
            System.out.println("[1] Add books");
            System.out.println("[2] ");
        }
        
    }
}
