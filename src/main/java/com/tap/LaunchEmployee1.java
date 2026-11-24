package com.tap;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class LaunchEmployee1 {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();

		cfg.configure();
		cfg.addAnnotatedClass(Employee1.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();

		// {
//		Employee e = new Employee(3, "Pavan", 5_00_000, "pavan@gamil.com");
//		Employee e1 = new Employee(4, "Anand", 6_00_000, "anad@gamil.com");   // for adding the data into data base 
//		Employee e2 = new Employee(5, "HK", 7_00_000, "hk@gamil.com");
//		
//		session.save(e);
//		session.save(e1);
//		session.save(e2);
        // } 
		
		
		
		//   getting data from database 
		
//		     Employee e = session.get(Employee.class, 2);
//		     
//		     System.out.println(e);
//		        
		 // 
		     
		 //    for updating data in the database  
//		     Employee e = session.get(Employee.class, 2);
//		     
//		     e.setSalary(10_00_000);
//		       
//		      session.update(e);
//		     
		  //
		
		// for deleting data from database
		
//		 Employee e = session.get(Employee.class, 2);
//	      
//	      session.delete(e);
//		
		
		// to get all the data from database
		
//		    Query query = session.createQuery("from Employee e");
//		    
//		       List list = query.getResultList();
//		       
//		       for(Object o : list)
//		       {
//		    	   System.out.println(o);
//		    	   
//		       }
		       
		       // update someone data based on given condition
		
		
		// update employee salary based on condition

		Transaction t = session.beginTransaction();

		Query query = session.createQuery(
		        "update Employee1 e set e.salary = e.salary + 5000 where e.salary > 600000"
		);

		int n = query.executeUpdate();

		System.out.println(n);

		t.commit();
	}

}
