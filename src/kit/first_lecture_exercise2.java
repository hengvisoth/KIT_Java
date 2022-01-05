/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kit;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class first_lecture_exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the pin number : ");
       String pin = input.nextLine();
       if(pin.length() >= 4){
           System.out.println("True");
       }
       else 
           System.out.println("False");
        
    }
    
}
