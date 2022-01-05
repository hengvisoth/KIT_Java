package lecture14;
import java.io.*;
public class fileWrite {
    public static void main(String[] args) {
        
        try{
            FileWriter output = new FileWriter("D:\\asd.txt");
            String data = ("Tommorow u will have a semester exam");
            output.write(data);
            System.out.println("Data is written ");
            output.close();
            FileReader in = new FileReader("D:\\asd.txt");
            char[] content = new char[100];
            in.read(content);
            in.close();
            System.out.println(content);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}
