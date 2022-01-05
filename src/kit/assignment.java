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

public class assignment {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Consumer Number : ");
        int ConsumerNo = input.nextInt();
        System.out.print("Enter the Consumer Name :");
        String ConsumerName = input.next();
        System.out.print("Enter the Previous Reading : ");
        int PreviousReading = input.nextInt();
        System.out.print("Enter the Current Reading : ");
        int CurrentReading = input.nextInt();
        System.out.print("Enter the typeofEB : ");
        String typeofEB = input.next();
        
        int different_value = 0;
        int different_value2 = 0;
        int total_payment = 0;
        int num = CurrentReading - PreviousReading;
        if ("commercial".equalsIgnoreCase(typeofEB)){
            different_value = 1;
            different_value2 = 1;
        }
        if (num >= 0 && num <= 100){
            total_payment = 1*(num+different_value);
        }else if(num >= 101 && num <= 200){
            total_payment = (int) ((100*(1+different_value))+((num-100)*(2.50+different_value+different_value2)));

        }else if(num >= 201 && num <= 500){
            total_payment = (int) ((100*1)+(100*2.50+different_value+different_value2)+((num-200)*(4+different_value+different_value2)));
        }else{
            total_payment =(int) ((100*1)+(100*2.50+different_value+different_value2)+(300*(4+different_value+different_value2)+((num-500)*6)));
        }

        

        System.out.println("Total payment = "+total_payment);
    }
}