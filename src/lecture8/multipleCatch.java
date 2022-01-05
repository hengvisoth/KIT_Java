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
public class multipleCatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            int a[] = new int[7];
            a[3] = 30/0;
            System.out.println(a[3]);
        }
        catch(ArithmeticException e){
            System.out.println("Aritmetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds");
        }
        catch(Exception e){
            System.out.println("Exception");
        }
        System.out.println("Program is finish");
        
    }
    
}
