/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture2;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter DD Amount =");
        int DD_Amount = input.nextInt();
        int Commision =0 ;
        if(DD_Amount <= 500){
            Commision = 10;
        }else if (DD_Amount <= 1000){
            Commision = 15;
        }else if(DD_Amount <= 5000){
            Commision = 20;
        }else if(DD_Amount <= 10000){
            Commision = 25;
        }else{
            Commision = (((DD_Amount - 10000)/1000)*4)+25;
            if(Commision > 1500){
                System.out.println("DD can not be taken. Use Cheque");
                System.exit(0);
            }
        }
        int Total = Commision + DD_Amount;
        System.out.println("Commision = "+Commision);
        System.out.println("The Amount you have to pay = "+Total);
    }
}
