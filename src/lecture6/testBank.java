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
abstract class bank {
    abstract int getrate();
}
class sbi extends bank{
    int getrate(){
        return 7;
    }
}
class pnb extends bank{
    int getrate(){
        return 8;
    }
}
public class testBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bank b ;
        b = new sbi();
        System.out.println("SBI rate of intereset" + b.getrate());
        bank a ;
        a = new pnb();
        System.out.println("PNB rate of interest "+a.getrate());
    }
    
}
