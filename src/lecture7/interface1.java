/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture7;

/**
 *
 * @author Admin
 */
interface A6 {
    void pirnt();
        
    
}
public class interface1 implements A6{

    
    public void pirnt() {
        System.out.println("Welcome to java");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        A6 a = new interface1();
        a.pirnt();
    }

    
    
}
