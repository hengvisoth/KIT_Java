/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture7;

/**
 *
 * @author Admin
 */
interface AnimalEat{
    void eat();
}
interface AnimalTravel{
   void travel(); 
}
class Animals implements AnimalEat, AnimalTravel{
    public void eat(){System.out.println("Animal Eat");};
    public void travel(){System.out.println("Animal Travel");};
}
public class interface2 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Animals a = new Animals();
        a.eat();
        a.travel();
    }
    
}
