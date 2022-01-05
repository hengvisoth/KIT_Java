/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture9;
import java.io.IOException;
/**
 *
 * @author Admin
 */
public class throws_keyword {
    static void fun() throws IllegalAccessException,IOException{
        System.out.println("Inside fun()");
        throw new IllegalAccessException("Demo");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        try{
            fun();
        }catch(IllegalAccessException e){
            System.out.println("Caught in main");
        }
    }
    
}
