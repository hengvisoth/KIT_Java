/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture6;

/**
 *
 * @author Admin
 */
abstract class Bike{
    abstract void run();
}

public class Abstraction extends Bike {
  
    void run(){
        System.out.println("Running Safely");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bike obj = new Abstraction();
        obj.run();
    }
    
}
