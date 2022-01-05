/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture9;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Excersice2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Enter a number = ");
            int num = input.nextInt();
            boolean check = Character.isAlphabetic(num);
            if(check == true){
                System.out.println("It is number");
            }
            else{
                throw new Exception("It is not a number");            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
