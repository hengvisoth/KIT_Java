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
class animal{
    String color = "white";
}
class dog extends animal{
    String color = "black" ;
    void print(){
        System.out.println(color);
        System.out.println(super.color);
    }
}
public class super_keyword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        dog d = new dog();
        d.print();
    }
    
}
