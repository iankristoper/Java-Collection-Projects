package com.ian.uniqueemailvalidator;


import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;







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
