/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kit;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
import java.lang.Math;
public class lecture2_generateSequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double last_number = 1 ;
        int i = 1;
        double space_between = 0;
        while (last_number < 1000){
            System.out.print(last_number+",");
            space_between = Math.pow(2,i);
            last_number = last_number + space_between;
            i+=1;
        }

//       
    }
    
}
