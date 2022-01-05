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
public class first_lecture {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int no = in.nextInt();
        if (no % 2 == 0 ){
            System.out.println(no+" is an even no");
        }
        else {
            System.out.println(no+"is an Odd no");
        }
        // TODO code application logic here
    }
    
}
