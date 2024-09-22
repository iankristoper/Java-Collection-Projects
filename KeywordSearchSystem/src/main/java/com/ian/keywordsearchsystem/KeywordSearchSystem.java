
package com.ian.keywordsearchsystem;


/*
 * Objective: Develop a system that manages a set of unique keywords used for a search engine. 
 * The goal is to store and retrieve keywords efficiently, ensuring that there are no duplicates and that keywords can be quickly added, checked, and removed.
*/




import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;








class KeywordData
{
    private String keywords;  //private attributes 
    
    
    //contructor for data initialization
    public KeywordData(String keywords) {  
        this.keywords = keywords;
    }
    
    
    //setters
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
    
    
    //getters
    public String getKeywords() {
        return keywords;
    }
    
    
    @Override
    public String toString() {
        return "Keywords: "+ getKeywords() + "\n";
    }
    
    
    
}





/*
 * This part is for the logic of the keyword search engine system
 */
class KeywordSearchLogic
{
    private Set<KeywordData> keywordStorage = new HashSet<>();
    
    
    //this method is logic for adding the String keyword to the hashset
    public void addKeywordLogic(String keyword) {
        
        KeywordData keywordObject = new KeywordData(keyword);  //create object and initialize the constructor
        keywordStorage.add(keywordObject);  //add the object to the keywordStorage
    }
    
    
    //this method is logic for checking if the keyword is existing or not
    public void checkKeywordLogic(String keyword) {
        
        if(keywordStorage.isEmpty()) {
            System.out.println("Keyword storage is empty!");
            return;
        }
        
        for(KeywordData copy : keywordStorage) {
            if(copy.getKeywords().equals(keyword)) {
                System.out.println("Keyword exist in hash table");
                return;
            }
        }
        
        System.out.println("Keyword doesnt exist");
    }
    
    
    //this method is logic for removing the keyword to the hash table
    public void removeKeywordLogic(String keyword) {
        
        if(keywordStorage.isEmpty()) {
            System.out.println("Keyword storage is empty!");
            return;          
        }
        
        for(KeywordData copy : keywordStorage) {
            if(copy.getKeywords().equals(keyword)) {
                keywordStorage.remove(copy);
                System.out.println("Keyword has been remove successfully");
                return;
            }
        }
        
        System.out.println("Keyword doesnt exist");
    }
    
    
    //this method is logic for listing all available keywords
    public void listAllKeywordLogic() {
        
        for(KeywordData copy : keywordStorage) {          
            System.out.println(copy);
        }
        
        System.out.println("");
        System.out.println("Thats all!");
    }
    
}





/*
 * This part is for the service of the system, the logics will be used here
 */
class KeywordSearchService
{
    private Scanner scanner = new Scanner(System.in);
    KeywordSearchLogic keywordLogic = new KeywordSearchLogic();
    
    
    //this method is for adding the keyword
    public void addKeyword() {
        
        System.out.print("Enter keyword to add: ");
        String keyword = scanner.nextLine();
        
        keywordLogic.addKeywordLogic(keyword);
        
        System.out.println("");
        System.out.println("Keyword added successfully");
    }
    
    
    //this method is for checking if the keyword exist
    public void checkKeyword() {
        
        System.out.print("Enter keyword to check: ");
        String keyword = scanner.nextLine();
        
        keywordLogic.checkKeywordLogic(keyword); 
    }
    
    
    //this method is for removing keyword that exist
    public void removeKeyword() {
        
        System.out.print("Enter keyword to remove: ");
        String keyword = scanner.nextLine();
        
        keywordLogic.removeKeywordLogic(keyword); 
    }
    
    
    //this method is for listing all keywords 
    public void listAllKeyword() {
        
        keywordLogic.listAllKeywordLogic();
    }
    
    
}





public class KeywordSearchSystem 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        KeywordSearchService keywordOperation = new KeywordSearchService();
        
        boolean isProgramRunning = true;
        
        
        while(isProgramRunning) {
            
            System.out.println("");
            System.out.println("[1] Add keywords");
            System.out.println("[2] Check keywords");
            System.out.println("[3] Remove keywords");
            System.out.println("[4] List all keywords");
            System.out.println("[5] Exit");
            System.out.println("");
            
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println("");
            
            
            switch(choice) {
                
                case 1:
                    keywordOperation.addKeyword();
                    break;
                    
                case 2:
                    keywordOperation.checkKeyword();
                    break;
                    
                case 3:
                    keywordOperation.removeKeyword();
                    break;
                    
                case 4:
                    keywordOperation.listAllKeyword();
                    break;
                    
                case 5:
                    isProgramRunning = false;
                    break;
                    
                default:
                    System.out.println("Invalid choice, try again");
                    break;
                             
            }
            
        }
        
        scanner.close();
    }
}
