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
public class Assignment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Income =");
        double Income = input.nextInt();
        double Tax = 0;
        if(Income<=100000){
            Tax = 0;
        }
        else if(Income <= 300000){
            Tax = 0.1*Income;
        }else if (Income <= 500000){
            Tax = 0.2*Income + 1000 ;
        }else{
            Tax = 0.3*Income + 2000;
        }
        double Total = Tax + Income;
        System.out.println("The Amount you have to pay = "+Total);
        System.out.println("Tax = "+Tax);
    }
}
