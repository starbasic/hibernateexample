/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.starbasic.hibercars;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author omp
 */
public class MainClass {
public static void main(String[] args) {
    	//для створення таблиць достатньо створити об'єкт а потім закрити
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//   	User newUser =  new User();
//                newUser.setAddress("Birky");
//                newUser.setPassword("111");
//                newUser.setName("VovaB");
//                newUser.setLogin("Riva");
//                newUser.setAge(23);
//                Set<Car> userCars = new HashSet<Car>();
//                
//                userCars.add(new Car("Lada2109", 2005, 2450, newUser));
//                userCars.add(new Car("Lada21099", 2007, 3150, newUser));
//                newUser.setCars(userCars);
//                
//                
//
//    	//об'єкт для роботи з базою
//    	Session session = sessionFactory.openSession();
//    	List<Object> users = null;
//        List<Object> cars = null;
//    	try{
////        	session.beginTransaction();
////                session.save(newUser);
////                for(Car c:newUser.getCars())session.save(c);
////                session.getTransaction().commit();
//                
//                session.beginTransaction();
//        	SQLQuery query = session.createSQLQuery("Select * From users");
//        	query.addEntity(User.class);
//        	users = query.list();
//                
//                cars = session.createCriteria(Car.class).list();
//   	 
//   	 
//        	session.getTransaction().commit();
//    	}
//    	catch(Exception ex){
//        	session.getTransaction().rollback();
//        	ex.printStackTrace();
//        	}
//    	finally{
//        	session.close();
//        	sessionFactory.close();
//    	}
//        System.out.println("Користувачі");
//    	for(Iterator iterator = users.iterator(); iterator.hasNext();){
//        	User user = (User) iterator.next();
//        	System.out.println(user);
//    	}
//        System.out.println("Автомобілі");
//                for(Iterator iterator = cars.iterator(); iterator.hasNext();){
//        	Car car = (Car) iterator.next();
//        	System.out.println(car);
//            }
//        
            sessionFactory.close();
	}
   
}
