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
public class exception_finally {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
           int num = 121/11 ;
           System.out.println(num);
        }catch(ArithmeticException e){
            System.out.println("Number should not divide by zero");
        }
        finally{
            System.out.println("This is finally block");
            System.out.println("Out of try catch finally");
        }
    }
    
}
