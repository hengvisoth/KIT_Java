/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture4;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Bubble sort
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n = ");
        
        int n = in.nextInt();
        int []a = new int[n];
        int temp = 0;
        for(int i=0;i<n;i++){
            System.out.print("Enter a["+i+"]=");
            a[i] = in.nextInt();
    }
        for(int j=0; j<n;j++){
            for(int k=0; k<n-j-1; k++){
                if(a[k] > a[k+1]){
                    temp = a[k];
                    a[k] = a[k+1];
                    a[k+1] = temp;
                            
                }
                
            }
        }
        System.out.print("Sorted Array : ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
