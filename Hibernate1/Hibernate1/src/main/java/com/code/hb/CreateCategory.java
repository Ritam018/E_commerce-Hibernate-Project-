package com.code.hb;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.code.entity.Category;
public class CreateCategory {
private SessionFactory sessionFactory=null;
public  CreateCategory(SessionFactory sessionFactory)
{
	//set the object
	this.sessionFactory=sessionFactory;
	Session session=sessionFactory.getCurrentSession();
	//start transaction
	session.beginTransaction();
	//create object for Category 
	Category category=new Category("Electronics","Devices and gadgets");		
	//save the object
	session.persist(category);
	//object of Category
	category =new Category("Self-care items","Shampoos");
//save the object
      session.persist(category);
    //object of Category
     category=new Category("Home appliances","Entertainment");    
//save the object
session.persist(category);

	//commit
	session.getTransaction().commit();
	//close the session
	session.close();
	//message
	System.out.println("Category is created successfully");
	
}
}

