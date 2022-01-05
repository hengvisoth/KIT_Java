/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture9;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Exercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the citizen age = ");
        int ageCitizen = in.nextInt();
        try {
            if(ageCitizen >= 18){
                System.out.println("You are eligible to vote");
            }else{
                throw new ArithmeticException("You are not able to vote");
            }
            
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    
}
