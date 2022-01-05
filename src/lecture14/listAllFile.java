package lecture14;
import java.io.*;
public class listAllFile {
    public static void main(String[] args) {
        
        try{
            File folder = new File("D:\\Java");
            // list all the files 
            File[] files = folder.listFiles();
            for(File allSingleFile : files){
                if(allSingleFile.isFile()){
                    System.out.println(allSingleFile);
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
