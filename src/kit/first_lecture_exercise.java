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
public class first_lecture_exercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age = input.nextInt();
        if (age >= 18){
            System.out.println("You Can Vote");
        }
        else
            System.out.println("Sorry You Can't");
               
        // TODO code application logic here
    }
    
}
