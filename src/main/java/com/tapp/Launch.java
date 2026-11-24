package com.tapp;

import java.util.List;
import java.util.ListIterator;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg = new Configuration();
		
		cfg.configure();
		
		cfg.addAnnotatedClass(Employee.class);
		cfg.addAnnotatedClass(Project.class);
		
		Session session = cfg.buildSessionFactory().openSession();
		
		Transaction t = session.beginTransaction();
		
		                                // CRUD operations
		
		
		
		// adding data to database
		
		
		// employees ready
//		Employee raj = new Employee(1,"Raj");
//		Employee kumar = new Employee(2,"Kumar");
//		
//		//projects ready
//		Project googleDoc = new Project(1,"Google_Doc");
//		Project googleSlides = new Project(2,"Google_Slides");
//		
//		ArrayList<Project> al1 = new ArrayList<Project> ();
//		al1.add(googleDoc);
//		al1.add(googleSlides);
//		
//		raj.setProject(al1);
//		kumar.setProject(al1);
//		
//		session.save(raj);
//		session.save(kumar);
//		session.save(googleDoc);
//		session.save(googleSlides);
		
		
	               	//  getting data from database
		
//		 Employee raj = session.get(Employee.class,1);
//		 
//		 
//		 
//		 
//		// System.out.println(raj.getId()+" "+raj.getEmployeeName());  // or
//		 
//		 List<Project> p = raj.getProject();
//		 
//		 //System.out.println(p);
//		 
//		 
//		 
//		 //for loop to access
//		 for(Object o : p)
//		 {
//			 System.out.println(o);
//		 }                                  // enhanced for loop
//		 
//		 System.out.println(raj);
//		 
//		 
//		 
//		 
//		 // Iterator 
//		 
//		 Iterator<Project> it = p.iterator();
//		 
//		 while(it.hasNext())                                // Iterator
//		 {
//			 System.out.println(it.next());
//		 }
		
//		Project googleSlide = session.get(Project.class, 2);
//	
//      	List<Employee> emp = googleSlide.getEmployees();
//		
//		System.out.println(emp);  // normal 
		
      	
      	
      	
      	// Enhanced for loop 
//		for(Object o : emp)
//		{
//			System.out.println(o);
//		}
		
		// List Iterator 
		
//		 ListIterator<Employee> ltr = emp.listIterator(emp.size());
//		 
//		 while(ltr.hasPrevious())
//		 {                                                               // list iterator
//			 System.out.println(ltr.previous());
//		 }
//		 
      	
      	
      	   // delete the data
      	
//      	Employee raj = session.get(Employee.class, 1);
//      	
//      	session.delete(raj);
		
		
//		Project googleSlide = session.get(Project.class, 2);
//		session.delete(googleSlide);
//		
//		
		 Employee raj = session.get(Employee.class,1);
		 
		 System.out.println(raj);
		  
		
		session.persist(t);
		
		
		
		t.commit();

	}
  
}
