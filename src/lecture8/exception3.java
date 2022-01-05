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
public class exception3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(exception3.myMethod());
        
    }
    public static int myMethod(){
            try{
                return 11/0;
            }
            catch(ArithmeticException e){
                System.out.println(e.getMessage());
                return 0 ;
            }
            finally{
                System.out.println("This is finally");
            }
        }
    
}
