/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture12;
import java.io.*;
/**
 *
 * @author Admin
 */
public class file {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File f = new File("D:\\asd.txt");
        boolean canX = f.canExecute();
        System.out.println(canX);
        boolean canR = f.canRead();
        System.out.println("Readability "+canR);
        boolean canW = f.canWrite();
        System.out.println("Writeability "+canW);
        boolean ok = f.setExecutable(false);
        System.out.println("Now executable status"+ok);
        String absname = f.getAbsolutePath();
        System.out.println("File path is "+absname);
        try{
        String canname = f.getCanonicalPath();
        System.out.println("Cannonical path " + canname);
        }catch(IOException e){
            e.printStackTrace();
        }
        String fname = f.getName();
        System.out.println("Filename is" + fname + f.getParent());
    }
    
}
