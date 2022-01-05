/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture10;

import java.util.*;
enum gfg{CODE,LEARN,CONTRIBUTE,QUIZ,MCQ}
public class HashSet2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
//        Set<String> set = new HashSet<String>();
//        set.add("India");
//        set.add("Cambodia");
//        set.add("Japan");
//        set.add("Thailand");
//        set.add("japan");
//        System.out.println(set);
//        set.remove("Thailand");
//        System.out.println(set);
//        System.out.println("Contain Singapore?"+set.contains("Singapore"));
          Set<gfg> set1; 
          set1 = EnumSet.of(gfg.CODE,gfg.LEARN,gfg.CONTRIBUTE);
          System.out.println(set1);
    }
    
}
