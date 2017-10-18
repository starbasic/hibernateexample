/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.starbasic.hibernate;

import java.util.Collection;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Серж
 */
public class StudentHibernateDAO implements DAOTemplate<Student>{
    private final SessionFactory factory;

    public StudentHibernateDAO() {
	Configuration cfg = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                                            .applySettings(cfg.getProperties());
        factory = cfg.buildSessionFactory(builder.build());
    }
    @Override
    public Collection<Student> values() {
        final Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			return session.createQuery("from Student").list();
		} finally {
			tx.commit();
                        session.close();
                        
                }
    }
    

    @Override
    public int add(Student student) {
        final Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			session.save(student);
			return student.getId();
		} finally {
			tx.commit();
			session.close();
}
    }

    @Override
    public void edit(Student user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        final Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		try {
                    Student deleted;
                    deleted = new Student(null, 0, 0);
                    deleted.setId(id);
                    session.delete(deleted);
		} finally {
			tx.commit();
			session.close();
}
    }

    @Override
    public Student get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public void close() {
        this.factory.close();
    }

    @Override
    public Student findByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
