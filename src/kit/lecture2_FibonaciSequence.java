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
public class lecture2_FibonaciSequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x1 = 0;
        int x2 = 1;
        int x3 = 0;
        int i;
        Scanner input =new Scanner(System.in);
        System.out.print("Enter n = ");
        float n = input.nextFloat();
        for(i=1;i<=n;i++){
            x3 = x1 + x2 ;
           System.out.println(x3);
           x1 = x2 ;
           x2 = x3;
                 
                    
        }
        
        // TODO code application logic here
    }
    
}
