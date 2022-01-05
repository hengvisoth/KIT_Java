/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture4;
class first{
    void print(){
        System.out.println("Hello World first class ");
    }
            
}
class second extends first {
    void print(){
        System.out.println("HEllo world class 2 ");
    }
}
class third extends first{
    void print(){
        System.out.println("Hello world class 3");
    }
}
/**
 *
 * @author Admin
 */
public class inheritance {
    int multiply(int a,int b){
        return a*b;
    }
    double mulitply(double a,double b){
        return a*b;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        inheritance in = new inheritance();
        System.out.println(in.multiply(2, 3));
        System.out.println(in.mulitply(4.5, 1.2));
        first f1;
        f1 = new second();
        f1.print();
        f1 = new third();
        f1.print();
        f1 = new first();
        f1.print();
    }
    
}
