/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture7;

abstract class Bank{
    abstract void getBalance();
}
class BankA extends Bank{

    @Override
    void getBalance() {
        System.out.println("100$"); 
    }
}
class BankB extends Bank{
    @Override
    void getBalance() {
         System.out.println("150$");
    }
    
}
class BankC extends Bank{

    @Override
    void getBalance() {
         System.out.println("200$");
    }
    
}
public class exercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bank a = new BankA();
        a.getBalance();
        Bank b = new BankB();
        b.getBalance();
        Bank c = new BankC();
        c.getBalance();
    }
    
}
