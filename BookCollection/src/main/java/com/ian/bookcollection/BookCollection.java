package com.ian.bookcollection;


//from the util package
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;



//this class is for hiding the data or what we call encapsulation
class Book
{
    private int bookID;
    private String bookName;
    private String bookAuthor;
    private float bookRating;
    
    //constructor for the private attributes
    public Book(int bookID, String bookName, String bookAuthor, float bookRating)
    {
        this.bookID = bookID;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookRating = bookRating;
    } 
    
    //public setters 
    public void setID(int bookID) {
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
    public int getID() {
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
    private static Scanner scanner = new Scanner(System.in);
    private static List<Book> bookStorage = new ArrayList<Book>();
    static int bookID = 1000;
    
    
    
    //this method is for adding the books
    public static void addBooks()
    {
        System.out.print("Enter book name: ");
        String bookName = scanner.nextLine();
        
        System.out.print("Enter book author: ");
        String bookAuthor = scanner.nextLine();
        
        System.out.print("Enter book ratings [1 - 10]: ");
        float bookRatings = scanner.nextFloat();
        
        ++bookID;
        System.out.println("Your book id is " + bookID);
        
        Book book = new Book(bookID, bookName, bookAuthor, bookRatings);  //create instance of the data class and intialize the data
        bookStorage.add(book);  //add the data from the instance to the book storage 
        
        System.out.println("");
        System.out.println("Book added successfully!");
    }
    
    
    
    //this method is use for removing books 
    public static void removeBooks()
    {
        if(bookStorage == null)
        {
            System.out.println("Book storage is empty!");
            return;
        }
        
        
        System.out.print("Enter the ID of the book to be remove: ");
        int removeID = scanner.nextInt();
        scanner.nextLine();
        
        for(Book copy : bookStorage)
        {
            if(copy.getID() == removeID)
            {
                bookStorage.remove(copy);
                System.out.println("Book removed successfully");
                return;
            }
        }
        
        System.out.println("Invalid ID, it doesn't match");
    }  
    
    
    
    //this method is for searching the books
    public static void searchBook()
    {
        if(bookStorage == null)
        {
            System.out.println("Book storage is empty!");
            return;
        }
        
        System.out.print("Enter ID of the book: ");
        int searchID = scanner.nextInt();
        scanner.nextLine();
        
        for(Book copy : bookStorage)
        {
            if(copy.getID() == searchID)
            {
                System.out.println(copy);
            }
        }     
        
        System.out.println("Invalid ID, it doesn't match");
    }
    
    
    
    //this method is for showing all books
    public static void showAllBooks()
    {
        if(bookStorage == null)
        {
            System.out.println("Book storage is empty");
            return;
        }
        
        
        for(Book copy : bookStorage)
        {
            System.out.println(copy);
            System.out.println("");
        }
        
        System.out.println("All books has been displayed!");
    }
    
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
            System.out.println("");
            System.out.println("[1] Add books");
            System.out.println("[2] Remove books");
            System.out.println("[3] Search books");
            System.out.println("[4] Show all books");
            System.out.println("[5] Exit");
            System.out.println("");
            
            System.out.print("Please select your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println("");
            
            switch(choice)
            {
                case 1:
                    BookFunction.addBooks();
                    break;
                    
                case 2:
                    BookFunction.removeBooks();
                    break;
                    
                case 3:
                    BookFunction.searchBook();
                    break;
                    
                case 4:
                    BookFunction.showAllBooks();
                    break;
                    
                case 5:
                    isMainProgramRunning = false;
                    break;
                    
                default:
                    System.out.println("Invalid choice, try again");
                    break;
                    
            }
        }
        
        
        scanner.close();
        
    }
}
