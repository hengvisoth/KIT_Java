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
public class leccture2_code {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n = ");
        int commision = 0;
        int n = input.nextInt();
        if(n<=500){
            commision = 10;
        }
        else if (n>=501 && n<=1000){
            commision = 15;
        }
        else if (n>=501 && n<=1000){
            commision = 15;
        }
        else if (n>=501 && n<=1000){
            commision = 15;
        }
        else {
            commision = 15;
        }
        
    }
    
}
