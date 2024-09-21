package com.ian.uniqueemailvalidator;


import java.util.Scanner;
import java.util.Set;      //using this as an interface for the hashset implementation
import java.util.HashSet;  //using this to prevent duplication of element




/*
 * This class is for the data, this promotes encapsulation
 */

class Email 
{    
    private String email;
    
    
    //constructor for this class
    public Email(String email) {
        this.email = email;
    }
    
    
    //getters and setters
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    
    //override the default toString() method
    @Override
    public String toString() {
        return getEmail();
    }
    
    
    
    //override the hashCode() method
    @Override
    public int hashCode() {
        return email.hashCode();
    }
    
    
    
    //override the equals() method
    @Override
    public boolean equals(Object obj) {
        
        if(this == obj) {
            return true;
        }
        
        if(obj == null || getClass() != obj.getClass()) {
            return false;
        }
        
        Email other = (Email) obj;
        
        return email.equals(other.email);
    }
      
}




/*
 * This class is the logic of the features of the system
 */

class EmailFunction
{
    private Set<Email> set = new HashSet<Email>();  //this is 
    
    
    
    //this method is for adding the email logic 
    public void addingEmail(String email) {
        
        Email mail = new Email(email); //create an email object then add the value to the constructor
        set.add(mail); //add mail object to the set
    }
    
    
    
    //this method is for checking email logic
    public void checkingEmail(String email) {
        
        //traverse the set to check if there is existing email
        for(Email copy : set) {
            if(copy.getEmail().equals(email)) {  //compare two strings
                System.out.println("Email exist!");
                return;
            }         
        }
        
        System.out.println("Email doesn't exist");
                     
    }
    
    
    
    //this method is for removing email logic
    public void removingEmail(String email) {
        
        //traverse the set to check if the email exist
        for(Email copy : set) {
            if(copy.getEmail().equals(email)) {  //compare two strings
                set.remove(copy);
                System.out.println("Email has been removed successfully!");
                return;             
            }              
        }
        
        System.out.println("Email doesn't exist");
        
    }
    
    
    
    //this method is for checking if the hashtable is empty
    public void checkHashTable() {    
        
        if(set.isEmpty()) {
            System.out.println("No email inside the storage");
            return;
        }
        
    }
    
    
    
    //this method is logic for viewing all available emails
    public void viewingAllEmail() {  
        
        //this loop is traversing all inside the set
        for(Email copy : set) {
            System.out.println(copy);  //display the toString();
        }
    }
    
    
    
    //this method is logic for removing all email in the hashtable
    public void removingAllEmail() {
        
        for(Email copy : set) {
            set.remove(copy);  //remove every copy of email in the hashtable
        }
    }
    
    
    
}




/*  
 * This class is the features of the system
 */

class EmailServices
{
    private Scanner scanner = new Scanner(System.in);
    private EmailFunction function = new EmailFunction();
    
    
    
    //this method is for adding the email 
    public void addEmail() {
        
        System.out.print("Enter email: ");
        String addMail = scanner.nextLine();
        
        function.addingEmail(addMail);  //use the logic method
        
        System.out.println("Email added successfully!");      
        
    }
    
    
    
    //this method is for checking email if it exist in the hash table
    public void checkEmail() {
        
        function.checkHashTable(); //logic for checking if there is avaialble email in the hashtable
        
        System.out.print("Enter email to check: ");
        String checkMail = scanner.nextLine();
        
        function.checkingEmail(checkMail);  //use the logic method
        
    }
    
    
    
    //this method is removing existing email
    public void removeEmail() {
        
        function.checkHashTable();  //this method check if there is any email in the hashtable
        
        System.out.print("Enter email to remove: ");
        String removeMail = scanner.nextLine();
        
        function.removingEmail(removeMail);  //logic for removing email
              
    }
    
    
    
    //this method is for viewing all emails
    public void viewAllEmail() {
        
        function.checkHashTable();  //logic for checking if there is avaialable email in the hashtable 
        function.viewingAllEmail();  //logic for viewing all available email
        
        System.out.println("Thats all!");
        System.out.println("");
        
    }
    
    
    
    //this method is for removing all emails in the hashtable
    public void removeAllEmail() {
        
        function.removingAllEmail();  //logic for removing all emails
        
        System.out.println("All emails has been removed successfully!");
        
    }
     
}




//main class 
public class UniqueEmailValidator 
{
    public static void main(String[] args) 
    {      
        Scanner scanner = new Scanner(System.in);
        EmailServices emailServices = new EmailServices();
        
        boolean isMainConditionRunning = true;
        
        
        while(isMainConditionRunning) {
            System.out.println("");
            System.out.println("[1] Add email");
            System.out.println("[2] Check email");
            System.out.println("[3] Remove email");
            System.out.println("[4] View all emails");
            System.out.println("[5] Remove all emails");
            System.out.println("[6] Exit");
            System.out.println("");
            
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  //consume the newline
            
            System.out.println("");
            
            
            switch(choice) {
                case 1:
                    emailServices.addEmail();
                    break;
                    
                case 2:
                    emailServices.checkEmail();
                    break;
                    
                case 3:
                    emailServices.removeEmail();
                    break;
                    
                case 4: 
                    emailServices.viewAllEmail();
                    break;
                    
                case 5:
                    emailServices.removeAllEmail();
                    break;
                    
                case 6:
                    isMainConditionRunning = false;
                    break;
                    
                default:
                    System.out.println("Invalid choices, try again!");
                    System.out.println("");
                    
                    break;
            }                  
        }
        
        
        scanner.close();
        
    }
}
