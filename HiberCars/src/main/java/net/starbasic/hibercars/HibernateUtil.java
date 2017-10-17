/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.starbasic.hibercars;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author omp
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    
    static {
        
    	Configuration cfg = new Configuration().configure();
    	StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                                        	.applySettings(cfg.getProperties());
    	sessionFactory = cfg.buildSessionFactory(builder.build());
	

    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
