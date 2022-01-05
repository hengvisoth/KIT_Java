
package lecture11;

import java.io.*;
import java.util.*;
class Studentinfo implements Comparable<Studentinfo>{
    private int rollno;
    private String name ;
    private int age;
    @Override
    public int compareTo(Studentinfo s){
        return this.age - s.age;
    }
    public Studentinfo(String nm, int rollno, int age){
        this.name = nm ;
        this.rollno = rollno;
        this.age = age;
        
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public int getRollno(){
        return rollno;
    }
}

public class compareable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Studentinfo> list = new ArrayList<Studentinfo>();
        
        list.add(new Studentinfo("aaa",3,22));
        list.add(new Studentinfo("bbb",7,19));
        list.add(new Studentinfo("ccc",8,18));
        list.add(new Studentinfo("ddd",4,17));
        Collections.sort(list);
        
        System.out.println("Students information after sorting : ");
        for (Studentinfo sf: list){
            System.out.println(sf.getName()+" "+sf.getRollno()+" "+ sf.getAge()+" ");
        }
        System.out.println(list.get(0).compareTo(list.get(1)));
    }
    
}
