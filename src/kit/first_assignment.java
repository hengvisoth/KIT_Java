package kit;

import java.util.Scanner;



public class first_assignment{
    static int ConsumerNo;
    static String ConsumerName;
    static int PreviousReading;
    static int CurrentReading ;
    static String typeofEB;
    static double total_payment;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ConsumerNo = input.nextInt();
        System.out.print("Enter the Consumer Number : ");
        ConsumerNo = input.nextInt();
//        System.out.print("Enter the Consumer Name : ");
//        ConsumerName = input.next();
        PreviousReading = input.nextInt();
        System.out.print("Enter the Previous Reading : ");
        
        CurrentReading = input.nextInt();
        System.out.print("Enter the Current Reading : ");
       
        typeofEB = input.nextLine();
        System.out.print("Enter the type of EB connection : ");
  
 
        
        int different_value = 0;
        int different_value2 = 0;
        if (typeofEB=="commercial"){
            different_value = 1;
            different_value2 = 1;
        }
        if (CurrentReading >= 0 && CurrentReading <= 100){
            total_payment = 1*(CurrentReading+different_value);
        }else if(CurrentReading >= 101 && CurrentReading <= 200){
            total_payment = (100*(1+different_value))+((CurrentReading-100)*(2.50+different_value+different_value2));

        }else if(CurrentReading >= 201 && CurrentReading <= 500){
            total_payment = (100*1)+(100*2.50+different_value+different_value2)+((CurrentReading-200)*(4+different_value+different_value2));
        }else{
            total_payment =(100*1)+(100*2.50+different_value+different_value2)+(300*(4+different_value+different_value2)+((CurrentReading-500)*6));
        }

        System.out.println(total_payment);
    }
}
