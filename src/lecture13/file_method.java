/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture13;

import java.io.*;
public class file_method {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File f = new File("D:\\asd.txt");  
        boolean a = f.exists();
        
        System.out.println(a);
        System.out.println(f.getName());
        System.out.println(f.getParent());
        
        System.out.println(f.isHidden());
        System.out.println(f.lastModified());
        System.out.println(f.isFile());
        System.out.println(f.length());

         
    }
    
}
