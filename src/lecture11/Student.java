/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture11;

/**
 *
 * @author Admin
 */
public class Student {

     int rollno;
     String name ; 
     String city ;
     Student(int rollno, String name, String city){
         this.rollno = rollno;
         this.name = name;
         this.city = city ;
         
     }
     public String toString(){
         return rollno+" "+name+" "+city;
     }
    public static void main(String[] args) {
        Student s1 =new Student(1,"abc","abcd");
        Student s2 = new Student(2,"xyz","wxyz");
        System.out.println(s1);
        System.out.println(s2);
    }
    
}
