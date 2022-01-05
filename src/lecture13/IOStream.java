/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture13;

import java.io.FileInputStream;

/**
 *
 * @author Admin
 */
import java.io.*;
public class IOStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
                InputStream is = new FileInputStream("D:\\asd.txt");
                byte buf[] = new byte[4096];
                int count = 0 , length ;
                while((length=is.read(buf)) > 0){
                    for(int i = 0 ; i<length; i++){
                        System.out.print((char)buf[i]);
                        if(buf[i] == 97){
                            count ++;
                        }
                    }
                 
                }
                System.out.println("\n number of a = "+count);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
