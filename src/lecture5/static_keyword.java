/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture5;

/**
 *
 * @author Admin
 */
public class static_keyword {

    /**
     * @param args the command line arguments
     * 
     */
    static int a = 20;
    int b = 10;
    static int m1(){
        a = 15;
        b=20;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(b);
    }
    
}
