package com.tap;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LaunchCustomer {

	public static void main(String[] args) {
		
		  Configuration cfg=  new Configuration();
		  
		  cfg.configure();
		  
		  cfg.addAnnotatedClass(Customer.class);
		  cfg.addAnnotatedClass(CustomerDetails.class);
		  cfg.addAnnotatedClass(Orders.class);
		  
		//SessionFactory sessionFactory = cfg.buildSessionFactory();      orrrrr
		//Session session = sessionFactory.openSession();
		  
		  Session session = cfg.buildSessionFactory().openSession();
		  
		    Transaction t = session.beginTransaction();
		    
		    
		                         //  curd operations  //
		    
		    // adding data
		    
//		    Customer ram = new Customer(7, "Ram");
//		    CustomerDetails cd = new CustomerDetails(107, "SilkBoard", 34234224, "ram@gamil.com");
//		    ram.setCustomerDetails(cd);
//		    
//		    
//		   Orders order1 = new Orders(507, "veg_manchurian", 150);
//		   Orders order2 = new Orders(508, "gulab_jamun", 50);
//		   Orders order3 = new Orders(509, "parota", 80);
//		   
//         //		   Customer c1 = session.get(Customer.class, 4);
//         //		   
//         //		   order1.setCustomer(c1);               // customer already exist use like this 
//         //		   order2.setCustomer(c1);
//         //		   order3.setCustomer(c1);
//		   
//		   order1.setCustomer(ram);
//		   order2.setCustomer(ram);
//		   order3.setCustomer(ram);
//		   
//		   session.save(order1);
//		   session.save(order2);
//		   session.save(order3);
//		   
		    
		  // getting data
		   
		           // getting data in unidirection from orders to customer 
		    
//		    Orders o1 = session.get(Orders.class, 501);
//		    
//		    System.out.println(o1);
//		    
//		    Customer c = o1.getCustomer();             // 501 Noodles 100
//		                                               // 3 Hari
//		                                               //  103 Benglore 628162 h@gmail.com
//		                                               //   3 Hari103 Benglore 628162 h@gmail.com501 Noodles 100
//		    
//		    System.out.println(c);
//		    
//		    CustomerDetails cd = c.getCustomerDetails();
//		    
//		    System.out.println(cd);
//		    
//		    System.out.println(c +" "+cd+" "+o1);
//		    
		    
		    
		    
		          // getting data from orders  through customer (bidirectional)
//		   Customer c = session.get(Customer.class, 3);
//		   
//		   System.out.println(c);
//		   
//		   List<Orders> li = c.getOrders();
//		   
//		   for(Object o : li)
//		   {
//			   System.out.println(o);
//		   }
		   
		   
		   
		      // deleting data 
		   
		   Orders c = session.get(Orders.class, 508);
		   
		   
		   System.out.println(c);
		   //session.delete(c);
		   
		   
		   
		   
		     
		  
		    
		    
		    t.commit();

	}

}


