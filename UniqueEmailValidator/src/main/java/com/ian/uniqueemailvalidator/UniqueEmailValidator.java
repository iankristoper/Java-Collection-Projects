package com.ian.uniqueemailvalidator;


import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;




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
    
    
    //method overriding
               
}




/*
 * This class is the logic of the features of the system
 */

class EmailFunction
{
    private Set<Email> set = new HashSet<Email>();
    
    
    
    //this method is for adding the email logic 
    public void addingEmail(String email) {
        Email mail = new Email(email); //create an email object then add the value to the constructor
        set.add(mail); //add mail object to the set
    }
    
    
    //this method is for checking email logic
    public void checkingEmail(String email) {
        //traverse the set to check if there is existing email
        for(Email copy : set) {
            if(copy.getEmail() == email) {
                System.out.println("Email exist!");
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
    
    
    
}




/*  
 * This class is the features of the system
 */

class EmailServices
{
    private Scanner scanner = new Scanner(System.in);
    EmailFunction function = new EmailFunction();
    
    
    //this method is for adding the email 
    public void addEmail() {
        System.out.print("Enter email: ");
        String addMail = scanner.nextLine();
        
        function.addingEmail(addMail);  //use the logic method
        
        System.out.println("Email added successfully!");      
        
    }
    
    
    //this method is for checking email if it exist in the hash table
    public void checkEmail() {
        System.out.print("Enter email to check: ");
        String checkMail = scanner.nextLine();
        
        function.checkingEmail(checkMail);  //use the logic method
        
    }
    
    
    //this method is removing existing email
    public void removeEmail() {
        function.checkHashTable();  //this method check if there is any email in the hashtable
        
        System.out.print("Enter email to remove: ");
        String removeMail = scanner.nextLine();
        
        =================================================================================================
    }
    
    
    
    
}




//main class 
public class UniqueEmailValidator 
{
    public static void main(String[] args) 
    {      
        Scanner scanner = new Scanner(System.in);
        boolean isMainConditionRunning = true;
        
        
        while(isMainConditionRunning) {
            System.out.println("");
            System.out.println("[1] Add email");
            System.out.println("[2] Check email");
            System.out.println("[3] Remove email");
            System.out.println("[4] View all emails");
            System.out.println("[5] Remove all emails");
            System.out.println("");
            
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  //consume the newline
            
            
            switch(choice) {
                case 1:
                    break;
                    
                case 2:
                    break;
                    
                case 3:
                    break;
                    
                case 4: 
                    break;
                    
                case 5:
                    break;
                    
                case 6:
                    isMainConditionRunning = false;
                    break;
            }
            
            
        }
            
        
        
    }
}
