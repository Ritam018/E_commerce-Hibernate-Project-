package com.code.hb;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.code.entity.Role;
import com.code.entity.Users;
public class CreateUsers {
private SessionFactory sessionFactory=null;
public CreateUsers(SessionFactory sessionFactory)
{
	//set the Object
	this.sessionFactory=sessionFactory;
	//Session object using SessionFactory object
	Session session=sessionFactory.getCurrentSession();
	// start the transaction
	session.beginTransaction();
	//Users
	Users user1=new Users("Priya","priabcd123","priya4567@gmail.com",Role.ADMIN);
	//save the object
	session.persist(user1);
	Users user2 =new Users("Raj","raj12345","raj123@gmail.com",Role.CUSTOMER);
    //save the object
      session.persist(user2);
     Users user3=new Users("Rahul","rahul1234","rahul@gmail.com",Role.CUSTOMER);
    //save the object
      session.persist(user3);
	//commit
	session.getTransaction().commit();
	//close the session
	session.close();
	//message
	System.out.println("Users are created successfully");
	
}
}

