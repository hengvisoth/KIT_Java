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
class HOD{
    String course = "Software Engineerig";
    void printCourse_HOD(){
        System.out.println(course);
    }
}
class teachers extends HOD{
    String course = "Data Structure";
    void printCourse_tea(){
        System.out.println(course);
        System.out.println(super.course);
    }
}
class students extends teachers{
    String course = "Java";
    void printCourse_stu(){
        System.out.println(course);
        System.out.println(super.course);
    }
}
public class exercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HOD a = new HOD();
        a.printCourse_HOD();
        teachers b = new teachers();
        b.printCourse_tea();
        students c = new students();
        c.printCourse_stu();
    }
    
}
