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
public class testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n =2;
        int factor = 0;
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                factor+=1;
            }
        }    
        if(factor > 2){
            System.out.println("True");

        }else{
           System.out.println("");
        }
    }
//    public static boolean checking(int n){
//
//        int factor = 0;
//        for(int i=1;i<=n;i++){
//            if(n%i == 0){
//                factor+=1;
//            }
//        }    
//        if(factor > 2){
//            return true ;
//
//        }else{
//           return false;
//        }
    
}
