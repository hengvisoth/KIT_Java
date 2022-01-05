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
interface maths{
    void square(int n);
    default void show(){
        System.out.println("Default method");
    }
}
public class interface3 implements maths{
    public void square(int n){
        System.out.println(n*n);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        maths m1  = new interface3();
        m1.show();
        m1.square(15);
    }
    
}
