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
public class first_lecture2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        if (x>y){
            if(x>z){
                System.out.println(x + " is the greatest");       
            }
            else{
                System.out.println(z + " is the greatest");
            }
        }
        else if (y>z){
            System.out.println(y + " is the greatest");
        }
        else
            System.out.println(z + " is the greatest");
        
        // TODO code application logic here
    }
    
}
