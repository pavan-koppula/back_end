package comp.pavan.Impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import comp.pavan.method.Student_method;
import comp.pavan.model.Student;

public class Student_Impl implements Student_method {

	@Override
	public void StudentAdd(int id, String name, int dob) {
		// TODO Auto-generated method stub
		Student std= new Student();
		std.setDOB(dob);
		std.setId(id);
		std.setName(name);
		
		//--------------------Hibernate connection---------------------------class name changes
		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
		StandardServiceRegistry reg= new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
	    SessionFactory sf= con.buildSessionFactory(reg);      
	     Session session= sf.openSession();
	     Transaction tx = session.beginTransaction();
		
		session.save(std);		//To Save
		tx.commit();
		session.close();		//To Close
		System.out.println("Done");
	}
}
