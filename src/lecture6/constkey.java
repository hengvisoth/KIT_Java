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
public class constkey {
    final int speed ;
    
    constkey(){
        
       speed = 100;
       System.out.println(speed);
    }
    public static void main(String[] args) {
        constkey k1 =new constkey();
    }
    
}
