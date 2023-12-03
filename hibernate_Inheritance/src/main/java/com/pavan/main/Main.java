package com.pavan.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.pavan.model.Contract_Employee;
import com.pavan.model.Employee;
import com.pavan.model.Regular_Emp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//--------------------  connection---------------------------class name changes
		Configuration con = new Configuration().configure().addAnnotatedClass(Main.class).addAnnotatedClass(Employee.class);
		StandardServiceRegistry reg= new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
	    SessionFactory sf= con.buildSessionFactory(reg);      
	    Session session= sf.openSession();
	    Transaction tx = session.beginTransaction();
	    
	    Employee em=new Employee();
	    em.setName("Gaurav Chawla");
	    
	    Regular_Emp re=new Regular_Emp();
	    re.setName("Vivek");
	    re.setSalary(50000);
	    re.setBonus(5);
	    Contract_Employee ce=new Contract_Employee();
	    ce.setName("Arjun Kumar");  
	    ce.setPay_per_hour(1000);
	    ce.setContract_duration("15 hours"); 
	    
	    session.save(em);
//	    session.save(re);
//	    session.save(ce);
	    tx.commit();
	    session.close();
	    System.out.println("Success");

	}

}
