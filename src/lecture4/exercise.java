/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture4;

/**
 *
 * @author Admin
 */
class shape{
    int area(int a){
        System.out.println("Square");
        return a*a;
    }
    int area(int l, int b){
        System.out.println("Rectangle");
        return l*b;
    }
    float area(double r){
        System.out.println("Circle");
        return (float)(r*r*3.14);
    }
}
public class exercise {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        shape a = new shape();
        System.out.println(a.area(1.3));
    }
    
}
