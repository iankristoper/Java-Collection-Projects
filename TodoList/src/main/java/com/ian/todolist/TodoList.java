package com.ian.todolist;


import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;



//this class is for the attributes of the class, it is encapsulated
class TodoData
{
    private int taskID;
    private String taskName;
    private String taskDescription;
    private int taskStatus;
    
    public TodoData(int taskID, String taskName, String taskDescription, int taskStatus)
    {
        this.taskID = taskID;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;                            
    }
    
    
    
    //public setters and getters
    public void setID(int taskID) {
        this.taskID = taskID;
    }
    
    public void setName(String taskName) {
        this.taskName = taskName;
    }
    
    public void setDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
    
    public void setStatus(int taskStatus) {
        this.taskStatus = taskStatus;
    }
    
    
    public int getID() {
        return taskID;      
    }
    
    public String getName() {
        return taskName;
    }
    
    public String getDescription() {
        return taskDescription;
    }
    
    public int getStatus() {
        return taskStatus;
    }
            
    //method overriding -> override the toString() method
    @Override 
    public String toString()
    {
        return "TodoList ID: ";
    }
        
}



//this is class for the functionality of the system
class TodoFunction
{
    private static Scanner scanner = new Scanner(System.in);
    private static List<TodoData> todoStorage = new LinkedList<TodoData>();
    static int id = 1000;
    
    
    //this method is for adding the task
    public static void addTask()
    {
        System.out.println("Your task ID: " + ++id);
        int todoID = id;
        
        System.out.print("Enter task name: ");
        String todoName = scanner.nextLine(); 
        
        System.out.print("Enter task description: ");
        String todoDescription = scanner.nextLine();
        
        System.out.print("Task status [1 for Done] or [0 for In progress]: ");
        int todoStatus = scanner.nextInt();
        
        
        //add all the data
        TodoData 
        
        
    }
    
    
    
}




public class TodoList 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
              
        boolean isMainProgramRunning = true;
        
        
        System.out.println("Welcome to ITodo-List");
        
        while(isMainProgramRunning)
        {
            System.out.println("");
            System.out.println("Please select your choices");
            System.out.println("[1] Add task");
            System.out.println("[2] Remove task");
            System.out.println("[3] View task");
            System.out.println("[4] Prioritize task");
            System.out.println("[5] Complete task");
            System.out.println("[6] Clear List");
            System.out.println("[7] Exit");
            System.out.println("\n");
            
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
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
                    
                case 6:
                    break;
                    
                case 7:
                    isMainProgramRunning = false;
                    break;
                    
                default:
                    System.out.println("Invalid choice, try again!");
                    break;
            }
        }
        
        scanner.close();
    }
}
