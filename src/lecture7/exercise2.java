/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture7;

abstract class Animal{
    abstract void cats();
    abstract void dogs();
}
class Cat extends Animal{
    
    void cats(){
        System.out.println("Cat Meows");
    }

    
}
class Dog extends Animal{
   
    void dogs(){
        System.out.println("Dogs Bark");
    }

   

}
public class exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal cat = new Cat();
        cat.cats();
        Animal dog = new Dog();
        dog.dogs();
    }
    
}
