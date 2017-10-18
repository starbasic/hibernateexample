/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.starbasic.hibernate;


import java.util.List;


/**
 *
 * @author Серж
 */
public class MainClass {
    
    
    public static void main(String[] args) {
       StudentHibernateDAO shd = new StudentHibernateDAO();
        List<Student> students =  (List<Student>) shd.values();
        for(Student s : students)
            System.out.println(s);
//       Student Dima = new Student("Гайдук",19,12345);
//       shd.add(Dima);
//       // shd.delete(10);
//        System.out.println("\n\n\nРазом нас багато:\n\n\n");
//        students =  (List<Student>) shd.values();
//        for(Student s : students)
//            System.out.println(s);
        
        
    }
   
    
     
}
