package comp.pavan.Impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import comp.pavan.method.Address_method;
import comp.pavan.model.Address;
import comp.pavan.model.Marks;

public class Address_Impl implements Address_method{
	
	@Override
	public void AddAddress(int id, String city, int phone) {
		// TODO Auto-generated method stub
		Address ad=new Address();
		ad.setId(id);
		ad.setCity(city);
		ad.setPhone(phone);
		
		//--------------------Hibernate connection---------------------------class name changes
		Configuration con = new Configuration().configure().addAnnotatedClass(Address.class);
		StandardServiceRegistry reg= new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
	    SessionFactory sf= con.buildSessionFactory(reg);      
	    Session session= sf.openSession();
	    Transaction tx = session.beginTransaction();
	    
	    session.save(ad);		//To Save
	    tx.commit();
	    session.close();		//To Close
	    System.out.println("Done");

	}
	
}
