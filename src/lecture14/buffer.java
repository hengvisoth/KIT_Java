/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture14;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.lang.*;
import java.io.*;
public class buffer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            BufferedReader in = new BufferedReader(new FileReader("D:\\asd.txt"));
            String line;
            int lines = 0;
            while((line = in.readLine()) != null){
                System.out.println(line);
                lines++;
            }
            System.out.println("The number of lines in a file "+lines);
        }catch (IOException e){
            System.out.println(e);
        }
    }
    
}
