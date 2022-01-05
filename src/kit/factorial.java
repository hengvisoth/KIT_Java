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
public class factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int fact = 1;
        int i;
        System.out.print("Enter n = ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
    
}
