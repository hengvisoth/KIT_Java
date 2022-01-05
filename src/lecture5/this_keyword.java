/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture5;

/**
 *
 * @author Admin
 */
class student{
    int id;
    String name;
    int age;
    student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    void display(){
    System.out.println(id);
    System.out.println(name);
    System.out.println(age);
}
}
public class this_keyword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student s1 = new student(12,"123",123);
        s1.display();
    }
    
}
