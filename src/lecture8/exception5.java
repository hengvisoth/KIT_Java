/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture8;

/**
 *
 * @author Admin
 */
public class exception5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2;
        try{
            num1 = 0;
            num2 = 62/num1;
            System.out.println(num2);
            System.out.println("Hey I'm at the end of try block");
            
        }catch(ArithmeticException e){
            System.out.println("You should not divide a number by zero");
            
        }catch(Exception e){
            System.out.println("Exception Occured");
        }
        System.out.println("I'm out of try-catch block in Java");
    }
    
}
