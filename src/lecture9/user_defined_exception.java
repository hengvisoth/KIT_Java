/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture9;

/**
 *
 * @author Admin
 */
class Myexception extends Exception {
    public Myexception(String msg){
        super(msg);
    }
}
public class user_defined_exception {
    void fun() throws Myexception{
        System.out.println("Inside fun");
        throw new Myexception("Demo");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            user_defined_exception ex = new user_defined_exception();
            ex.fun();
        }catch(Myexception e){
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
    
}
