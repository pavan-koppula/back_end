package com.pavan.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.pavan.model.Movie;


public class MovieAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration con = new Configuration().configure().addAnnotatedClass(Movie.class);
		StandardServiceRegistry reg= new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
	    SessionFactory sf= con.buildSessionFactory(reg);      
	     Session session= sf.openSession();
	     Transaction tx = session.beginTransaction();
	     
	   //---------------------------insert-----------------------------------
	     
//	     Movie mv= new Movie();
//	     mv.setId(2);
//	     mv.setName("avatar");
//	     session.save(mv);
	     
	     
	     
	     
	   //------------------------update-------------------------------- 
//	     
//	     Movie mv1=new Movie();
//	     mv1.setId(1);
//	     mv1.setName("avenger");
//	     session.update(mv1);
//	     session.save(mv1);
	     
	     
	   //------------------read by id------------------------------------------
	     
	     Movie mvk= (Movie) session.get(Movie.class, 1);	//GET Method
	     Movie me= (Movie) session.load(Movie.class, 2);	//Load Method
	     System.out.println(mvk);
	     System.out.println(me);
	     
	     
	     
	    //---------------------------delete by id------------------------------
//	     Movie mvk1= session.get(Movie.class, 2);
//	    session.delete(mvk1);
//	    System.out.println("deleted");
//	     
//	     tx.commit();
//	     
//		session.close();
	}

}
