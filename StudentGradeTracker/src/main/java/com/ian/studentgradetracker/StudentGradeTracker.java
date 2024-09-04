package com.ian.studentgradetracker;




import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;






class StudentInformation
{
    private String fullName;
    private int schoolID;
    private float firstGrades;
    private float secondGrades;
    
    
    //constructor for data initialization
    public StudentInformation(String fullName, int schoolID, float firstGrade, float secondGrade)
    {
        this.fullName = fullName;
        this.schoolID = schoolID;
        this.firstGrades = firstGrade;
        this.secondGrades = secondGrade;
    }
    
    
    //public getters
    /*
    *
    *
    *
    *
    */      
}



class GradesTracker
{
    Scanner scanner = new Scanner(System.in);
    private static List<StudentInformation> studentList = new ArrayList<>();  //use the list interface and the arraylist as the implementation
    
    int id = 1000;
    
    public static void addStudent()
    {
        System.out.print("Enter your full name [First name, Last Name]: ");
        String studentName = scanner.nextLine();
        
        System.out.print("");
    }
        
        
}






public class StudentGradeTracker 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        boolean isMainProgramRunning = true;
        
        
        System.out.println("Welcome to IGrades Tracker");
        System.out.println("");
        
        while(isMainProgramRunning)
        {
            System.out.println("[1] Add Student");
            System.out.println("[2] Update Grades");
            System.out.println("[3] View Grades");
            System.out.println("[4] Search Students");
            System.out.println("[5] Exit");
            System.out.println("");
            
            System.out.println("Please select your choice");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice)
            {
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
                    
                default:
                    System.out.println("Invalid choice, try again!");
            }
        }
        
        scanner.close();
    }
}
