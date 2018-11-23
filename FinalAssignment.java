/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalassignment;

/**
 *
 * @author dennis
 */
public class FinalAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //start loop to continue ordering until user is done
        //variable to determine if done or not
        boolean isDone = false;
        while ( isDone == false ){
            Order newOrder = new Order();
            newOrder.printBread();
            newOrder.getBread();
        }
        
        
    }
    
}
