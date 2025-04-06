package com.code.hb;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.code.entity.Orders;
import com.code.entity.Role;
import com.code.entity.Users;
public class CreateOrders {
private SessionFactory sessionFactory=null;
public CreateOrders(SessionFactory sessionFactory)
{
	//set the Object
	this.sessionFactory=sessionFactory;
	//Session object using SessionFactory object
	Session session=sessionFactory.getCurrentSession();
	// start the transaction
	session.beginTransaction();
	//create object for Users
	int usersid=1;
	Users users=session.get(Users.class,usersid);
	if(users==null) {
		System.out.println("Sorry no record found with id"+usersid);
		return;
	}
	// Create users
    Users user1 = new Users("Priya", "priya123", "priya@gmail.com", Role.ADMIN);
    Users user2 = new Users("Raj", "raj123", "raj@gmail.com", Role.CUSTOMER);
    Users user3 = new Users("Rahul", "rahul123", "rahul@gmail.com", Role.CUSTOMER);

    session.persist(user1);
    session.persist(user2);
    session.persist(user3);
	
	System.out.println("Name:"+users.getUsername());
	System.out.println("Password:"+users.getPassword());
	System.out.println("Email:"+users.getEmail());
	System.out.println("Role:"+users.getRole());
	//Orders
	Orders orders1=new Orders("5-02-2025",40000,user1);
	//save the object
	session.persist(orders1);
	Orders orders2 =new Orders("4-01-2025",2000,user2);
//save the object
      session.persist(orders2);
    Orders orders3=new Orders("20-12-2024",50000,user3);
      
//save the object
session.persist(orders3);

	//commit
	session.getTransaction().commit();
	//close the session
	session.close();
	//message
	System.out.println("Orders are created successfully");
	
}
}

