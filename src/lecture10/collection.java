
package lecture10;
import java.util.*;
public class collection {

    public static void main(String[] args) {
        
        int count[] = {34,22,10,60,30,22};
        Set<Integer> set = new HashSet<Integer>();
        try{
            for(int i=0;i<5;i++){
                set.add(count[i]);
                System.out.println(set);
                TreeSet sortedSet = new TreeSet<Integer>(set);
                System.out.println("Set size : "+set.size());
                // container 
                System.out.println("Contian 65 ? "+set.contains(65));
                System.out.println("The sorted list is : ");
                System.out.println(sortedSet);
                System.out.println("The first element of the set is " + (Integer)sortedSet.first());
                System.out.println("The last element of the set is " + (Integer)sortedSet.last());
              
            
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
