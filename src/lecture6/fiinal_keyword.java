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
class Honda{
        int speed = 100;
        void begin(){
            speed = 159;
            System.out.println(speed);
        }
    }
public class fiinal_keyword extends Honda {
        
//    final int speed = 90;
//    void run (){
//        speed = 100 ; // cannot assign a value to final variable 
//        // once it initialize we can't change
//        System.out.println(speed);
//    }
    int speed = 90;
    void begin(){
        System.out.println(speed);
        speed =100;
        System.out.println(speed);
    }
    public static void main(String[] args) {
        fiinal_keyword a = new fiinal_keyword();
        a.begin();
    }

    
    
    
}
