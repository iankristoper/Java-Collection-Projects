package com.ian.productidmanager;




import java.util.Scanner;   //this package is for the input 
import java.util.Set;       //this is one is interface (no duplication)
import java.util.HashSet;   //implementation of set (no duplication, no proper order)





class ProductIdData
{
    private int productID;
    
    public ProductIdData(int productID)  //constructor for this class
    {       
        this.productID = productID;
    }
    
    
    //getters
    public int getID() {  
        return this.productID;
    }
    
    
    //setters
    public void setID(int productID) {
        this.productID = productID;
    }
    
    
    
    @Override
    public String toString() {
        return "Product ID: " + 
                getID() + 
                "\n";
    }
    
     
}




/*
 *
 */
class ProductIdLogic
{
    private Set<ProductIdData> productIdStorage = new HashSet<>();
    
    
    //this method is for the addProductID logic
    public void addProductLogic(int productID) {
        
        ProductIdData productData = new ProductIdData(productID);
        productIdStorage.add(productData);
    }
    
    
    //this method is for the checkProductId logic
    public void checkProductLogic(int productID) {
        
        for(ProductIdData copy : productIdStorage) {          
            if(copy.getID() == productID) {
                System.out.println("Product ID exist in the inventory!");   
                return;            }
        }
        
        System.out.println("Product ID doesnt exist");      
        
    }
    
    
    //this method is for the removeProductId logic
    public void removeProductLogic(int productID) {
        
        for(ProductIdData copy : productIdStorage) {
            if(copy.getID() == productID) {
                productIdStorage.remove(copy);
                System.out.println("Product ID successfully removed");
                return;
            }
        }
        
        System.out.println("Product ID doesnt exist");
    }
    
    
    //this method is for viewAllProductId logic
    public void viewAllProductLogic() {
        
        for(ProductIdData copy : productIdStorage) {
            System.out.println(copy);
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("==================================");
        
    }
    
    
    //this method is for clearAllProductId logic
    public void clearAllProductLogic() {
        
        for(ProductIdData copy : productIdStorage) {
            productIdStorage.remove(copy);
        }
        
        System.out.println("All product ID has been removed");
    }
    
}




/*
 *
 */
class ProductIdOperations
{
    private Scanner scanner = new Scanner(System.in);
    private ProductIdLogic productIdLogic = new ProductIdLogic();
    
    
    //service for adding id to the inventory
    public void addProductId() {
        
        System.out.print("Add new product ID to the inventory: ");
        int productID = scanner.nextInt();
        scanner.nextLine();  //consume newline
        
        productIdLogic.addProductLogic(productID);  //process the product id
        
        System.out.println("Product ID added to the inventory successfully!");
    }
    
    
    //service for checking if id exist to the inventory
    public void checkProductId() {
        
        System.out.print("Enter product ID to check: ");
        int productID = scanner.nextInt();
        scanner.nextLine();  //consumes new line
        
        productIdLogic.checkProductLogic(productID);
        
    }
    
    
    //service for removing product id to the inventory
    public void removeProductId() {
        
        System.out.print("Enter product ID to remove: ");
        int productID = scanner.nextInt();
        scanner.nextLine();
        
        productIdLogic.removeProductLogic(productID);
    }
    
    
    //service for viewing all product id
    public void viewAllProductId() {
        
        productIdLogic.viewAllProductLogic();
    }
    
    
    //service for removing all product id
    public void clearAllProductId() {
        
        productIdLogic.clearAllProductLogic();
    }
    
}







public class ProductIDManager 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        ProductIdOperations productOperation = new ProductIdOperations();
        
        boolean isProgramRunning = true;
        
        
        System.out.println("Welcome to Iproduct ID Manager");
        
        while(isProgramRunning) {
            
            System.out.println("");
            System.out.println("[1] Add product ID");
            System.out.println("[2] Check product ID");
            System.out.println("[3] Remove product iD");
            System.out.println("[4] View all product ID");
            System.out.println("[5] Clear all product ID");
            System.out.println("[6] Exit");
            System.out.println("");
            
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println("");
            
            switch(choice) {
                
                case 1:
                    productOperation.addProductId();
                    break;
                    
                case 2:
                    productOperation.checkProductId();
                    break;
                    
                case 3:
                    productOperation.removeProductId();
                    break;
                    
                case 4:
                    productOperation.viewAllProductId();
                    break;
                    
                case 5:
                    productOperation.clearAllProductId();
                    break;
                    
                case 6:
                    isProgramRunning = false;
                    break;
                    
                default:
                    System.out.println("Invalid choice, try again.");
                    break;
            }
        } 
        
        
        scanner.close();
        
    }
}
