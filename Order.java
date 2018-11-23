/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalassignment;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dennis
 */
public class Order {
    //declaring the fields for the order
    private String _Bread;
    private ArrayList<String> _Toppings;
    private String _Meat;
    private String _Name;
    
    private String[] breadOptions = {"White Bread", "Wheat Bread", "French Bread", "Organic Bread"};
    private String[] toppingOptions = {"Red Onions", "Olives", "Pickles", "Lettuce", "Green Peppers", "Tomatoes", "Cheese"};
    private String[] meatOptions = {"Ham", "Roasted Chicken Breast", "Turkey Breast", "Roast Beef"};
    
    Scanner sc = new Scanner(System.in);
    
    //Setters
    public void setBread(String bread){
        _Bread = bread;
    }
    public void setVeggies(ArrayList<String> toppings){
        _Toppings = toppings;
    }
    public void setMeat(String meat){
        _Meat = meat;
    }
    public void setName(String name){
        _Name = name;
    }
    
    //functions
    public void printBread(){
        System.out.println("=== Select Sandwich Bread: ===");
        for (int i = 0;  i < breadOptions.length; i++){
            System.out.print( (i+1) + ")\t");
            System.out.println( breadOptions[i]);
        }
    }
    public void getBread(){
        int choice;
        System.out.println("Select a bread type [1-4]: ");
        choice = sc.nextInt();
        //Validation
        if (choice <= 0){
            System.out.println("Error; the number you choose must be greater than 0.");
            //wait so user can read error
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
            }
            getBread();
        }else if ( choice > 4){
            System.out.println("Error; the number you chose was too big.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
            }
            getBread();
        }else{
        _Bread = breadOptions[choice - 1];
        }
    }
    
    public void printToppings(){
        System.out.println("=== Select Sandwich Toppings: ===");
        for (int i = 0;  i < toppingOptions.length; i++){
            System.out.print( (i+1) + ")\t");
            System.out.println( toppingOptions[i]);
        }
    }
    public void printMeat(){
        System.out.println("=== Select Sandwich Bread: ===");
        for (int i = 0;  i < meatOptions.length; i++){
            System.out.print( (i+1) + ")\t");
            System.out.println( meatOptions[i]);
        }
    }
    
    public void getName(){
        _Name = sc.nextLine();
    }
    
}
