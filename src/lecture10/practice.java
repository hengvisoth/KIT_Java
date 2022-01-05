package lecture10;
import java.util.*;
public class practice {
    public static void main(String[] args) {
        String data[] = {"cse","se","ece"};
        Set<String> set = new HashSet<String>();
        try{
            for(int i=0;i<data.length;i++){
                set.add(data[i]);
            }
            System.out.println(set);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
