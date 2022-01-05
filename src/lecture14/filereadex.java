package lecture14;
import java.io.*;
public class filereadex {
    public static void main(String[] args) {
        try {
            FileReader in = new FileReader("D:\\asd.txt");
            char[] array = new char[10];
            in.read(array);
            System.out.println(array);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
