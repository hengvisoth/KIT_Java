package lecture3.lecture3.src;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
            int res = 0;
            System.out.println("Enter the number");
            int n1 = input.nextInt();
            int n2 = input.nextInt();
            System.out.println("1.Addition");
            System.out.println("2.Multiplication");
            System.out.println("3.Division");
            System.out.println("4.Substraction");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    res = n1 + n2;
                    break;
                case 2:
                    res = n1*n2;
                break;
                case 3:
                    res = n1/n2;
                    break;

                case 4:
                    res = n1-n2;
                    break;
                    
                default:
                    break;
            }

    }
}
