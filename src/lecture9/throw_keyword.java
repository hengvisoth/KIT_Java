    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture9;
class ThrowExcep{
    
}
/**
 *
 * @author Admin
 */

public class throw_keyword {
    static void fun(){
        try{
            throw new NullPointerException("Demo");
        }catch(NullPointerException e){
            System.out.println("Caugh inside fun().");
            throw e;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            fun();
            
        }catch(NullPointerException e){
            System.out.println("Caught in main.");
        }
    }
    
}
