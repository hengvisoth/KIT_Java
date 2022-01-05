/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture13;
import java.util.*;
/**
 *;
 * @author Admin
 */
class Employee implements Comparable<Employee>{
   String name;
   int age;
   int id;
   String department;
   int salary;
   public int compareTo(Employee m){
       return this.age - m.age;
   }
   public Employee(String name, int age, int id, String department, int salary){
       this.name = name;
       this.age = age;
       this.department = department;
       this.id = id;
       this.salary = salary;
       
   }
   // Getter methods for accesing private data 
   public int getID(){
       return id;
   }
   public String getName(){
       return name;
   }
   public int getSalary (){
       return salary;
   }
}
class IDCompare implements Comparator<Employee>{
    public int compare(Employee e1, Employee e2){
        if( e1.getID() > e2.getID()){
            return 1;
        }else if(e1.getID()<e2.getID()){
            return -1;
        }else
            return 0;
    }

}
public class exercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Employee> employee= new ArrayList<Employee>(); 
        employee.add(new Employee("Numpang",12,007,"Bakery department",200));
        employee.add(new Employee("Bakyong",52,001,"qweasd department",200));
        employee.add(new Employee("QWEASD",15,002,"vasmdpqw department",200));
        for(Employee ls :employee){
            System.out.println(ls.getID()+" "+ls.getName()+" "+ls.getSalary());
        }
        System.out.println("\nIDCompare");
        IDCompare idcomparing = new IDCompare();
        Collections.sort(employee,idcomparing);
        for(Employee e: employee)
            System.out.println(e.getID() + " "+ e.getName() + " " + e.getSalary());    }
    
}
