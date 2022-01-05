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
public class asertion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int value = 15;
        assert value >= 20 : "underweight";
        System.out.println(value);
    }
    
}
