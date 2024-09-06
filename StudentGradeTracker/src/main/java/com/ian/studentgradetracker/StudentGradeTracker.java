package com.ian.studentgradetracker;




import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;






class StudentInformation
{
    private String fullName;
    private int schoolID;
    private float finalGrades;
    
    
    //constructor for data initialization
    public StudentInformation(String fullName, int schoolID, float finalGrade)
    {
        this.fullName = fullName;
        this.schoolID = schoolID;
        this.finalGrades = finalGrade;
    }
    
    
    //public setters for updating or setting new data to private data
    public void setName(String name) {
        this.fullName = name;
    }
    
    public void setID(int id) {
        this.schoolID = id;
    }
    
    public void setGrades(float grades) {
        this.finalGrades = grades;
    }    
    
    
    //public getters for getting the private data 
    public String getName() {
        return fullName;
    }
    
    public int getID() {
        return schoolID;
    }
    
    public float getGrades() {
        return finalGrades;
    }
      
    
    //method overriding -> override the toString() method
    @Override
    public String toString()
    {
        return "\n" + "Name: " + getName() + "\n" 
                + "Id: " + getID() + "\n"
                + "Grades: " + getGrades() + "\n";
    }
    
          
}



class GradesTracker
{
    private static Scanner scanner = new Scanner(System.in);
    private static List<StudentInformation> studentList = new ArrayList<>();  //use the list interface and the arraylist as the implementation
    
    static int id = 1000;
    
    
    
    //this method is for adding student information 
    public static void addStudent()
    {
        System.out.println("");
        System.out.print("Enter student full name [First name, Last Name]: ");
        String studentName = scanner.nextLine();
        
        System.out.println("Student ID number: " + ++id);
        int studentID = id;
        
        
        System.out.print("Enter student final grade: ");
        float studentGrade = scanner.nextFloat();
        scanner.nextLine();
        
        
        StudentInformation studentInformation = new StudentInformation(studentName, studentID, studentGrade);
        studentList.add(studentInformation);
        
        System.out.println("");
        System.out.println("Student information is added successfully");
    }
    
    
    
    //this method is for updating the student records
    public static void updateGrades()
    {
        System.out.print("Enter student ID: ");
        int searchID = scanner.nextInt();
        scanner.nextLine();
        
        for(StudentInformation copy : studentList)
        {
            if(copy.getID() == searchID)
            {
                boolean isUpdateGradesRunning = true;
                
                while(isUpdateGradesRunning)
                {
                    System.out.println("");
                    System.out.println("Select what you want to update");
                    System.out.println("[1] Name");
                    System.out.println("[2] Grades");
                    System.out.println("[3] Back");
                    System.out.print("Enter your choice: ");
                    int updateChoice = scanner.nextInt();
                    scanner.nextLine();
                    
                    switch(updateChoice)
                    {
                        case 1:
                            System.out.print("Enter student new full name: ");
                            String updatedName = scanner.nextLine();  //get the updated name
                            copy.setName(updatedName);  //store the updated name
                            break;
                            
                        case 2:
                            System.out.print("Enter student new final grades: ");
                            float updatedGrades = scanner.nextFloat();
                            scanner.nextLine();
                            copy.setGrades(updatedGrades);
                            break;
                            
                        case 3:
                            isUpdateGradesRunning = false;
                            break;
                            
                        default:
                            System.out.println("Invalid choice, try again");
                            break;                                                                      
                                                                              
                    }
                }
                
                System.out.println("Update complete!");
                return;
            }
        }
        
        System.out.println("Invalid ID");   
    }
    
    
    
    //this method is for viewing the all available grades on the memory
    public static void viewGrades()
    {
        System.out.println("Here are the list of students and their grades");
        System.out.println("");
        
        for(StudentInformation copy : studentList)
        {
            System.out.println(copy);
            System.out.println("");
        }
        
        System.out.println("================================");
        System.out.println("");
    }
    
    
    
    public static void searchStudent()
    {
        System.out.print("Enter student ID: ");
        int searchID = scanner.nextInt();
        
        for(StudentInformation copy : studentList)
        {
            if(copy.getID() == searchID)
            {
                System.out.println(copy);
                System.out.println("");
                return;
            }
        }
        
        System.out.println("Invalid ID");
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
            System.out.println("[3] View Records");
            System.out.println("[4] Search Students");
            System.out.println("[5] Exit");
            System.out.println("");
            
            System.out.print("Please select your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice)
            {
                case 1:
                    GradesTracker.addStudent();
                    break;
                    
                case 2:
                    GradesTracker.updateGrades();
                    break;
                    
                case 3:
                    GradesTracker.viewGrades();
                    break;
                    
                case 4:
                    GradesTracker.searchStudent();
                    break;
                    
                case 5:
                    isMainProgramRunning = false;
                    break;
                    
                default:
                    System.out.println("Invalid choice, try again!");
            }
        }
        
        scanner.close();
    }
}
