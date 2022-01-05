/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture10;
import java.util.*;
/**
 *
 * @author Admin
 */
public class arraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String[] prg = {"Python","Java", "C", "PHP"};
//        List<String> ls = new ArrayList<String>();
//        for(String input:prg)
//            ls.add(input);
//        System.out.println(ls);
//        System.out.println(ls.size());
//        System.out.println("Contain C ? "+ls.contains("C"));


        List<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Banana");
        list.add("Apple");
        list.add("Durian");
        for(String fruit:list)
            System.out.println(fruit);
        String[] array = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(array));
    }
    
}
