package comp.pavan.Impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import comp.pavan.method.Marks_method;
import comp.pavan.model.Marks;

public class Marks_Impl implements Marks_method {
	public void config() {
		Configuration con1 = new Configuration().configure().addAnnotatedClass(Marks.class);
		StandardServiceRegistry reg1= new StandardServiceRegistryBuilder().applySettings(con1.getProperties()).build();
	    SessionFactory sf1= con1.buildSessionFactory(reg1);      
	     Session session1= sf1.openSession();
	     Transaction tx1 = session1.beginTransaction();
	}

	@Override
	public void AddMarks(int id, int tel, int hin, int eng) {
		// TODO Auto-generated method stub
		Marks imp=new Marks();
		imp.setId(id);
		imp.setTel(tel);
		imp.setHin(hin);
		imp.setEng(eng);
	
		//--------------------Hibernate connection---------------------------class name changes
		Configuration con = new Configuration().configure().addAnnotatedClass(Marks.class);
		StandardServiceRegistry reg= new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
	    SessionFactory sf= con.buildSessionFactory(reg);      
	     Session session= sf.openSession();
	     Transaction tx = session.beginTransaction();
	     
	     session.save(imp);   //To Save
	     tx.commit();		  //
	     session.close();	  //close
	     System.out.println("Done");
		
	}

	@Override
	public void deleteMarks(int id) {
		// TODO Auto-generated method stub
		
		
	}

}
