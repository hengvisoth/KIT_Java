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
public class exception4 {
    static void checkAge(int age){
        if (age<18){
            throw new ArithmeticException("Access Denied");
        }else{
            System.out.println("Access granted");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        checkAge(15);
    }
    
}
