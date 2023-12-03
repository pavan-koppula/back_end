package com.pavan.Main1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.pavan.Model.Laptop;
import com.pavan.Model.Student;

public class Student_Main extends Student {
	public void StudentMethod() {
		// TODO Auto-generated method stub
		
		Laptop laptop=new Laptop();
		laptop.setLid(101);
		laptop.setLname("Dell");
		
		
		Student s=new Student();
		s.setRollno(1);
		s.setName("Pavan");
		s.setMarks(79);
		s.getLap().add(laptop);
		
	
		
	    
		
		//--------------------  connection---------------------------class name changes
				Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
				StandardServiceRegistry reg= new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
			    SessionFactory sf= con.buildSessionFactory(reg);      
			    Session session= sf.openSession();
			    Transaction tx = session.beginTransaction();
			    
			    
			    session.save(s);		//To Save
			    session.save(laptop);
			    tx.commit();
			    session.close();		//To Close
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_Main nw=new Student_Main();
		nw.StudentMethod();

	}

}
